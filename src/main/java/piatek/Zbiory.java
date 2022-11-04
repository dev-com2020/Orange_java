package piatek;

import java.util.*;

public class Zbiory {
    public static void main(String[] args) {

//        Set<Integer> numbers = new HashSet<>();
//        numbers.add(22);
//        numbers.add(2);
//        numbers.add(5);
//        numbers.add(2);
//        numbers.add(20);
////        numbers.remove(5);
//        numbers.add(1);
//        System.out.println(numbers.isEmpty());
//        System.out.println(numbers);
//
//        Set<Integer> numbers2 = new TreeSet<>();
//        numbers2.add(2);
//        numbers2.add(1);
//        numbers2.add(1);
//        numbers2.add(3);
//        numbers2.add(9);
//        numbers2.add(4);
//        System.out.println(numbers2.size());
//        System.out.println(((TreeSet<Integer>) numbers2).first());
//        System.out.println(((TreeSet<Integer>) numbers2).last());
//        System.out.println(numbers2.contains(2));
//        System.out.println(numbers2);
//
//        Set<String> names = Set.of("marek","kasia","karol");
//        for (String name: names) {
//            System.out.println(name);
//        }


//        List<String> train = new ArrayList<>();
//        train.add("Marcin");
//        train.add("Jacek");
//        train.add("Kasia");
//        System.out.println(train.get(0));

        Map<Integer,String> map1 = new HashMap<>();
        Map<String,String> map2 = new HashMap<>();
        Map<Integer,Boolean> map3 = new HashMap<>();
        Map<Integer,String> map4 = new TreeMap<>();

        map4.put(2,"A");
        map4.put(1,"b");
        map4.put(4,"c");
        map4.put(7,"d");
        map4.put(3,"r");

        System.out.println(map4);



//        map1.put(1,"Tomek");
//        map1.put(1,"Maciej");
//        map1.put(2,"jacek");
//        map2.put("pierwszy","Jacek");
//        map3.put(100,true);
//
//        System.out.println(map1.get(2));
//        System.out.println(map2);
//        System.out.println(map3);
//
//        if (map2.containsKey("pierws")){
//            System.out.println(map2.get("pierwszy"));
//        } else {
//            System.out.println("brak klucza...");
//        }

        }
    }

