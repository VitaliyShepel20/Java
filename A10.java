import java.util.ArrayList;
import java.util.HashMap;

public class A10 {
    public static void main(String[] args) {
        addNumber(10);
        addNumber(11);
        addNumber(15);
        System.out.println(intList);

        addPair(1,45);
        addPair(2,400);
        addPair(3,500);
        System.out.println(intMap);

    }

    public static ArrayList<Integer> intList = new ArrayList<>();

    public static HashMap<Integer, Integer> intMap = new HashMap<>();


    public static void addNumber(int i) {
        intList.add(i);
    }

    public static void addPair(int i, int j) {
        intMap.put(i, j);
    }



}