//IFT2015_TP1
//Jiadong Jin 20150692
package Stack;

public class Test {
    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<Integer>();
        System.out.println("isEmpty: " + stack.isEmpty());
        for (int i = 0; i < 100; i++) {
            stack.push(i);
        }

        //stack.push("12")
        System.out.println("toStr: " + stack);

        System.out.println("top: " + stack.top());

        System.out.println("size: " + stack.size());

        System.out.println("isFull: " + stack.isFull());

        System.out.println("isEmpty: " + stack.isEmpty());

        System.out.println("pop: " + stack.pop());

        System.out.println("toStr: " + stack);
    }
}

