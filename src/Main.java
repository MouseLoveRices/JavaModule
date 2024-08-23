
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("RED");
        colors.add("AQUA");
        colors.add("YELLOW");
        colors.add("BLUE");
        colors.add("GREEN");

        System.out.println("\n");
        // truy cap phan tu tai vi tri chi dinh
        System.out.println(colors.get(1));

        // thay doi phan tu tai ci tri chi dinh
        colors.set(1,"PINK");

        // xoa phan tu theo gia tri
        colors.remove("RED");
        System.out.println(colors);

        //xoa phan tu theo chi so
        colors.remove(0);
        System.out.println(colors);

        for (String color : colors){
            System.out.println(color);    
        }
        
        String[] colorsArray = {"red","blue","aqua","pink"};

        ArrayList<String> colorsList = new ArrayList<>(Arrays.asList(colorsArray));
        // sap xep mang cach thuong
   //   { Collections.sort(colorsList);}
        // su dung bieu thuc lambda de sap xep danh sach theo thu tu tang dan
        Collections.sort(colorsList, (s1,s2)->s1.compareTo(s2));
        System.out.println("---Lambda sort: "+colorsList);


        ArrayList<Point> points = new ArrayList<>();
        points.add(new Point(3,7));
        points.add(new Point(3,4));
        points.add(new Point(2,8));
        points.add(new Point(6,7));
        Comparator<Point> x_y_compare = new Comparator<Point>() {
            @Override
            // public int compare(Point p1, Point p2){
            //     return Integer.compare(p1.getX(),p2.getX());
            // }
            // public int compare(Point p1, Point p2){
            //     int tmp = Integer.compare(p1.getX(),p2.getX());

            //     if(tmp == 0){
            //         return Integer.compare(p1.getY(),p2.getY());
            //     }
            //     return tmp;
            // }
            public int compare(Point p1, Point p2){
                return Integer.compare(p1.getX()+p1.getY(), p2.getX()+p2.getY());    
            }
        };
        Collections.sort(points, x_y_compare);
        for (Point p:points){
            System.out.println(p);
        }
    Predicate<Point> sumPoint = point -> point.getX() + point.getY() >7; 
    System.out.println(sumPoint);
    Predicate<Point> sumPoint2 = point ->{
        if (point.getX() >5){
            return point.getX() + point.getY() >7;
        }else{
            return point.getX()+ point.getY() >6;
        }
    } ; 

    for (Point point : points){
        if(sumPoint2.test(point)){
            System.out.println(point.toString());
        }
    }
    Function<Point, Integer> sumPoint3 = p -> p.getY() + p .getX();
    System.out.println(sumPoint3);
    Function<Point, Integer> sumPoint4 = p -> {
        return p.getX() > p.getY() ? p.getY() - p.getX() : p.getY() +p.getX();
    };
        
    
    for (Point point : points){
        System.out.println(sumPoint4.apply(point));
    }

    Consumer<Point> printMessage = p ->{
        if(p.getX() > p.getY()){
            System.out.println(p.getY() - p.getX());
        }
    };
    System.out.println("================");
    points.forEach(printMessage);

    System.out.println("===================");
    for (Point point : points){
        printMessage.accept(point);
    }
    System.out.println("=======================");
    points.stream()
            .filter(p -> p.getX() > 3 )    
            .forEach(System.out::println);
    System.out.println("==============");
    for (Point a: points){
        if(a.getX() > 3){
            System.out.println(a.toString());
        }
    }
    System.out.println("=======================");
    Predicate<Point> pre_x = point -> point.getX() > 3;
    for (Point point :points){
        if(pre_x.test(point)){
            System.out.println(point.toString());
        }
    }
    System.out.println("=======================");
    Consumer<Point> consum_x = p -> {
        if(p.getX() > 3){
            System.out.println(p.toString());
        }
    };
    points.forEach(consum_x);


    List<String> names = new ArrayList<>();
    names.add("Amoe");
    names.add("Zinba");
    names.add("Concat");
    names.add("Gogo");

    names.stream()
        .sorted()
        .forEach(System.out::println);

    System.out.println("Sap xep giam dan----------");
     
    names.stream()
        .sorted(Comparator.reverseOrder())
        .forEach(System.out::println);

    List<Integer> numbers = Arrays.asList(1,2,3,4,5,7,9,8);

    System.out.println("Tinh tong --------");
    int sum = numbers.stream()
        .mapToInt(Integer::intValue)
        .sum();
    System.out.println("Tong = " + sum);

    System.out.println("===================");
    System.out.println("Tinh trung binh");
    double avg = numbers.stream()
                    .mapToInt(Integer::intValue)
                    .average()
                    .orElse(0);
    System.out.println("Trung binh = "+ avg);

    System.out.println("====================");
    System.out.println("Tim gia tri lon nhat");
    OptionalInt max = numbers.stream()
                .mapToInt(Integer::intValue)
                .max();
    System.out.println("Gia tri lon nhat = "+max);

    System.out.println("==================");
    System.out.println("Tim gia tri nho nhat");
    OptionalInt min = numbers.stream()
                    .mapToInt(Integer::intValue)
                    .min();
    System.out.println("Gia tri nho nhat = "+min);
    
    
    System.out.println("================");
    System.out.println("Dung reduce de tinh tong");
    int sumReduce = numbers.stream()    
                    .reduce(0, Integer::sum);
            System.out.println("Sum = "+sumReduce);
    
    System.out.println("================");
    System.out.println("Dung reduce tim tich");
    int tich = numbers.stream()
                .reduce(1, (kq,item)->kq=kq*item);
        System.out.println("Tich = "+ tich);

    List<List<String>> listTwoSide = Arrays.asList(
        Arrays.asList("a","b","c"),
        Arrays.asList("d","e","f"),
        Arrays.asList("g","h","i")
    );

    System.out.println("Dung flatmap de ket hop danh sach con thanh mot danh sach");
    List<String> combineList = listTwoSide.stream()
            .flatMap(List::stream)
            .collect(Collectors.toList());
    System.out.println(combineList);

    List<Double> nums = Arrays.asList(1.0, 1.0/2, 1.0 / 3, 1.0 / 4, 1.0 / 5);
    double sumNum = nums.stream()
                    .mapToDouble(num->num)
                    .sum();
        System.out.println("Tong nums la " +sumNum);             

    System.out.println("========================");
    int sumPointXY = points.stream()
            .flatMapToInt(point -> Arrays.stream(new int[]{point.getX(),point.getY()}))
            .sum();
    System.out.println("Tong X va Y trong point = "+sumPointXY);

    System.out.println("=====================");
    int sumX = points.stream()
            .mapToInt(Point::getX)
            .sum();
        System.out.println("Tong hoanh do X la = "+sumX);
      
    System.out.println("========================");
    int sumX2 = points.stream()
            .filter(p->p.getX()>5)
            .mapToInt(Point::getX)
            .sum(); 
    System.out.println("Tong X lon hon 5 = "+sumX2);

    System.out.println("============");
    System.out.println("Ket qua x^2+1-y la: ");
      points.stream()
            .filter(p->p.getX()>4)
            .mapToInt(p->{
                return p.getX()*p.getX()-1+p.getY();
            })
            .forEach(res -> System.out.print(res));


    System.out.println("\n==========================");
    long total5 = points.stream()
            .filter(p->p.getX()>1)
            .mapToLong(p->{
                return p.getX()*p.getX()-1+p.getY();
            })
            .reduce(1L, (kq,item)->kq*item);

    System.out.println("Tinh tich x^2-1+y hoanh do >1 = "+total5);

    System.out.println("====================");
    double totalProduct = points.stream()
                .mapToDouble(point ->{
                    int x= point.getX();
                    int y = point.getY();
                    double tmp = x*x+y;
                    return 1.0/tmp;
                })
                .reduce(1.0, (res,item)->res*item);

    System.out.println("Tich 1/(x^2+y) = "+totalProduct);

    //danh sanh sach x+y >7
    System.out.println("====================");
    System.out.println("Danh sanh sach x+y >7");
    points.stream()
                .filter(p->(p.getX()+p.getY()>7))
                .forEach(System.out::println);

    // in ra danh sach x>5 va y>1
    System.out.println("====================");
    System.out.println("in ra danh sach x>5 va y>1");
    points.stream()
                .filter(p->(p.getX()>5 && p.getY()>1))
                .forEach(System.out::println);
    }   
}