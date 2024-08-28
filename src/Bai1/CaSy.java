package Bai1;

import java.util.Scanner;

public class CaSy {
    protected String hoTen;
    protected int soNamLamViec;
    protected int soDiaBanDuoc;
    protected int soBuoiTrinhDien;
    protected int luong;

    public CaSy(){

    }

    public CaSy(String hoTen, int soNamLamViec, int soDiaBanDuoc, int soBuoiTrinhDien, int luong) {
        this.hoTen = hoTen;
        this.soNamLamViec = soNamLamViec;
        this.soDiaBanDuoc = soDiaBanDuoc;
        this.soBuoiTrinhDien = soBuoiTrinhDien;
        this.luong = luong;
    }

    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten ca sy: ");
        this.hoTen = scanner.nextLine();
        System.out.print("Nhap so nam lam viec: ");
        this.soNamLamViec = scanner.nextInt();
        System.out.print("So dia ban duoc: ");
        this.soDiaBanDuoc = scanner.nextInt();
        System.out.print("So buoi trinh dien: ");
        this.soBuoiTrinhDien = scanner.nextInt();
    }

    public void xuat(){
        System.out.println("\n------------------------------");
        System.out.println("-Ten ca sy: "+this.hoTen);
        System.out.println("-So nam lam viec: "+this.soNamLamViec);
        System.out.println("-So dia ban duoc: "+this.soDiaBanDuoc);
        System.out.println("-So buoi trinh dien: "+this.soBuoiTrinhDien);
        
    }


    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getSoNamLamViec() {
        return soNamLamViec;
    }

    public void setSoNamLamViec(int soNamLamViec) {
        this.soNamLamViec = soNamLamViec;
    }

    public int getSoDiaBanDuoc() {
        return soDiaBanDuoc;
    }

    public void setSoDiaBanDuoc(int soDiaBanDuoc) {
        this.soDiaBanDuoc = soDiaBanDuoc;
    }

    public int getSoBuoiTrinhDien() {
        return soBuoiTrinhDien;
    }

    public void setSoBuoiTrinhDien(int soBuoiTrinhDien) {
        this.soBuoiTrinhDien = soBuoiTrinhDien;
    }

    public int getLuong() { 
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    

    
}
