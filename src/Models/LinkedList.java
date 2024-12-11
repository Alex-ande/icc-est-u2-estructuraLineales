package Models;

import Materia.Models.*;

public class LinkedList <T> {
private NodoGeneric<T> head;
private int size = 0;

public void appendTotal (T value){
    if (head == null ) {
        head = new NodoGeneric<>(value) ;
    }else{
        NodoGeneric <T> current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
    }
    size ++;
}

public void Print (){
    if (head == null) {
        System.out.println("END");
        return ;
    }
        NodoGeneric<T> current = head;
    while (current.getNext() != null) {
        System.out.println(current.getValue()+"->");
        current = current.getNext();
    }
    System.out.println("END");
    }

    public NodoGeneric<T> getHead() {
        return head;
    }
    public void setHead(NodoGeneric<T> head) {
        this.head = head;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
  
    }

    





















