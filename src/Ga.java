
public class Ga extends NguyenLieu{

    public Ga(){
        this.setCarb(0);
        this.setFat(15);
        this.setFatBaoHoa(4);
        this.setProtein(15);
        this.setCalo(211);
    }  


    @Override
    public void nhapKhoiLuong(){
        System.out.println("==================");
        System.out.println("-Nhap vao khoi luong cac nguyen lieu (gam)-");

        System.out.print("1.Nhap vao khoi luong ga : ");
        super.nhapKhoiLuong();
    }

}
