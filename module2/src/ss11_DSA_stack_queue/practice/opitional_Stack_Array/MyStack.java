package ss11_DSA_stack_queue.practice.opitional_Stack_Array;

import java.util.Arrays;

public class MyStack {
    public int[] arr;
    public int size;
    public int index = 0;

    public MyStack(int size) {
        this.size = size;
        arr = new int[size];
    }

    public void push(int element) {
        if (isFull()) {
            System.out.println(("Stack is full"));
        }
        arr[index] = element;
        index++;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is null!");
        } else {
            return arr[--index];
        }
    }

    public int size() {
        return index;
    }

    public boolean isEmpty() {
        boolean status = true;
        if (size == 0) {
            System.out.println("Stack đang rỗng !");
            return status;
        } else {
            System.out.println("Stack có chưa phần tử !");
            status = false;
            return status;
        }
    }

    public boolean isFull() {
        boolean status = true;
        if (index == size) {
            System.out.println("Stack đầy 1");
            return status;
        } else {
            System.out.println("Stack chưa đầy");
            status = false;
            return status;
        }
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size +
                ", index=" + index +
                '}';
    }
}
