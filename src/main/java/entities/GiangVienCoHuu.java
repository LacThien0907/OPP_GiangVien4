package entities;

import java.util.Scanner;

public class GiangVienCoHuu extends GiangVien{
    int luongThoaThuan;

    public GiangVienCoHuu() {
    }

    public GiangVienCoHuu(int luongThoaThuan) {
        this.luongThoaThuan = luongThoaThuan;
    }

    @Override
    public void fromConsole(Scanner sc) {
        super.fromConsole(sc);

        System.out.print("Nhap luong thoa thuan: ");
        this.luongThoaThuan = Integer.parseInt(sc.nextLine());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GiangVienCoHuu{");
        super.extracted(sb);
        sb.append("luongThoaThuan=").append(luongThoaThuan);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int Salary() {
        final int soGioDayQuyDinh = 40;
        final int mucLuongMotGioDayCoHuu = 200000;
        return (soGioDayTrongThang > soGioDayQuyDinh) ? ((soGioDayTrongThang - soGioDayQuyDinh) * mucLuongMotGioDayCoHuu + luongThoaThuan) : luongThoaThuan;
    }
}
