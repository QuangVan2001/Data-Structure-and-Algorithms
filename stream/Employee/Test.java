package stream.Employee;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Van", "Pham", 50000.0, List.of("Project 1", "Project 2")));
        employees.add(new Employee("Tung", "Pham", 60000.0, List.of("Project 3", "Project 2")));
        employees.add(new Employee("Lam", "Nguyen", 70000.0, List.of("Project 5", "Project 3")));
        employees.add(new Employee("Khanh", "Tran", 80000.0, List.of("Project 1", "Project 4")));



        Set<Employee> updatedEmployee= employees.stream()
                .map(employee -> new Employee(
                        employee.getFirstName(),
                        employee.getLastName(),
                        employee.getSalary() * 1.10,
                        employee.getProjects()
                ))
                .collect(Collectors.toSet());

        System.out.println(updatedEmployee);
        System.out.println();
        //filter
        List<Employee> employeeFilter = employees.stream()
                .filter(employee -> employee.getSalary() > 60000)
                .map(employee -> new Employee(
                        employee.getFirstName(),
                        employee.getLastName(),
                        employee.getSalary() * 1.10,
                        employee.getProjects()
                ))
                .collect(Collectors.toList());
        System.out.println(employeeFilter);


        System.out.println();

        //findFirst
        Employee firstEmployee = employees
                .stream()
                .filter(employee -> employee.getSalary() > 60000)
                .map(employee -> new Employee(
                        employee.getFirstName(),
                        employee.getLastName(),
                        employee.getSalary() * 1.10,
                        employee.getProjects()
                ))
                .findFirst()
                .orElse(null);
        System.out.println(firstEmployee);

        System.out.println();

        //flatMap
        String projects =  employees.stream()
                .map(employee -> employee.getProjects())
                .flatMap(strings ->strings.stream())
                .collect(Collectors.joining(","));
        System.out.println(projects);

        System.out.println();

        //short Circuit operation
        List<Employee> shortCircuit = employees.stream()
                .skip(1)
                .limit(2)
                .collect(Collectors.toList());

        System.out.println(shortCircuit);

        System.out.println();
        //Finite Data
        Stream.generate(Math::random)
                .limit(5)
                .forEach(System.out::println);
        System.out.println();
        //sorting
        List<Employee> sortedEmployee = employees.stream()
                .sorted((o1,o2) -> o1.getFirstName()
                        .compareToIgnoreCase(o2.getFirstName()))
                .collect(Collectors.toList());
        System.out.println(sortedEmployee);

        System.out.println();
        //min or max
        Employee max = employees.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .orElseThrow(NoSuchElementException::new);
        System.out.println(max);
        System.out.println();
        //reduce
        Double totalSal = employees.stream()
                .map(employee ->employee.getSalary())
                .reduce(0.0, Double::sum);
        System.out.println(totalSal);

    }
}
