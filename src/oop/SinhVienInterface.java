package oop;

public interface SinhVienInterface {
    void xepLoai();
    default void viduDefault(){
        System.out.println("Day la vi du su dun default thay vi override");
    }
}
