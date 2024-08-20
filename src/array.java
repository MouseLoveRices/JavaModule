public class array {
    public static void constantVar(){
        //khai bao hang so
        enum day{
            sunday,monday,tuesday,wednesday,thursday,friday,saturday
        }

        final double PI = 3.14159265354;
        final double E = 2.71828;

        day today =day.tuesday;
        double r=5;
        System.out.println("S="+r*r*PI);
        System.out.println("Hang so E la : "+E);

        switch (today) {
            case monday:
                System.out.println("To day is monday");
                break;            
            case tuesday:
                System.out.println("To day is tuesday");
                break;
            default:
                System.out.println("To day is regular day");
                break;
        }
    }

    public static void arrayTest(){
        int[] numbers = {1,2,3,4,5,6,7,8,9};
        for (int number : numbers){
            System.out.println(number);
        }

        int[][] matrix = {
            {1,2,3},
            {3,5,6},
            {7,8,9}
        };

        for (int i = 0; i<matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        // tinh tong duong cheo chinh
        int tong =0 ;
        for (int i = 0; i < matrix.length; i++){
            tong += matrix[i][i];
        }
        System.out.println("Tong duong cheo chinh la: "+tong);
        System.out.println();
        int tong2 = 0;
        for (int i = 0; i < matrix.length; i++){
            tong2+=matrix[i][matrix.length-i-1];
        }
        System.out.println("Tong duong cheo chinh 2 la: "+tong2);
    }
    
    public static void main(String[] args) {
        // arrayTest();
        constantVar();
    }
}