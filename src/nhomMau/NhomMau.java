package nhomMau;
import java.util.Scanner;

public abstract class NhomMau {
    protected boolean rh;
    protected int loaiMau;
    
    public static final int NhomA=1;
    public static final int NhomB=2;
    public static final int NhomAB=3;
    public static final int NhomO=4;

    public NhomMau(){

    }

    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap Rh (true:+/false:-):");
        this.rh = scanner.nextBoolean();
    }

    public void xuat(){
        System.out.println("===============");
        if(this.loaiMau==NhomA){
            System.out.print("A");
        }else if(this.loaiMau==NhomB){
            System.out.print("B");
        }else if(this.loaiMau==NhomAB){
            System.out.print("AB");
        }else if(this.loaiMau==NhomO){
            System.out.print("O");
        }

        if(rh == true){
            System.out.println("+");
        }else if(rh == false){
            System.out.println("-");
        }
    }

    public abstract boolean kiemTraNhomMau(NhomMau nhan);

    public boolean kiemTraRh(NhomMau nhan){
        if(this.rh == true){
            if(nhan.rh == true){
                return true;
            }
        }else if(this.rh == false){
            return true;
        }
        return false;
    }

    public boolean kiemTraChoNhan(NhomMau nhan){
        boolean nhomMau = kiemTraNhomMau(nhan);
        boolean rh = this.kiemTraRh(nhan);
        if(nhomMau && rh){
            return true;
        }else {
            return false;
        }
    }

    public boolean isRh() {
        return rh;
    }


    public void setRh(boolean rh) {
        this.rh = rh;
    }


    public int getLoaiMau() {
        return loaiMau;
    }


    public void setLoaiMau(int loaiMau) {
        this.loaiMau = loaiMau;
    }


    public static int getNhoma() {
        return NhomA;
    }


    public static int getNhomb() {
        return NhomB;
    }


    public static int getNhomab() {
        return NhomAB;
    }


    public static int getNhomo() {
        return NhomO;
    }


    public NhomMau(boolean rh, int loaiMau) {
        this.rh = rh;
        this.loaiMau = loaiMau;
    }
    

    
}
