package nhomMau;

public class NhomMauAB extends NhomMau{
    public NhomMauAB(){
        this.loaiMau = NhomAB;
    }

    public boolean kiemTraNhomMau(NhomMau nhan){
        if(nhan.getLoaiMau() == NhomAB){
            return true;
        }
        return false;
    }
}
