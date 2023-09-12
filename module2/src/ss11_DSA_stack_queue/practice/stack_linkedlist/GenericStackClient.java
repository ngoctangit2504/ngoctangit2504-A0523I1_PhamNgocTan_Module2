package ss11_DSA_stack_queue.practice.stack_linkedlist;

public class GenericStackClient {
    private static void stackOfIString() {
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("1.1 Size of satck after push operation: "+ stack.size());
        System.out.println("1.1 Pop element from stack : ");
        while (!stack.isEmpty()) {
            System.out.printf(" %s", stack.pop());
        }
        System.out.println("\n1.3. Size of stack after pop operations : "+stack.size());
    }


    private static void stackOfIntegers() {
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("1.1 Size of satck after push operation: "+ stack.size());
        System.out.println("1.1 Pop element from stack : ");
        while (!stack.isEmpty()) {
            System.out.printf(" %s", stack.pop());
        }
        System.out.println("\n1.3. Size of stack after pop operations : "+stack.size());
    }


    public static void main(String[] args) {
        System.out.println("\n2. Stack of Strings");
        stackOfIString();
        System.out.println("1. Stack of integers");
        stackOfIntegers();

    }
}
