package Bai1;

import java.util.Scanner;

public class CaSyNoiTieng extends CaSy{
    protected final int luongCung = 5000000;
    protected final int giaTriDia = 1200;
    protected final int giaShow = 500000;

    protected int soGameshow;

    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n==========================");
        System.out.println("---Nhap Ca Sy noi tieng---");
        super.nhap();
        System.out.print("Nhap so GameShow ca si da tham gia: ");
        this.soGameshow = scanner.nextInt();
        tinhLuong();
    }

    public int getSoGameshow() {
        return soGameshow;
    }

    public void setSoGameshow(int soGameshow) {
        this.soGameshow = soGameshow;
    }

    public void tinhLuong(){
        this.luong = luongCung+500000*this.soNamLamViec+this.giaTriDia+giaShow*this.soBuoiTrinhDien+500000*this.soGameshow;
        this.setLuong(this.luong);
    }
    public void xuat(){
        super.xuat();
        System.out.print("-Luong: "+this.getLuong());
    }
}
