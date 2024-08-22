package khachhang;

public class KhachHangNonMember extends KhachHang{



    public KhachHangNonMember(){
        this.setPhiCoBan(200);
        this.setChiPhiLopHoc("Khong co");
        this.setDichVuXongHoi("Khong co");
        this.setHoTroPT("200");
    }

    @Override
    public void nhapKhachHang(){
        super.nhapKhachHang();
    }
    
}
