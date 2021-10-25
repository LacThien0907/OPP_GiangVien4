import entities.GiangVien;
import entities.GiangVienCoHuu;
import entities.GiangVienThinhGiang;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so luong giang vien: ");
        int n = Integer.parseInt(sc.nextLine());

        //
        GiangVien[] list = new GiangVien[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Giang vien thu " + (i + 1));
            System.out.print("Nhap loai giang vien (0.Giang vien Co Huu/1. Giang vien vien Thinh Giang: ");
            int type = Integer.parseInt(sc.nextLine());

            if (type == 0) {
                list[i] = new GiangVienCoHuu();
            } else if (type == 1) {
                list[i] = new GiangVienThinhGiang();
            }
            list[i].fromConsole(sc);
        }

        for (GiangVien gv : list) {
            System.out.println(gv);
        }

        int sumSalaryCoHuu = 0;
        for (GiangVien gv : list) {
            if (gv instanceof GiangVienCoHuu) {
                sumSalaryCoHuu += gv.Salary();
                System.out.println(gv);
            }
        }

        int sumSalaryThinhGiang = 0;
        for (GiangVien gv : list) {
            if ( gv instanceof GiangVienThinhGiang){
                sumSalaryThinhGiang += gv.Salary();
                System.out.println(gv);
            }
        }

        int sumSalary = 0;
        for (GiangVien gv : list){
            sumSalary += gv.Salary();
        }
        System.out.println("Tong luong giao vien " + sumSalary);

        if (sumSalaryCoHuu > sumSalaryThinhGiang){
            System.out.println("Giảng viên CO HUU có tổng lương cao nhất.`");
        }else {
            System.out.println("Giảng viên THINH GIANG có tổng lương cao nhất.");
        }




    }
}
