import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSachNguyenLieu {
    private int carb;
    private List<NguyenLieu> arr;

    public DanhSachNguyenLieu(){
        this.arr = new ArrayList<>();
    }

    public void nhapKhoiLuong(){
        NguyenLieu ga = new Ga();
        NguyenLieu hatSen = new HatSen();
        NguyenLieu caRot = new CaRot();
        NguyenLieu taoDo = new TaoDo();
        NguyenLieu namDongCo = new NamDongCo();

        ga.nhapKhoiLuong();
        hatSen.nhapKhoiLuong();
        caRot.nhapKhoiLuong();
        taoDo.nhapKhoiLuong();
        namDongCo.nhapKhoiLuong();

        arr.add(ga);
        arr.add(hatSen);
        arr.add(caRot);
        arr.add(taoDo);
        arr.add(namDongCo);
    }

    public float tinhNangLuong(int flag){
        float sum = 0;
        for (NguyenLieu a:this.arr){
            if(flag==1){
                sum+=a.getKhoiLuong()/100.0f*a.getCarb();
            }else if(flag == 2){
                sum+=a.getKhoiLuong()/100.0f*a.getFat();
            }
            else if(flag == 3){
                sum+=a.getKhoiLuong()/100.0f*a.getFatBaoHoa();
            }
            else if(flag == 4){
                sum+=a.getKhoiLuong()/100.0f*a.getProtein();
            }
            else if(flag == 5){
                sum+=a.getKhoiLuong()/100.0f*a.getCalo();
            }
        }
        return sum+=0.8f;
    }

    public void nhapChiSoDinhDuong(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("===================");
        System.out.println("-Nhap chi so dinh duong da hap thu-");
        System.out.print("Nhap carb da hap thu: ");
        int carb = scanner.nextInt();
        if(carb < tinhNangLuong(1)){
            System.out.println("Ban can bo sung "+(carb-tinhNangLuong(1))+"carb");
        }
        System.out.print("Nhap fat da hap thu: ");
        int fat = scanner.nextInt();
        if(fat < tinhNangLuong(2)){
            System.out.println("Ban can bo sung "+(fat-tinhNangLuong(2))+"fat");
        }
        System.out.print("Nhap fat bao hoa da hap thu: ");
        int fatBH = scanner.nextInt();
        if(fatBH < tinhNangLuong(3)){
            System.out.println("Ban can bo sung "+(fatBH-tinhNangLuong(3))+"fat bao hoa");
        }
        System.out.print("Nhap protein da hap thu: ");
        int protein = scanner.nextInt();
        if(protein < tinhNangLuong(4)){
            System.out.println("Ban can bo sung "+(protein-tinhNangLuong(4))+"protein");
        }
        System.out.print("Nhap calo da hap thu: ");
        int calo = scanner.nextInt();
        if(calo < tinhNangLuong(5)){
            System.out.println("Ban can bo sung "+(calo-tinhNangLuong(5))+"calo");
        }
    }

    public void cau3(){
        int sum = 0;
        for(NguyenLieu a:this.arr){
            sum+=a.getKhoiLuong()/100.0f*a.getCalo();
        }
        int caloTieuChuan = 600;
        System.out.println("-----"+sum);
        if(sum > caloTieuChuan ){
            int caloDu = sum - caloTieuChuan;
            System.out.println("Can chay bo : "+caloDu*30/147+ " phut");
        }else{
            System.out.println("Khong can chay bo");
        }
    }
}
