package OOPBasic.StackDS;

public class StackDemo {
    public static void main(String[] args) {
        System.out.println("******* Stack Data Structure *********");
        Stack stack = new Stack();
        stack.push('0');
        stack.push('1');
        stack.push('5');
        stack.printElements();
        System.out.println("Popped out: " + stack.pop());
        stack.printElements();
        stack.push('9');
        stack.printElements();
        System.out.println("Size of the stack: " + stack.size());
    }
}
