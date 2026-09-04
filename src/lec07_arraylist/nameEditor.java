package lec07_arraylist;

import java.util.ArrayList;

public class nameEditor {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("alice");
        names.add("bob");
        names.add("charlie");
        names.add("david");
        System.out.println("before" + names);
        String removedname = names.remove(1);
        System.out.println("after" + names);
        System.out.println("removed" + names);
        System.out.println("size" + names.size());
    }

}
