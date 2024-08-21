package docgia;

import java.util.Scanner;

public class DocGiaNguoiLon extends DocGia {
    private String cccd;
    
    public DocGiaNguoiLon(){
        this.setGia(10000);
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    @Override
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so can cuoc: ");
        this.cccd = scanner.nextLine();    
        super.nhap(); 
    }

    @Override
    public void xuat(){
        System.out.println("-----Doc Gia Nguoi Lon-----");
        System.out.println("So can cuoc: "+this.cccd);
        super.xuat();
        System.out.println("Gia moi thang: "+ this.getGia());
    }
    
    @Override
    public float tinhTien(){
        return getSoThang()*getGia();
    }
}
