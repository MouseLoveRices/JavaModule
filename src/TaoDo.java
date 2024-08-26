

public class TaoDo extends NguyenLieu{
    public TaoDo(){
        this.setCarb(3);
        this.setFat(1);
        this.setFatBaoHoa(0);
        this.setProtein(1);
        this.setCalo(52);
    }


    @Override
    public void nhapKhoiLuong(){
        System.out.print("4.Nhap khoi luong tao do: ");
        super.nhapKhoiLuong();
    }
}
