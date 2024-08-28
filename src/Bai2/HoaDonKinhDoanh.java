package Bai2;

public class HoaDonKinhDoanh extends HoaDon{
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
        this.soTien = this.tienDien + (this.tienDien*thueGTGT);
        this.setSoTien(this.soTien);
    }

    public void nhap(){
        System.out.println("===========================");
        System.out.println("--Ho kinh doanh--");
        super.nhap();
    }
    public void xuat(){
        tienThanhToan();
        super.xuat();
    }
}
