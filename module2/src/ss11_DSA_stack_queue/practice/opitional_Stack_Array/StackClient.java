package ss11_DSA_stack_queue.practice.opitional_Stack_Array;

public class StackClient {
    public static void main(String[] args) throws Exception {
        MyStack stack = new MyStack(5);
        System.out.println(stack.size);
        stack.isEmpty();
        stack.isFull();
        stack.push(11);
        System.out.println(stack);
    }
}
