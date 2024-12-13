package Controllers;

import Materia.Models.NodoGeneric;
import Models.Contact;
import Models.LinkedList;

public class ContactManager {
  private LinkedList<Contact<?, ?>> contacts;

  public ContactManager() {
    this.contacts = new LinkedList<>();
  }

  public void addContact(Contact<?, ?> contact) {
    contacts.appendTotal(contact);
  }

  public Contact<?, ?> findContactByName(String name) {
    NodoGeneric<Contact<?, ?>> current = contacts.getHead();
    while (current != null) {
      if (((String) current.getValue().getName()).equalsIgnoreCase(name)) {

        return current.getValue();

      }
      current = current.getNext();
      System.out.println(current);
      System.out.println(current.getNext());

    }
    return null; // no se encotro un contacto de ese nombre
  }

  public void deleteContactByName(String name) {
    NodoGeneric<Contact<?, ?>> current = contacts.getHead();
    if (current == null) {
      return;
    }

      // caso que el contacto sea la mead o cabesa
      if (((String) current.getValue().getName()).equalsIgnoreCase(name)) {
        contacts.setHead(contacts.getHead().getNext());
        contacts.setSize(contacts.getSize() - 1);
        return;
      }

      // caso 2 en el resto}

      while (current.getNext() != null) {
        if (((String) current.getNext().getValue().getName()).equalsIgnoreCase(name)) {
          current.setNext(current.getNext().getNext());
          contacts.setSize(contacts.getSize() - 1);

          return;
        }
        current = current.getNext();

      }
    
  }

  public void printList() {
    if (contacts.getSize() == 0) {
      System.out.println("no hay contactos en la lista: ");
      return;
    }
    NodoGeneric<Contact<?, ?>> current = contacts.getHead();
    while (current != null) {
      Contact<?, ?>contact = current.getValue();
      System.out.println("nombre: "+ contact.getName()+", telefono: "+ contact.getPhone());
      current = current.getNext();
    }
  }
}
