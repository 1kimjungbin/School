package Example;

public class Person {
    private String Name;

    public Person(String Name) {
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = Name;
    }

    public static void main(String[] args) {
        Person p1 = new Person("홍길동");
        System.out.println(p1.getName());
        p1.setName("장발장");
        System.out.println(p1.getName());
    }
}
