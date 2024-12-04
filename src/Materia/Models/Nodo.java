package Materia.Models;

public class Nodo {
  private int value;
  private Nodo next;   
  
  public Nodo (int value){
this.next = null;
this.value = value;
  }
@Override
  public String toString (){
    return "Nodo [value ="+  value + "]";
  }

public int getValue() {
    return value;
}

public void setValue(int value) {
    this.value = value;
}

public Nodo getNext() {
    return next;
}

public void setNext(Nodo next) {
    this.next = next;
}

  
}
