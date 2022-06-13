package ArrayList;

import java.util.ArrayList;

class MyStack {
    private ArrayList<String> arrayStack = new ArrayList<>();

    public void push(String data) {
        arrayStack.add(data);
    }

    public String pop() {
        if(arrayStack.size() == 0) {
            System.out.println("빈 스택");
            return null;
        }
        return arrayStack.remove(arrayStack.size() - 1);
    }
}

public class StackTest {
    public static void main(String[] args) {
        MyStack stack =  new MyStack();

        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push("D");
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }

}
