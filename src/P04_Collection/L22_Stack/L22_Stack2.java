package P04_Collection.L22_Stack;

import java.util.Stack;

public class L22_Stack2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Zaur");
        stack.push("Mike");
        stack.push("Oleg");
        stack.push("Kate");

//        System.out.println(stack);
        System.out.println(stack.peek());
//        System.out.println(stack);
/*
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
            System.out.println(stack);
        }
*/
    }
}
