package docgia;

import java.util.Scanner;

public abstract class DocGia {
    private int soThang;
    private float gia;

    public DocGia() {
    }

    public DocGia(int soThang, float gia) {
        this.soThang = soThang;
        this.gia = gia;
    }

    public int getSoThang() {
        return soThang;
    }

    public void setSoThang(int soThang) {
        this.soThang = soThang;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so thang");
        this.soThang = scanner.nextInt();
    }

    public void xuat(){
        System.out.println("So thang: "+ this.soThang);
    }

    abstract public float tinhTien();
    
}
