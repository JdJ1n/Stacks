package DoubleStack;

public class Test {
    public static void main(String[] args) {

        DoubleStack stack = new ArrayDoubleStack<Integer>();

        for (int i = 0; i < 52; i++) {
            stack.push(true, i);
        }
        for (int i = 0; i < 48; i++) {
            stack.push(false, i);
        }
        System.out.println((stack.push(true, 53)));

        stack.print();

        System.out.println("top1: " + stack.top(true));
        System.out.println("top2: " + stack.top(false));

        System.out.println("size1: " + stack.size(true));
        System.out.println("size2: " + stack.size(false));

        System.out.println("isFull: " + stack.isFull());

        System.out.println("pop1: " + stack.pop(true));
        System.out.println("pop2: " + stack.pop(false));

        System.out.println("top1: " + stack.top(true));
        System.out.println("top2: " + stack.top(false));

        stack.print();
    }
}

