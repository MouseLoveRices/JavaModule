package nhomMau;

public class NhomMauB extends NhomMau{
    public NhomMauB(){
        this.loaiMau = NhomB;
    }

    public boolean kiemTraNhomMau(NhomMau nhan){
        if(nhan.getLoaiMau()==NhomB || nhan.getLoaiMau()==NhomAB){
            return true;
        }
        return false;
    }
}
