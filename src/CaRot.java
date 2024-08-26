

public class CaRot extends NguyenLieu{
    public CaRot(){
        this.setCarb(10);
        this.setFat(3);
        this.setFatBaoHoa(0);
        this.setProtein(1);
        this.setCalo(41);
    }


    @Override
    public void nhapKhoiLuong(){
        System.out.print("3.Nhap khoi luong carrot: ");
        super.nhapKhoiLuong();
    }
}
