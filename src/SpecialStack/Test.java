package SpecialStack;

// 这是一个测试类，用于测试 SpecialArrayStack 的所有功能。
public class Test {
    public static void main(String[] args) {
        SpecialArrayStack<Integer> stack = new SpecialArrayStack<Integer>();

        // 测试 push 方法和 toString 方法
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(3);
        stack.push(32);
        stack.push(31);
        stack.push(3);
        stack.push(32);
        System.out.println("After pushing 1, 2, 3, the stack is: " + stack.toString());

        // 测试 getMax 方法
        System.out.println("The max element in the stack is: " + stack.getMax());
        System.out.println("The max element in the stack is: " + stack.getMax());

        // 测试 pop 方法
        System.out.println("Pop element from stack: " + stack.pop());
        System.out.println("After popping, the stack is: " + stack.toString());

        // 测试 top 方法
        System.out.println("The top element in the stack is: " + stack.top());

        // 测试 size 方法
        System.out.println("The size of the stack is: " + stack.size());
        System.out.println("The max element in the stack is: " + stack.getMax());

        // 测试 isEmpty 方法
        System.out.println("Is the stack empty? " + stack.isEmpty());

        // 测试 isFull 方法
        System.out.println("Is the stack full? " + stack.isFull());
    }
}

