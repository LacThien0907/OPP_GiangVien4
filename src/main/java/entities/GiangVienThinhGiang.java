package entities;

import java.util.Scanner;

public class GiangVienThinhGiang extends GiangVien{
    String coQuan;

    public GiangVienThinhGiang() {
    }

    public GiangVienThinhGiang(String coQuan) {
        this.coQuan = coQuan;
    }

    @Override
    public void fromConsole(Scanner sc) {
        super.fromConsole(sc);

        System.out.print("Nhap co quan: ");
        this.coQuan = sc.nextLine();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GiangVienThinhGiang{");
        sb.append("coQuan='").append(coQuan).append('\'');
        super.extracted(sb);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int Salary() {
        final int mucLuongMotGioDayThinhGiang = 20000;
        return soGioDayTrongThang * mucLuongMotGioDayThinhGiang;
    }
}
