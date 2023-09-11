package ss10_danh_sach.exercise.arraylist_nomal;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = (Object[]) new Object[DEFAULT_CAPACITY];
    };

    public MyList(int capacity) {
        if (capacity >= 0) {
            elements = (Object[]) new Object[capacity];
        } else {
            throw new IllegalArgumentException(String.valueOf(capacity));
        }
    }

    public void add(int index, E element) {
        if (index > elements.length) {
            throw new IllegalArgumentException(String.valueOf(index));
        } else if (elements.length == size) {
            this.ensureCapacity(5);
        } if (elements[index] == null) {
            elements[index] = element;
            size++;
        } else {
            for (int i = 0; i < elements.length; i++) {
              elements[i] = null;
            }
        }
        // oke;
    }

    public E remove(int index) {
        if (index < 0 || index > elements.length) {
            throw new IllegalArgumentException(String.valueOf(index));
        }
        E element = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i +1];
        }
        elements[size - 1] = null;
        size--;
        return element;
        // oke;
    }

    public int size(){
        return size;
        // oke;
    }

//    public E clone(){
//        MyList<E> e = new MyList<>();
//        e.elements = Arrays.copyOf(elements,size);
//        e.size = this.size;
//        return (E) e;
//    }

    public boolean contains(E o){
        return indexOf(o) >= 0;
        // oke;
    }

    public int indexOf(E o){
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.elements[i].equals(o)){
                return i;
            }
        }
        return index;
        // oke;
    }

    public boolean add(E element){
        if (elements.length == size){
            this.ensureCapacity(3);
        }
        elements[size] = elements;
        size++;
        return true;
        // oke;
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements,newSize);
        } else {
            throw new IllegalArgumentException(String.valueOf(minCapacity));
        }
        // oke;
    }

    public E get(int i){
        return (E) elements[i];
        // oke;
    }

    public void clear(){
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
        // oke;
    }

    @Override
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}
