package khachhang;

import java.util.Scanner;

public class KhachHang {
    private String HoTen;
    private int cmnd;
    private String dichVu;
    private int thoiGianSuDungDichVu;
    private int phiCoBan;
    private String chiPhiLopHoc;
    private String dichVuXongHoi;
    private String hoTroPT;
    
    

    public int getPhiCoBan() {
        return phiCoBan;
    }

    public void setPhiCoBan(int phiCoBan) {
        this.phiCoBan = phiCoBan;
    }

    public String getChiPhiLopHoc() {
        return chiPhiLopHoc;
    }

    public void setChiPhiLopHoc(String chiPhiLopHoc) {
        this.chiPhiLopHoc = chiPhiLopHoc;
    }

    public String getDichVuXongHoi() {
        return dichVuXongHoi;
    }

    public void setDichVuXongHoi(String dichVuXongHoi) {
        this.dichVuXongHoi = dichVuXongHoi;
    }

    public String getHoTroPT() {
        return hoTroPT;
    }

    public void setHoTroPT(String hoTroPT) {
        this.hoTroPT = hoTroPT;
    }

    public KhachHang(){
        
    }
    public KhachHang(String HoTen, int cmnd, String dichVu, int thoiGianSuDungDichVu, int phiCoBan, String chiPhiLopHoc,
        String dichVuXongHoi, String hoTroPT) {
        this.HoTen =HoTen;
        this.cmnd = cmnd;
        this.dichVu = dichVu;
        this.thoiGianSuDungDichVu = thoiGianSuDungDichVu;
        this.phiCoBan = phiCoBan;
        this.chiPhiLopHoc = chiPhiLopHoc;
        this.dichVuXongHoi = dichVuXongHoi;
        this.hoTroPT = hoTroPT;
    }

    public int getCmnd() {
        return cmnd;
    }

    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
    }

    public String getDichVu() {
        return dichVu;
    }

    public void setDichVu(String dichVu) {
        this.dichVu = dichVu;
    }

    public int getThoiGianSuDungDichVu() {
        return thoiGianSuDungDichVu;
    }

    public void setThoiGianSuDungDichVu(int thoiGianSuDungDichVu) {
        this.thoiGianSuDungDichVu = thoiGianSuDungDichVu;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public void nhapKhachHang(){
        Scanner scanner = new Scanner(System.in);
        int flag = 1;
        System.out.println("-----Nhap Thong Tin Khach Hang-----");
        System.out.print("\nNhap ho va ten: ");
        this.HoTen = scanner.nextLine();
        System.out.print("\nNhap so CMND: ");
        this.cmnd = scanner.nextInt();
        
    }

    
}
