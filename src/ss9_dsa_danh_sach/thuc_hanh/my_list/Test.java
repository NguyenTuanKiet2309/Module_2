package ss9_dsa_danh_sach.thuc_hanh.my_list;

public class Test {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);

        System.out.println("element 4: "+listInteger.get(4));
        System.out.println("element 1: "+listInteger.get(3));
        System.out.println("element 2: "+listInteger.get(2));
    }
}
