package docgia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSachDocGia {
    private List<DocGia> arr;

    public DanhSachDocGia(){
        this.arr = new ArrayList<>();
    }

    public void nhap(){
        int flag =1;
        System.out.println("1.Nhap doc gia tre em");
        System.out.println("2.Nhap doc gia nguoi lon");
        System.out.println("3.Thoat");
        System.out.println("================================");

        while (true) {
            System.out.println("-Nhap lua chon-");
            Scanner scanner = new Scanner(System.in);
            flag = scanner.nextInt();

            DocGia a;
            if(flag == 1){
                a = new DocGiaTreEm();
            }else if(flag == 2){
                a = new DocGiaNguoiLon();
            }else{
                break;
            }
            a.nhap();
            arr.add(a);

        }
        
    }

    public void xuat(){
        for(DocGia d : this.arr){
            d.xuat();
        }
    }

    public float tinhTongTien(){
        float tong = 0;
        for(DocGia d : this.arr){
            tong+=d.tinhTien();
        }
        System.out.print("Tong so tien = "+tong);
        return tong;
    }


}
