package Example;

class Person2 {
    int count;
}
public class ClassVar {
    public static void main(String[] args) {
        Person2 p1 = new Person2();
        p1.count++;

        Person2 p2 = new Person2();
        p1.count++;
        p2.count = p1.count;

        Person2 p3 = new Person2();
        p1.count++;
        p2.count++;
        p3.count = p2.count;

        Person2 p4 = new Person2();
        p1.count++;
        p2.count++;
        p3.count++;
        p4.count = p3.count;

        System.out.println(p1.count);
        System.out.println(p2.count);
        System.out.println(p3.count);
        System.out.println(p4.count);
    }
}
