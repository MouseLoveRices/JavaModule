package oop;

public class SinhVienVN extends SinhVien {
    private float tiengViet;

    public SinhVienVN() {
        super();

    }
    
    public SinhVienVN(float tiengViet) {
        super();
        this.tiengViet = tiengViet;
    }

    @Override
    public void showInfor(){
        this.tiengViet=10;
        System.out.println("Ham nay duoc ghi de, Diem tieng Viet: "+this.tiengViet);
    }
    
}
