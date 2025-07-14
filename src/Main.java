public class Main {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        System.out.println(stack);
//        var top = stack.pop();
//        System.out.println(top);
//        System.out.println(stack);
//        var sneak = stack.peek();
//        System.out.println(sneak);
//        System.out.println(stack);
//        String str="abcd";
//        StringReverser reverser = new StringReverser();
//        String result = reverser.reverse(str);
//
//        System.out.println(result);

        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
    }
}