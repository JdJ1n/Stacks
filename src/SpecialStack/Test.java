package SpecialStack;

// 这是一个测试类，用于测试 SpecialArrayStack 的所有功能。
public class Test {
    public static void main(String[] args) {
        SpecialArrayStack stack =new SpecialArrayStack();

        stack.push(1);
        System.out.println("After pushing, the stack is: " + stack);
        stack.push(2);
        System.out.println("After pushing, the stack is: " + stack);
        stack.push(3);
        System.out.println("After pushing, the stack is: " + stack);
        stack.push(3);
        stack.push(32);
        stack.push(31);
        stack.push(3);
        stack.push(32);
        System.out.println("After pushing, the stack is: " + stack);

        System.out.println("The max element in the stack is: " + stack.getMax());

        System.out.println("Pop element from stack: " + stack.pop());
        System.out.println("After popping, the stack is: " + stack);

        System.out.println("The top element in the stack is: " + stack.top());

        System.out.println("The size of the stack is: " + stack.size());
        System.out.println("The max element in the stack is: " + stack.getMax());
        System.out.println("the stack is: " + stack);

        System.out.println("Is the stack empty? " + stack.isEmpty());

        System.out.println("Is the stack full? " + stack.isFull());

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println("The top element in the stack is: " + stack.top());

        System.out.println("The size of the stack is: " + stack.size());
        System.out.println("The max element in the stack is: " + stack.getMax());
        System.out.println("the stack is: " + stack);

        stack.pop();
        stack.pop();

        System.out.println("The top element in the stack is: " + stack.top());
        System.out.println("The size of the stack is: " + stack.size());
        System.out.println("The max element in the stack is: " + stack.getMax());
        System.out.println("the stack is: " + stack);

        stack.pop();

        System.out.println("Is the stack empty? " + stack.isEmpty());
        stack.push(5);
        System.out.println("The top element in the stack is: " + stack.top());
        System.out.println("The size of the stack is: " + stack.size());
        System.out.println("The max element in the stack is: " + stack.getMax());
        System.out.println("the stack is: " + stack);
    }
}

