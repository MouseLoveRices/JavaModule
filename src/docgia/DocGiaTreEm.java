package docgia;

import java.util.Scanner;

public class DocGiaTreEm extends DocGia{
    private String tenNBH;

    public DocGiaTreEm(){
        this.setGia(5000);
    }

    @Override
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten nguoi bao ho: ");
        this.tenNBH = scanner.nextLine();    
        super.nhap(); 
    }

    @Override
    public void xuat(){
        System.out.println("-----Doc Gia Tre Em-----");
        System.out.print("Ten nguoi bao ho: "+ this.tenNBH);
        super.xuat();
        System.out.print("Gia moi thang: "+ this.getGia());
    }
   
    @Override
    public float tinhTien(){
        return getSoThang()*getGia();
    }

    public String getTenNBH() {
        return tenNBH;
    }

    public void setTenNBH(String tenNBH) {
        this.tenNBH = tenNBH;
    }

    
}
