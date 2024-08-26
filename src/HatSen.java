

public class HatSen extends NguyenLieu{
    private int khoiLuongHatSen;
    public HatSen(){
        this.setCarb(17);
        this.setFat(0);
        this.setFatBaoHoa(1);
        this.setProtein(4);
        this.setCalo(89);
    }

    @Override
    public void nhapKhoiLuong(){       
        System.out.print("2.Nhap khoi luong hat sen: ");
        super.nhapKhoiLuong();
    }
}
