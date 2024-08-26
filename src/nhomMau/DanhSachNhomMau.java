package nhomMau;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public  class DanhSachNhomMau {
    private List<NhomMau> arr;

    public DanhSachNhomMau(){
        this.arr = new ArrayList<>();
    }
    
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("=================");
        System.out.print("Nhap so luong nguoi : ");
        int count = scanner.nextInt();
        for(int i =1; i<=count; i++){
            System.out.println("-Chon nhom mau nguoi thu "+i+":");
            System.out.println("1.A");
            System.out.println("2.B");
            System.out.println("3.AB");
            System.out.println("4.O");
            System.out.print("Chon nhom mau: ");
            int flag = scanner.nextInt();
            if(flag==1){
                NhomMau a = new NhomMauA();
                a.nhap();
                this.arr.add(a);
            }else if(flag == 2){
                NhomMau a = new NhomMauB();
                a.nhap();
                this.arr.add(a);
            }else if(flag == 3){
                NhomMau a = new NhomMauAB();
                a.nhap();
                this.arr.add(a);
            }else if(flag == 4){
                NhomMau a = new NhomMauO();
                a.nhap();
                this.arr.add(a);
            }
        }
    }
    public void xuat(){
        for(NhomMau a: this.arr){
            a.xuat();
        }
    }
    public void xetNghiem(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n===================");
        System.out.print("-Chon nhom mau cha: ");
        String mauCha = scanner.nextLine();
        if (mauCha == "A") {
            NhomMau a= new NhomMauA();
            a.nhap();
            this.arr.add(a);
        }else if(mauCha == "B"){
            NhomMau a = new NhomMauB();
            a.nhap();
            this.arr.add(a);
        }else if(mauCha == "B"){
            NhomMau a = new NhomMauAB();
            a.nhap();
            this.arr.add(a);
        }else if(mauCha == "O"){
            NhomMau a = new NhomMauO();
            a.nhap();
            this.arr.add(a);
        }

        System.out.print("-Chon nhom mau me: ");
        String mauMe = scanner.nextLine();
        if (mauMe == "A") {
            NhomMau a= new NhomMauA();
            a.nhap();
            this.arr.add(a);
        }else if(mauMe == "B"){
            NhomMau a = new NhomMauB();
            a.nhap();
            this.arr.add(a);
        }else if(mauMe == "B"){
            NhomMau a = new NhomMauAB();
            a.nhap();
            this.arr.add(a);
        }else if(mauMe == "O"){
            NhomMau a = new NhomMauO();
            a.nhap();
            this.arr.add(a);
        }

        System.out.print("-Chon nhom mau con: ");
        String mauCon = scanner.nextLine();
        if (mauCon == "A") {
            NhomMau a= new NhomMauA();
            a.nhap();
            this.arr.add(a);
        }else if(mauCon == "B"){
            NhomMau a = new NhomMauB();
            a.nhap();
            this.arr.add(a);
        }else if(mauCon == "B"){
            NhomMau a = new NhomMauAB();
            a.nhap();
            this.arr.add(a);
        }else if(mauCon == "O"){
            NhomMau a = new NhomMauO();
            a.nhap();
            this.arr.add(a);
        }

        if(mauCha=="A"&&mauMe=="A"&&(mauCon=="A" || mauCon=="O")){
            System.out.println("La con ruot");
        }
    }

    public void cau3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chon mot nguoi de nhan mau");
        int index = scanner.nextInt();
        for (int i=1; i<=arr.size(); i++){
            if(i != index){
                if(this.arr.get(i).kiemTraChoNhan(this.arr.get(index))){
                    System.out.println("Ban thu "+i+" co the cho mau ban thu "+index);
                }
            }
        }
    }

}
