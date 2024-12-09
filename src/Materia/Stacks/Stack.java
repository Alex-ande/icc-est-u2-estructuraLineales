package Materia.Stacks;
import java.util.EmptyStackException;

import Materia.Models.Nodo;;

public class Stack {

    private Nodo top ;
   private int size;
   
    public Stack () {
        this.top = null;
        this.size = 0;

    }

    

    public void push (int value){
      Nodo newNodo = new Nodo (value);  
      newNodo.setNext(top);
      top = newNodo;
      size++;
    }

    public int pop (){
        if (isEmpty()) {
         throw new EmptyStackException();
        }
        int value = top.getValue ();
        top = top.getNext ();
        size--;
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

       public void printStak (){
        Nodo current = top ;
        while (current != null) {
            System.out.println(current.getValue());}
            current = current.getNext();
        }
       

       public int getSize (){
       
        return size;
       }
}

