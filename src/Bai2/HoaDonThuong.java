package Bai2;

public class HoaDonThuong extends HoaDon{

    public float tinhTienDien(){
        tinhSoKwTieuThu();
        if(getSoKWtieuThu()>100){
            return tienDien = 50*1500+50*2000+(getSoKWtieuThu()-100)*2800;
        }else if(getSoKWtieuThu()<100){
                if(getSoKWtieuThu()>50){
                   return tienDien = 50*1500+(getSoKWtieuThu()-50)*2000;
                }else{
                    return tienDien = getSoKWtieuThu()*1500;
                }
        }
        setTienDien(this.tienDien);
        return tienDien;
    }

    @Override
    public float tongTienDien(){
        tinhTienDien();
        return this.tienDien;
    }

    public void tienThanhToan(){
        tinhTienDien();
         this.soTien = this.tienDien+(thueGTGT*this.tienDien);
        setSoTien(this.soTien);
    }
    public void nhap(){
        System.out.println("===========================");
        System.out.println("--Ho dan--");
        super.nhap();
    }
    public void xuat(){
        tienThanhToan();
        super.xuat();
    }
}
