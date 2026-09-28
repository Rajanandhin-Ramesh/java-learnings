package Arrays;

import java.util.ArrayList;

public class ArrayListEg {
    static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("Hello");
        arrayList.add("Hello");
        arrayList.add("Hello");
        System.out.println(arrayList);
        System.out.println(arrayList.contains("Hello"));
        arrayList.set(2,"How");
        arrayList.remove(3);
        System.out.println(arrayList);



    }
}
