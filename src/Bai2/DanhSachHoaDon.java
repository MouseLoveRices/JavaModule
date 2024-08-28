package Bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSachHoaDon {
    protected List<HoaDon> hoaDon;

    public DanhSachHoaDon(){
        this.hoaDon = new ArrayList<>();
    }

    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n==================");
            System.out.println("1.Ho dan thuong");
            System.out.println("2.Ho kinh doanh");
            System.out.println("3.Ho kinh doanh nha nuoc");
            System.out.println("4.Xem danh sach cac ho");
            System.out.println("5.Tong tien dien cua cac ho");
            System.out.println("6.Thoat");
            System.out.print("--Nhap lua chon : ");
            int key = scanner.nextInt();
            if(key == 1){
                HoaDon a= new HoaDonThuong();
                a.nhap();
                hoaDon.add(a);
            }else if(key == 2 ){
                HoaDon a = new HoaDonKinhDoanh();
                a.nhap();
                hoaDon.add(a);
            }else if (key == 3) {
                HoaDon a = new HoaDonKinhDoanhNhaNuoc();
                a.nhap();
                hoaDon.add(a);
            }else if(key == 4){
                System.out.println("------------------------");
                for(HoaDon a:this.hoaDon){                  
                    a.xuat();
                }
            }else if(key == 5){
                double tongTienDien = hoaDon.stream()
                        .mapToDouble(HoaDon::tongTienDien)
                        .sum();
                System.out.println("------------------------");
                System.out.println("Tong tien dien cua cac ho la: " + tongTienDien);
            }
        }
    }
}
