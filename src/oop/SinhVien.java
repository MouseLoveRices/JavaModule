package oop;

public class SinhVien {
    private String ten;
    private float toan;
    private float van;

    public SinhVien(String ten, float toan, float van) {
        this.ten = ten;
        this.toan = toan;
        this.van = van;
    }

    public SinhVien() {

    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public float getToan() {
        return toan;
    }

    public void setToan(float toan) {
        this.toan = toan;
    }

    public float getVan() {
        return van;
    }

    public void setVan(float van) {
        this.van = van;
    }

    public void showInfor(){
        System.out.println("Ho ten: "+this.ten+"--Toan: "+this.toan+"--Van: "+this.van);
    }
    
    // tinh diem trung binh 
    public float averageMark(){
        System.out.println("Diem trung binh: "+(this.toan+this.van)/2);
        return (this.toan+this.van)/2;
    }

    // diem trung binh 2 sinh vien
    public float averageMark(SinhVien sinhvientruyenvao){
        return (this.averageMark()+sinhvientruyenvao.averageMark())/2;
    }
}
