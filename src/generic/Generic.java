package generic;

import java.util.*;

public class Generic {
    public static <T> void printArray(T[] array){
        for(T element : array){
            System.out.println(element+" ");
        }
        System.out.println("");
    } 
    public static void generic1(){
        Box<String> stringBox = new Box<>();
        stringBox.setContent("Hello Generics");
        System.out.println("String content: "+stringBox.getContent());

        // tao box cho integer
        Box<Integer> integerBox = new Box<>();
        integerBox.setContent(1301);
        System.out.println("Integer content: "+integerBox.getContent());
        Integer[] intArray={1,2,3,5};
        String[] strArray = {"A","B","C","D"};


        //goi phuong thuc generic
        printArray(intArray);
        printArray(strArray);

        // tao danh sach cho so nguyeen
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        //in dnah sach
        for(Integer item : integerList){
            System.out.println(item);            
        }
        Pair<String, Integer> pair = new OrderedPair<>("Age", 22);
        System.out.println("Key: "+pair.getKey()+", value: "+pair.getValue());
    }
    public static void main(String[] args) {
        generic1();
    }
}
