package top5Algorithm;

import java.util.Date;
import java.util.Scanner;

public class top {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ngay (1-7)");
        int ngay = sc.nextInt();

        if (ngay == 1) {
            System.out.println("Ngày " + ngay + " là Chủ Nhật");
        } else if (ngay == 2) {
            System.out.println("Ngày " + ngay + " là Thứ Hai");
        } else if (ngay == 3) {
            System.out.println("Ngày " + ngay + " là Thứ Ba");
        } else if (ngay == 4) {
            System.out.println("Ngày " + ngay + " là Thứ Tư");
        } else if (ngay == 5) {
            System.out.println("Ngày " + ngay + " là Thứ Năm");
        } else if (ngay == 6) {
            System.out.println("Ngày " + ngay + " là Thứ Sáu");
        } else if (ngay == 7) {
            System.out.println("Ngày " + ngay + " là Thứ Bảy");
        } else {
            System.out.println("Ngày không hợp lệ. Nhập ngày từ 1 đến 7.");
        }

    }
}
