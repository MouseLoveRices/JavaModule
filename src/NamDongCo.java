

public class NamDongCo extends NguyenLieu{
    public NamDongCo(){
        this.setCarb(1);
        this.setFat(0);
        this.setFatBaoHoa(0);
        this.setProtein(15);
        this.setCalo(10);
    }

    @Override 
    public void nhapKhoiLuong(){
        System.out.print("5.Nhap khoi luong nam dong co: ");
        super.nhapKhoiLuong();
    }
}
