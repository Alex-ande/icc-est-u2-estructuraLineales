package Materia. Ejercicio_02_sorting;
import java.util.Stack;
public class Ejercicio02StackSorting {
    public static void ordenarStack(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>();
        while (!stack.isEmpty()) {
            int temp = stack.pop();
            while (!tempStack.isEmpty() && tempStack.peek() > temp) {
                stack.push(tempStack.pop());
            }
            tempStack.push(temp);
        }

        // Copiar de tempStack de regreso a stack original
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }

    
}
