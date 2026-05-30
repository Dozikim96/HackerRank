import java.util.Stack;
public class st {
    public static void main(String[] args) {
        System.out.println("This is Stack");
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.pop();
        System.out.println(s.peek());
    }
}
