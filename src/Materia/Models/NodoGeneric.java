package Materia.Models;

import Models.Contact;

public class NodoGeneric <T>{
    private T value;
  private NodoGeneric <T> next;   
  
  public NodoGeneric (T value){
this.next = null;
this.value = value;
  }

  

public T getValue() {
    return value;
}

public void setValue(T value) {
    this.value = value;
}

public NodoGeneric<T> getNext() {
    return next;
}

public void setNext(NodoGeneric<T> next) {
    this.next = next;
}
@Override
public String toString (){
  return "Nodo [value ="+  value + "]";
}

  
}

