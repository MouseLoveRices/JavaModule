package khachhang;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSachKhachHang {
    private List<KhachHang> arr; 

    public DanhSachKhachHang(){
        this.arr = new ArrayList<>();
    }
    
    public void nhapKhachHang(){
        Scanner scanner = new Scanner(System.in);
        int key = 1;
        while (true){
            System.out.println("--Chon Dich Vu--");
            System.out.println("1.Non-Member");
            System.out.println("2.Basic");
            System.out.println("3.Premium");
            System.out.println("4.Thoat");
            key = scanner.nextInt();
            KhachHang a;
            if(key == 1){
                a = new KhachHangNonMember();
            }else if(key == 2){
                a= new KhachHangNonMember();
            }else if (key ==3) {
                a= new KhachHangPremium();
            }else{
                break;
            }
            a.nhapKhachHang();
            arr.add(a);
        }
    }
}
