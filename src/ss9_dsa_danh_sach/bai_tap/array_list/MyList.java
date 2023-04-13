package ss9_dsa_danh_sach.bai_tap.array_list;

import java.util.Arrays;

public class MyList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private int size = 0;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    public E get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index :" + index + ", size :" + index);
        }
        return (E) elements[index];
    }

    public void remove(E e) {
        for (int i = 0; i < size; i++) {
            if (e == elements[i]) {
                for (int j = i; j < size - 1; j++) {
                    elements[i] = elements[i + 1];
                }
                elements[size - 1] = null;
            }
        }
    }

    @Override
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}
