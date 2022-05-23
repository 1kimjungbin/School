package Quiz;

public class TestMain {
    public static void main(String[] args) {
        System.out.println("=== 1 ===");
        B b = new B();
        b.a();

        System.out.println("=== 2 ===");
        C c = new C();
        c.a();

        System.out.println("=== 3 ===");
        D d = new D();
        d.a();

        System.out.println("=== 4 ===");
        E e = new E(1);
        e.a();

        System.out.println("=== 5 ===");
        G g = new G();
        g.a();

        System.out.println("=== 6 ===");
        H h = new H(1);
        h.a();

        System.out.println("=== 7 ===");
        I i = new I();
        i.a();
    }
}
