import java.util.Stack;
import Materia.Models.Stacks.Stack;

public class App {
    public static void main(String[] args) throws Exception {
       
        runStack();
    }

    public static void runStack (){
        Stack stack = new Stack();


        stack.push(5);
        stack.push(7);
        stack.push(10);
        stack.push(20);
        
        System.out.println("Cima -> "+stack.peek());
        System.out.println("/n Retirar -> "+stack.pop());
        System.out.println("Cima -> "+stack.peek());
        System.out.println("Retirar -> "+stack.pop());
        System.out.println("Cima -> "+stack.peek());
    }
}
