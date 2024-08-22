package khachhang;

public class KhachHangPremium extends KhachHang{



    public KhachHangPremium(){
        this.setPhiCoBan(1000);
        this.setChiPhiLopHoc("Mien Phi");
        this.setDichVuXongHoi("Mien Phi");
        this.setHoTroPT("Mien Phi");
    }
  
    @Override
    public void nhapKhachHang(){
        super.nhapKhachHang();
    }

    
    
}
