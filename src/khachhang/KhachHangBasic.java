package khachhang;

public class KhachHangBasic extends KhachHang{


    public KhachHangBasic(){
        this.setPhiCoBan(500);
        this.setChiPhiLopHoc("100/Lop");
        this.setDichVuXongHoi("Khong co");
        this.setHoTroPT("100");
    }

    @Override
    public void nhapKhachHang(){
        super.nhapKhachHang();
    }
    
    
}
