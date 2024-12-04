package Materia.Stacks;
import java.util.EmptyStackException;

import Materia.Models.Nodo;;

public class Stack {
    private Nodo top ;
    public Stack () {
        this.top = null;
    }

    public void push (int value){
      Nodo newNodo = new Nodo (value);  
      newNodo.setNext(top);
      top = newNodo;
    }

    public int pop (){
        if (isEmpty()) {
         throw new EmptyStackException();
        }
        int value = top.getValue ();
        top = top.getNext ();
        return value;
       }
       public int peek () {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.getValue();
       }
     
       public boolean isEmpty () {
        return top == null;
       }

       public void getSize (){
        return -1;
       }
}
