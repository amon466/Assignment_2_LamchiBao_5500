package lec06_array;

import java.util.ArrayList;

public class arrrylist {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("chan");
        names.add("bo");
        names.add("may");
        names.add("di");
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("number of element=" + names.size());
    }
}
