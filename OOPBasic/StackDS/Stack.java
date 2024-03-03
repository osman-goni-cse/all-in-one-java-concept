package OOPBasic.StackDS;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.StringJoiner;

public class Stack {
    private static int DEFAULT_CAPACITY = 10;
    private char[] elements = new char[DEFAULT_CAPACITY];
    private int count;

    public void push(char ch) {
        if(isFull()) {
            grow();
        }
        elements[count++] = ch;
    }

    public boolean isFull() {
        return count == elements.length;
    }

    public void grow() {
        Arrays.copyOf(elements, elements.length * 2);
    }

    public char pop() {
        if(!isEmpty()) {
            return elements[--count];
        }
        else {
            throw new NoSuchElementException();
        }
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
        System.out.println("Elements: "  + joiner);
    }

}
