import java.util.InputMismatchException;
import java.util.Scanner;

public class test {   
   
    public static void sumInteger(){
        // Scanner scanner = new Scanner(System.in);
        Scanner sc=new Scanner(System.in);

        System.out.println("Nhap so thu nhat");
        int a = sc.nextInt();
        System.out.println("Nhap so thu hai");
        int b= sc.nextInt();
        sc.nextLine(); // xoa bo nho dem de co the nhap thong tin vao dong duoi
        System.out.println("Nhap thong tin");
        String name= sc.nextLine();
        System.out.println("ten ban la: "+name);
        System.out.println("Tong hai so la: " + a+b );
        sc.close();
    }
    public static void epKieu(){
        // Ep kieu
        int a=2,b=3;
        System.out.println("a+b="+(a+b));
        System.out.println("a-b="+(a-b));
        System.out.println("axb="+(a*b));
        System.out.println("a%b="+(a%b));
        System.out.println("a/b="+(float)a/b);
        System.out.println("a/b="+a/(float)b);
        System.out.println("a/b="+a/(double)b);
        System.out.println("a/b="+a*1.0/b);
        System.out.println("a/b="+a/(b*1.0));
    }

    public static void nhapThongTin(){
        Scanner sc=new Scanner(System.in);

        System.out.print("\nNhap Ten: ");
        String name = sc.nextLine();
        int age;
        boolean flag = false;
        while (!flag) {
            try{
            System.out.print("Nhap tuoi: ");
            age = sc.nextInt();
            System.out.println("Tuoi: "+age);
            flag =true;
        }catch(InputMismatchException e){
            System.out.print("Nhap mot so hop le \n");
            sc.next(); // xoa du lieu khong hop le
        }
        }
        
        System.out.print("Nhap chieu cao:");
        double height = sc.nextDouble();

        System.out.print("--Ten ban la: "+name+"\n");
        System.out.print("--Chieu cao ban la: "+height+" m");

        sc.close();
    }
    // viet phuong thuc cho biet cung hoang dao
    public static void cungHoangDao(){
        Scanner cs = new Scanner(System.in);
        int date,month;
        boolean flag= false;

        while (!flag) {
            try {
                System.out.println("\nNhap ngay sinh");
                date = cs.nextInt();
                System.out.println("Nhap thang sinh");
                month = cs.nextInt();
                cs.nextLine();
                System.out.println("Ngay sinh va thang sinh cua ban la: "+date+"/"+month);
                
        if(month == 1){
            if(date>0 && date <20){
                System.out.println("Ban la Ma Ket");
            }else if(date>=20 && date<=31){
                System.out.println("Ban la Bao Binh");
            }
        }else if(month==2){
            if(date>0 && date <19){
                System.out.println("Ban la Bao Binh");
            }else if(date>=19 && date<=29){
                System.out.println("Ban la Song Ngu");
            }
        }else if(month==3){
            if(date>0 && date <21){
                System.out.println("Ban la Song Ngu");
            }else if(date>=21 && date<=31){
                System.out.println("Ban la Bach Duong");
            }
        }
        else if(month==4){
            if(date>0 && date <20){
                System.out.println("Ban la Bach Duong");
            }else if(date>=20 && date<=30){
                System.out.println("Ban la Kim Nguu");
            }
        }else if(month==5){
            if(date>0 && date <21){
                System.out.println("Ban la Kim Nguu");
            }else if(date>=21 && date<=31){
                System.out.println("Ban la Song Tu");
            }
        }else if(month==6){
            if(date>0 && date <21){
                System.out.println("Ban la Song Tu");
            }else if(date>=21 && date<=30){
                System.out.println("Ban la Cu Giai");
            }
        }else if(month==7){
            if(date>0 && date <23){
                System.out.println("Ban la Cu Giai");
            }else if(date>=23 && date<=31){
                System.out.println("Ban la Su Tu");
            }
        }else if(month==8){
            if(date>0 && date <23){
                System.out.println("Ban la Su Tu");
            }else if(date>=23 && date<=31){
                System.out.println("Ban la Xu Nu");
            }
        }else if(month==9){
            if(date>0 && date <23){
                System.out.println("Ban la Xu Nu");
            }else if(date>=23 && date<=30){
                System.out.println("Ban la Thien Binh");
            }
        }else if(month==10){
            if(date>0 && date <23){
                System.out.println("Ban la Thien Binh");
            }else if(date>=23 && date<=31){
                System.out.println("Ban la Bo Cap");
            }
        }else if(month==11){
            if(date>0 && date <22){
                System.out.println("Ban la Bo Cap");
            }else if(date>=22 && date<=30){
                System.out.println("Ban la Nhan Ma");
            }
        }else if(month==12){
            if(date>0 && date <22){
                System.out.println("Ban la Nhan Ma");
            }else if(date>=22 && date<=31){
                System.out.println("Ban la Ma Ket");
            }
        }
            } catch (InputMismatchException e) {    
                System.out.println("loi input value");
            }
        }

        
        
        

        cs.close();
    }
    // public static void main(String[] args){
    //     //sumInteger();
    //     //nhapThongTin();
    //     cungHoangDao();
    // }   
}
