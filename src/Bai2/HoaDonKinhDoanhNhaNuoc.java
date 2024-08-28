package Bai2;

public class HoaDonKinhDoanhNhaNuoc extends HoaDon{
    public float tinhTienDien(){
        tinhSoKwTieuThu();
        this.tienDien = this.soKWtieuThu*3000;
        setTienDien(this.tienDien);
        return this.tienDien;
    }

    @Override
    public float tongTienDien(){
        tinhTienDien();
        return this.tienDien;
    }

    public void tienThanhToan(){
        tinhTienDien();
        this.soTien = this.tienDien + (this.tienDien*thueGTGT) - (5/100*this.tienDien);
        this.setSoTien(this.soTien);
    }

    public void nhap(){
        System.out.println("===========================");
        System.out.println("--Ho kinh doanh nha nuoc--");
        super.nhap();
    }
    public void xuat(){
        tienThanhToan();
        super.xuat();
    }
}
