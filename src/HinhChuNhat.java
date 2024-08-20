public class HinhChuNhat {
    public float dai;
    public float rong;
    public HinhChuNhat(){

    }
    public HinhChuNhat(float d, float r){
        this.dai=d;
        this.rong=r;
    }
    public float DienTich(){
        return this.dai*this.rong;
    }
    public float chuvi(){
        return (this.dai+this.rong)*2;
    }
}
