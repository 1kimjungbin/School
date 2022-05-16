package ArrayList;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {

        ArrayList<Book> library = new ArrayList<Book>();

        library.add(new Book("태백산맥", "조정래"));
        library.add(new Book("데미안", "헤르만 헤세"));
        library.add(new Book("토지", "박경리"));
        library.add(new Book("태백산맥", "조정래"));

        System.out.println();
        System.out.println();
    }
}
