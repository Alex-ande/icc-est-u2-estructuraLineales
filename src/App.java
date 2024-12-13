
import java.util.Stack;

import Controllers.MenuController;
import Materia.Stacks.StackGeneric;
import Models.Pantalla;
import Materia.Ejercicio_01_sign.Ejercicio01SignValidation;
import Materia.Ejercicio_02_sorting.Ejercicio02StackSorting;
import Materia.Queues.*;

public class App {

  


    public static void main(String[] args) throws Exception {
 System.out.println("Ejercicio 01: Validación de Signos");
        String[] testStrings = {"([]){}", "({)}", "[({})]", "(]", ""};
        for (String s : testStrings) {
            System.out.println("Input: " + s + " -> Output: " + Ejercicio01SignValidation.esValido(s));
        }

        // Ejercicio 02: Ordenar un Stack
        System.out.println("\nEjercicio 02: Ordenar un Stack");
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println("Antes de ordenar: " + stack);
        Ejercicio02StackSorting.ordenarStack(stack);
        System.out.println("Después de ordenar: " + stack);

     //   MenuController menuController = new MenuController();
      //  menuController.showMenu();

        // runStack();
    }

    // public static void runStack() {
    // Stack stack = new Stack();

    // stack.push(5);
    // stack.push(7);
    // stack.push(10);
    // stack.push(20);

           //System.out.println("Cima -> "+stack.peek());System.out.println("Retirar -> "+stack.pop());System.out.println("Cima -> "+stack.peek());System.out.println("Retirar -> "+stack.pop());System.out.println("Cima -> "+stack.peek());
    // }

    // public static void runStackGeneric(){
          // StackGeneric<Pantalla> router = new StackGeneric<>();router.push(new Pantalla(1,"Hpme page","/home"));router.push(new Pantalla(1,"Hpme page","/home/menu"));router.push(new Pantalla(1,"Hpme page","/home/menu/users"));

          // System.out.println("esto y en "+router.peek().getRuta());System.out.println("regreso a "+router.pop());System.out.println("estoy en"+router.peek().getRuta());

           //router.push(new Pantalla(1,"Settings page","/home/menu/users/settings"));

          // System.out.println("Pantallas = "+router.getSize());System.out.println("estoy en "+router.peek().getRuta());router.printStack();

          // }

          // public void runQueue() {
              // Queue cola = new Queue();

              // cola.enqueue(10);
           //    cola.enqueue(20);
            //   cola.enqueue(30);
             //  cola.enqueue(40);

             //  System.out.println(cola.peek());
             //  System.out.println(cola.dequeue());
             //  System.out.println(cola.dequeue());
              // System.out.println(cola.peek());
   // }
}

