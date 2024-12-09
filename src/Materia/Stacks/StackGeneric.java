package Materia.Stacks;
import Materia.Models.NodoGeneric;
import java.util.EmptyStackException;

public class StackGeneric <T>{
    private NodoGeneric<T> top;
    private int size;

    public StackGeneric (){
        // crea una pila instanciando el nodo top como null y el tamanio en 0
        this.top= null;
        this.size= 0;
    }

    // metdo para agregar un elemento a la pila
    public void push (T data){
   NodoGeneric<T> newNodo = new NodoGeneric<>(data);
   newNodo.setNext(top);
   top = newNodo;
   size++;
    }

    //Metodo para retirara un elemto de la pila

    public T pop(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T value = top.getValue();
        top = top.getNext();
        size--;
        return value;
    
    }

    // metdo que retorna el valor del nodo de la cima

    public T peek(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.getValue();
    }
    public boolean isEmpty(){
        return top == null;
    }
    public NodoGeneric (){
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        NodoGeneric<T> value = top.getValue();
    }

    public void printStack (){
        NodoGeneric<T> current = top;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }

    public int getSize (){
        int size = 0;
        NodoGeneric <T> current = top;
        while (current != null) {
            size++;
            current = current.getNext();
        }
        return size;
    }
}
