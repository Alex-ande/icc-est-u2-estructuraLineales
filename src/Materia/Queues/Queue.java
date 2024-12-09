package Materia.Queues;
import java.util.NoSuchElementException;
import Materia.Models.Nodo;

public class Queue {
   private Nodo front;  // nodo al frenye dela cola
   private Nodo rear;  // nodo al frente de la cola

   public Queue (){
    this.front = null;
    this.rear = null;
   }
// metdo para encolar nodos
   public void enqueue (int value){
   Nodo newNodo = new Nodo(value);
   if (isEmpty()) {
    front = newNodo;
    rear = newNodo;
   } else{
    rear.setNext(newNodo);
    rear = newNodo;
   }
   }
   // desencolar nod
   public Nodo dequeue (){
    if (isEmpty()) {
        throw new NoSuchElementException(); 
    }
    Nodo nodo = front;
    front= front.getNext();
    if ( front == null) {
        rear = null;
    }

    return nodo;
   }
 public Nodo peek (){
    if (isEmpty()) {
        throw new NoSuchElementException();
    }
    return front;
 }
  
   public boolean isEmpty(){
    return front == null;
   }

}
