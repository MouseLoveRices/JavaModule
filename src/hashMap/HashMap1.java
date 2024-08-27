package hashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class HashMap1 {
    public static void test(){
        HashMap<String, String> map =new HashMap<>();

        map.put("USA", "Washington, D.C.");
        map.put("France", "Paris");
        map.put("Japan", "Tokyo");

        //kiem tra su ton tai cua mot khoa
        if(map.containsKey("France")){
            System.out.println("Thu do cua Phap la: "+map.get("France"));
        }

        //kiem tra su ton tai cua mot gia tri
        if(map.containsValue("Tokyo")){
            System.out.println("Tokyo co tren ban do");
        }

        //xoa mot phan tu
        map.remove("Japan");
        System.out.println("==========================");
        for(String key : map.keySet()){
            System.out.println(key+ ": "+ map.get(key));
        }
        System.out.println("==============================");
        //lap qua cac cap khoa gia tri bang cach su dung entrySet()
        for(Map.Entry<String, String> entry : map.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Nuoc: "+key+", thu do la: "+value);
        }
        System.out.println("==========================");
        //lay gia tri voi khoa co san
        System.out.println("Value for key 'USA': "+ map.getOrDefault("USA", "Not Found"));

        //lay gia tri voi khoa khong co san
        System.out.println("Value for key 'C': "+map.getOrDefault("C", "Not Found"));

        //them hoac cap nhat gia tri neu khoa khong co mat (thay doi kieu gia tri thanh String)
        map.putIfAbsent("VietNam", "Ha Noi");
        System.out.println("Value of VietNam "+map.get("VietNam"));

        //cap nhat gia tri neu khoa co mat (thay doi kieu gia tri tu Paris -> Paris (updated))
        map.computeIfPresent("France", (k, v)-> v +"(Updated)");

    }

    public static void test2_countWord(){
        String s = "xin chao xin chao pho phuong bao phuong pho";
        HashMap<String, Integer> map = new HashMap<>();
        String []words = s.split(" ");
        for(String x:words){
            int count = map.getOrDefault(x, 0);
            map.put(x, count+1);
        }

        for(String key : map.keySet()){
            System.out.println(key+": "+ map.get(key));
        }
    }

    public static void test3_countWords(){
        String s = "xin chao xin chao pho phuong bao phuong pho";
        HashMap<String, Integer> map = new HashMap<>();
        StringTokenizer tokenizer = new StringTokenizer(s);
        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            map.put(word, map.getOrDefault(word, 0)+1);
        }
    }

    public static void test4_dictionary(){
        //tao mot hashmap de luu tru tu dien
        HashMap<String, String> dictionary = new HashMap<>();
        //them mot so tu  va dinh nghia vao tu dien
        dictionary.put("apple", "Trai tao");
        dictionary.put("banana", "Trai chuoi");
        dictionary.put("cherry","Trai anh dao");
        Scanner scanner =new Scanner(System.in);
        System.out.print("Nhap tu can tr cuu: ");
        String name = scanner.nextLine();
        String res = dictionary.get(name);
        if(res!= null){
            System.out.println(name+": "+res);
        }else{
            System.out.println("Not Found");
        }
        scanner.close();
    }

    public static void test5_stream(){
        HashMap<String, Integer> map = new HashMap<>();

        //quoc gia -- so luong cong ty 
        map.put("USA", 3);
        map.put("France", 9);
        map.put("Japan", 4);
        map.put("VietNam", 13);
        map.put("Korea", 6);

        System.out.println("==================");
        for(String key:map.keySet()){
            System.out.println(key+": "+map.get(key));
        }
        System.out.println("=================");
        //in ra cac phan tu con lai trong Hashmap
        map.entrySet().stream()
                    .forEach(item-> System.out.println(item.getKey()+": "+item.getValue()));
    
        System.out.println("=========================");
        //Tinhs tong so lunog cac cong ty tren
        int kq = map.values().stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum = "+kq);
        System.out.println("=======================");   
           
        //loc cac quoc gia co so luong cong ty >5
        Map<String, Integer> newMap = map.entrySet().stream()
                .filter(item->item.getValue()>5)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(newMap);

        //sap xep giam dan so luong cong ty
        System.out.println("========================");
        map.entrySet().stream()
            .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
            .forEach(item -> System.out.println(item.getKey()+": "+item.getValue()));
        }

        public static void test_linkedHashMap(){
            Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

            //them phan tu
            linkedHashMap.put("one", 1);
            linkedHashMap.put("two", 2);
            linkedHashMap.put("three", 3);
            linkedHashMap.put("two", 22);
            linkedHashMap.put("four", 4);

            //xoa mot phan tu
            linkedHashMap.remove("four");

            // in ra linkedHashMap
            for(Map.Entry<String, Integer> entry : linkedHashMap.entrySet()){
                System.out.println(entry.getKey()+ ": "+entry.getValue());
            }

        }

        public static void test_treeMap(){
            // tao mot treemap voi comparator tuy chinh de sap xep theo thu tu giam dan
            Map<String, Integer> treeMap = new TreeMap<>();

            // them cac phan tuvao treemap
            treeMap.put("banana", 2);
            treeMap.put("apple", 3);
            treeMap.put("grape", 6);
            treeMap.put("lemon", 8);

            // in ra tree map
            for(Map.Entry<String, Integer> entry : treeMap.entrySet()){
                System.out.println(entry.getKey()+": "+entry.getValue());
            }

            //tao treemap voi khoa la ten va gia tri la tuoi
            TreeMap<String, Integer> ageMap = new TreeMap<>();

            //them cac phan tu vo tree Map
            ageMap.put("Joh", 30);
            ageMap.put("Jane", 25);
            ageMap.put("Paul", 28);
            ageMap.put("Anna", 28);

            System.out.println("{=========================}");
            for(Map.Entry<String, Integer> entry : ageMap.entrySet()){
                System.out.println(entry.getKey()+": "+entry.getValue());
            }

            System.out.println("====================");
            // tim kiem cac phan tu
            System.out.println("First key: "+ageMap.firstKey());// ten dau tien theo thu tu
            System.out.println("Last key: "+ageMap.lastKey()); // ten cuoi cung theo ki tu
            System.out.println("SubMap from 'Anna' to 'Paul': "+ageMap.subMap("Anna", "Paul"));
        }

    public static void main(String[] args) {
        test5_stream(); 
    }
}