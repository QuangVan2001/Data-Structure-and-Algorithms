package codilities;

import java.util.Stack;

public class Bracket {
    public int solution(String S){
        Stack<String> stack = new Stack<>();
        for(int i = 0; i < S.length(); i++){
            String ch = S.substring(i, i+1);
            if(ch.equals("(") || ch.equals("[") || ch.equals("{")){
                stack.push(ch);
            } else{
                if(stack.isEmpty()){
                    return 0;
                }
                if(ch.equals(")")){
                    if(!stack.pop().equals("(")){
                        return 0;
                    }
                }
                if(ch.equals("]")){
                    if(!stack.pop().equals("[")){
                        return 0;
                    }
                }
                if(ch.equals("}")){
                    if(!stack.pop().equals("{")){
                        return 0;
                    }
                }
            }
        }
        if(!stack.isEmpty()){
            return 0;
        }
        return 1;
    }

    public int solutions2(String S){
        Stack<String> stack = new Stack<>();
        for(int i = 0; i < S.length(); i++){
            String ch = S.substring(i, i+1);
            if(ch.equals("(") || ch.equals("[") || ch.equals("{")){
                stack.push(ch);
            } else{
                if(stack.isEmpty()){
                    return 0;
                }
                if(ch.equals(")")){
                    if(!stack.pop().equals("(")){
                        return 0;
                    }
                }
                if(ch.equals("}")){
                    if(!stack.pop().equals("{")){
                        return 0;
                    }
                }
                if(ch.equals("]")){
                    if(!stack.pop().equals("[")){
                        return 0;
                    }
                }
            }
        }
        if(!stack.isEmpty()){
            return 0;
        }
        return 1;
    }


    public static void main(String[] args) {
        //System.out.println(new codilities.Bracket().solutions2("{[()()]}"));
        System.out.println(new Bracket().solutions2("([)()]"));

    }
}
