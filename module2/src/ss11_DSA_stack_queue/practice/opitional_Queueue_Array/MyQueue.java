package ss11_DSA_stack_queue.practice.opitional_Queueue_Array;

public class MyQueue {
    public int capacity;
    public int[] queueArr;
    public int head;
    public int tail;
    public int curentSize;

    public MyQueue(int queueSize) {
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }

    public boolean isQueueFull() {
        boolean status = false;
        if (curentSize == capacity) {
            status = true;
        }
        return status;
    }

    public boolean isQueueEmpty() {
        boolean status = false;
        if (curentSize == 0) {
            status = true;
        }
        return status;
    }

    public void enqueue(int item) {
        if (isQueueFull()) {
            System.out.println("Đầy ! Không thể thêm phần tử " + item);
        } else {
            tail++;
            if (tail == capacity - 1) {
                tail = 0;
            }
            queueArr[tail] = item;
            curentSize++;
            System.out.println("Giá trị " + item + " được đẩy vào hàng đợi !");
        }
    }

    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Hàng đợi trống ! không thể xóa giá trị khỏi hàng đợi!");
        } else {
            head++;
            if (head == capacity - 1) {
                System.out.println("Thao tác hoàn tất loại bỏ : " + queueArr[head - 1]);
            } else {
                System.out.println("Thao tác hoàn tất loại bỏ : " + queueArr[head - 1]);
            }
            curentSize--;
        }
    }


}
