package nhomMau;

public class NhomMauA extends NhomMau{
    public NhomMauA (){
        this.loaiMau = NhomA;
    }

    public boolean kiemTraNhomMau(NhomMau nhan){
        if (nhan.getLoaiMau()==NhomA || nhan.getLoaiMau()==NhomAB) {
            return true;
        }
        return false;
    }
}
