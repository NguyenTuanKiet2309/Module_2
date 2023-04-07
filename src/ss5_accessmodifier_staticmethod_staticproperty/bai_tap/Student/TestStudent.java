package ss5_accessmodifier_staticmethod_staticproperty.bai_tap.Student;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter your name: ");
        String str = sc.nextLine();
        System.out.println("Enter your class: ");
        String str1 = sc.nextLine();
        Student S = new Student();
        S.setName(str);
        S.setClasses(str1);
        System.out.println(S.toString());
    }
}
