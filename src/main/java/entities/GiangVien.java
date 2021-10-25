package entities;

import java.util.Scanner;

public class GiangVien {
    String ten, email, diaChi;
    int soDienThoai, soGioDayTrongThang;

    public GiangVien() {
    }

    public GiangVien(String ten, String email, String diaChi, int soDienThoai, int soGioDayTrongThang) {
        this.ten = ten;
        this.email = email;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.soGioDayTrongThang = soGioDayTrongThang;
    }

    // NHAP
    public void fromConsole (Scanner sc){
        System.out.print("Nhap ten: ");
        this.ten = sc.nextLine();

        System.out.print("Nhap email: ");
        this.email = sc.nextLine();

        System.out.print("Nhap dia chi: ");
        this.diaChi = sc.nextLine();

        System.out.print("Nhap so dien thoai: ");
        this.soDienThoai = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap so gio day trong thang: ");
        this.soGioDayTrongThang = Integer.parseInt(sc.nextLine());
    }

    // XUAT
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GiangVien{");
        extracted(sb);
        sb.append('}');
        return sb.toString();
    }

    public void extracted(StringBuilder sb) {
        sb.append("ten='").append(ten).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", diaChi='").append(diaChi).append('\'');
        sb.append(", soDienThoai=").append(soDienThoai);
        sb.append(", soGioDayTrongThang=").append(soGioDayTrongThang);
    }

    // TONG LUONG

    public int Salary(){
        return 0;
    }
}
