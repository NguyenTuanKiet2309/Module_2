package ss5_accessmodifier_staticmethod_staticproperty.thuc_hanh.StaticMeThod;

public class TestStaticMethod {
    public static void main(String[] args) {
        StaticMethod.change();
        StaticMethod s1 = new StaticMethod(111,"Kiệt");
        StaticMethod s2 = new StaticMethod(222,"Hưng");
        StaticMethod s3 = new StaticMethod(333,"Nam");
        s1.display();
        s2.display();
        s3.display();
    }
}
