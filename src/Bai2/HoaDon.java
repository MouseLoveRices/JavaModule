package Bai2;

import java.util.Scanner;

public abstract class HoaDon {
    protected final float thueGTGT=(float) 0.1;
    protected int maKh;
    protected String tenKh;
    protected float soCu;
    protected float soMoi;
    protected float soTien;
    protected float soKWtieuThu;
    protected float tienDien;

    public HoaDon(){

    }

    public HoaDon(int maKh, String tenKh, float soCu, float soMoi, float soTien, float soKWtieuThu) {
        this.maKh = maKh;
        this.tenKh = tenKh;
        this.soCu = soCu;
        this.soMoi = soMoi;
        this.soTien = soTien;
        this.soKWtieuThu = soKWtieuThu;
    }

    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("-Nhap ma khach hang: ");
        this.maKh = scanner.nextInt();
        scanner.nextLine();
        System.out.print("-Nhap ten khach hang: ");
        this.tenKh = scanner.nextLine();
        System.out.print("-Nhap chi so cu: ");
        this.soCu = scanner.nextFloat();
        System.out.print("-Nhap chi so moi: ");
        this.soMoi = scanner.nextFloat();
        tinhSoKwTieuThu();
    }

    public void xuat(){       
        System.out.println("----------------------------");
        System.out.println("maKh | tenKh          | so cu | so moi | so kw tieu thu | thanh toan");
        System.out.println(this.maKh +"      "+ this.tenKh +"   "+this.soCu+"    "+this.soMoi+"      "+this.soKWtieuThu+"              "+this.soTien);
    }


    public abstract float tongTienDien();
    

    public float getTienDien() {
        return tienDien;
    }

    public void setTienDien(float tienDien) {
        this.tienDien = tienDien;
    }

    public void tinhSoKwTieuThu(){
        this.soKWtieuThu=this.soMoi-this.soCu;
        setSoKWtieuThu(this.soKWtieuThu);
    }

    public int getMaKh() {
        return maKh;
    }

    public void setMaKh(int maKh) {
        this.maKh = maKh;
    }

    public String getTenKh() {
        return tenKh;
    }

    public void setTenKh(String tenKh) {
        this.tenKh = tenKh;
    }

    public float getSoCu() {
        return soCu;
    }

    public void setSoCu(float soCu) {
        this.soCu = soCu;
    }

    public float getSoMoi() {
        return soMoi;
    }

    public void setSoMoi(float soMoi) {
        this.soMoi = soMoi;
    }

    public float getSoTien() {
        return soTien;
    }

    public void setSoTien(float soTien) {
        this.soTien = soTien;
    }

    public float getSoKWtieuThu() {
        return soKWtieuThu;
    }

    public void setSoKWtieuThu(float soKWtieuThu) {
        this.soKWtieuThu = soKWtieuThu;
    }

    
    
}
