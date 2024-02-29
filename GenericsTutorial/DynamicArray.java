package GenericsTutorial;

import java.util.Arrays;
import java.util.StringJoiner;

public class DynamicArray<T> {

    private static final int DEFAULT_CAPACITY = 10;
    private int size;
    private T[] elements;

    public DynamicArray() {
        elements = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(T item) {
        if(size == elements.length) {
            grow();
        }
        elements[size++] = item;
    }

    public void grow() {
        int newCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }

    public T get(int index) {
        if(index < 0 || index >=size) {
            throw new IndexOutOfBoundsException();
        }
        return elements[index];
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ");
        for(int i = 0; i < size; i++) {
            joiner.add(String.valueOf(elements[i]));
        }
        return joiner.toString();
    }
}
