package Bai1;

public class CaSyThuong extends CaSy{
    protected final int luongCung = 3000000;
    protected final int giaTriDia = 1000;
    protected final int giaShow = 200000;

    public void nhap(){
        System.out.println("\n==========================");
        System.out.println("---Nhap Ca Sy chua noi tieng---");
        super.nhap();
        tinhLuong();
    }

    public void tinhLuong(){
        System.out.print("-Luong ca si chua noi tieng la: ");
        this.luong =luongCung+500000*this.soNamLamViec+giaTriDia*this.soDiaBanDuoc+giaShow*soBuoiTrinhDien;
        this.setLuong(this.luong);
    }

    public void xuat(){
        super.xuat();
        System.out.println("Luong: "+this.getLuong());
    }
}
