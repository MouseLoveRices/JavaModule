import java.util.Scanner;

public class NguyenLieu {
    private int khoiLuong;
    private int carb;
    private int fat;
    private int fatBaoHoa;
    private int protein;
    private int calo;

    private int carbHapThu;
    private int fatHapThu;
    private int fatBaoHoaHapThu;
    private int proteinHapThu;
    private int caloHapThu;


    public NguyenLieu(){
        this.setCarb(810);
        this.setFatHapThu(540);
        this.setFatBaoHoaHapThu(360);
        this.setProtein(540);
        this.setCaloHapThu(1800);        
    }
    
    public NguyenLieu(int khoiLuong, int carb, int fat, int fatBaoHoa, int protein, int calo, int carbHapThu, int fatHapThu,
            int fatBaoHoaHapThu, int proteinHapThu, int caloHapThu) {
        this.khoiLuong = khoiLuong;
        this.carb = carb;
        this.fat = fat;
        this.fatBaoHoa = fatBaoHoa;
        this.protein = protein;
        this.calo = calo;
        this.carbHapThu = carbHapThu;
        this.fatHapThu = fatHapThu;
        this.fatBaoHoaHapThu = fatBaoHoaHapThu;
        this.proteinHapThu = proteinHapThu;
        this.caloHapThu = caloHapThu;
    }

    public int getKhoiLuong(){
        return khoiLuong;
    }

    public void setKhoiLuong(int khoiLuong){
        this.khoiLuong = khoiLuong;
    }

    public int getCarbHapThu() {
        return carbHapThu;
    }

    public void setCarbHapThu(int carbHapThu) {
        this.carbHapThu = carbHapThu;
    }

    public int getFatHapThu() {
        return fatHapThu;
    }

    public void setFatHapThu(int fatHapThu) {
        this.fatHapThu = fatHapThu;
    }

    public int getFatBaoHoaHapThu() {
        return fatBaoHoaHapThu;
    }

    public void setFatBaoHoaHapThu(int fatBaoHoaHapThu) {
        this.fatBaoHoaHapThu = fatBaoHoaHapThu;
    }

    public int getProteinHapThu() {
        return proteinHapThu;
    }

    public void setProteinHapThu(int proteinHapThu) {
        this.proteinHapThu = proteinHapThu;
    }

    public int getCaloHapThu() {
        return caloHapThu;
    }

    public void setCaloHapThu(int caloHapThu) {
        this.caloHapThu = caloHapThu;
    }

    public int getCarb() {
        return carb;
    }
    public void setCarb(int carb) {
        this.carb = carb;
    }
    public int getFat() {
        return fat;
    }
    public void setFat(int fat) {
        this.fat = fat;
    }
    public int getFatBaoHoa() {
        return fatBaoHoa;
    }
    public void setFatBaoHoa(int fatBaoHoa) {
        this.fatBaoHoa = fatBaoHoa;
    }
    public int getProtein() {
        return protein;
    }
    public void setProtein(int protein) {
        this.protein = protein;
    }
    public int getCalo() {
        return calo;
    }
    public void setCalo(int calo) {
        this.calo = calo;
    }

    public void nhapKhoiLuong(){       
        Scanner scanner = new Scanner(System.in);
        this.khoiLuong = scanner.nextInt();
    }

}
