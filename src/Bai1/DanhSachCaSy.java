package Bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSachCaSy extends CaSy{
    public List<CaSy> danhSach;

    public DanhSachCaSy(){
        this.danhSach = new ArrayList<>();
    }

    public void nhap(){
        Scanner scanner = new Scanner(System.in);
      
        while (true) {
            System.out.println("\n*******************");
            System.out.println("1. Nhap ca sy noi tieng");
            System.out.println("2. Nhap ca sy chua noi tieng");
            System.out.println("3. Xuat danh sach ca sy");
            System.out.println("4. Tim ca sy luong cao nhat");
            System.out.println("5. Thoat");
            System.out.print("--Nhap lua chon: ");
            int key = scanner.nextInt();
            if (key == 1) {
                CaSy a = new CaSyNoiTieng();
                a.nhap();
                danhSach.add(a);
            }else if(key == 2){
                CaSy a = new CaSyThuong();
                a.nhap();
                danhSach.add(a);
            }else if(key == 3){
                for(CaSy a:this.danhSach){
                    a.xuat();
                }
            }else if(key == 4){
                CaSy nguoiLuongCaoNhat = danhSach.get(0);
                for (CaSy caSy : danhSach) {
                    if (caSy.getLuong() > nguoiLuongCaoNhat.getLuong()) {
                        nguoiLuongCaoNhat = caSy;
                    }
                }
            }else if(key == 5){
                break;
            }
            
        }
  
    }
}
