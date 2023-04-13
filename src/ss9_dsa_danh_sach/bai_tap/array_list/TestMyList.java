package ss9_dsa_danh_sach.bai_tap.array_list;

import java.util.ArrayList;

public class TestMyList {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>(3);
        myList.add("Kiệt");
        myList.add("Hưng");
        myList.add("Nam");
        System.out.println(myList);
        myList.remove("Kiệt");
        System.out.println(myList);
    }
}
