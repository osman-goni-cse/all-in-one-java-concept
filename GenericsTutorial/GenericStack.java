package GenericsTutorial;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.StringJoiner;

public class GenericStack<T> {
    private static final int CAPACITY = 10;
    private T[] elements;
    private int count;

    public GenericStack() {
        this.elements = (T[]) new Object[CAPACITY];
    }

    public void push(T item) {
        if(isFull()) {
            grow();
        }
        elements[count++] = item;
    }

    public boolean isFull() {
        return elements.length == count;
    }

    public void grow() {
        elements = Arrays.copyOf(elements, elements.length * 2);
    }

    public T pop() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        count--;
        return elements[count];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int size() {
        return count;
    }

    public void printElements() {
        StringJoiner joiner = new StringJoiner(",", "[", "]");
        for(int i = 0; i < count; i++) {
            joiner.add(String.valueOf(elements[i]));
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        System.out.println("Generic Stack Implementation");

        GenericStack<Integer> stkInt = new GenericStack<>();
        stkInt.push(1);
        stkInt.push(4);
        stkInt.push(5);

        stkInt.printElements();

        System.out.println("size of the stack: " + stkInt.size());
        System.out.println("Top on the stack: " + stkInt.pop());
        System.out.println("Top on the stack: " + stkInt.pop());
        System.out.println("Top on the stack: " + stkInt.pop());
        stkInt.push(9);
        stkInt.push(13);
        System.out.println("Top on the stack: " + stkInt.pop());
        System.out.println("Top on the stack: " + stkInt.pop());
    }
}
