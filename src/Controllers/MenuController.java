package Controllers;


import Models.Contact;


import View.ConsoleView;

public class MenuController {
    private ContactManager contactManager;
    private ConsoleView ConsoleView;

    public MenuController (){
        this.contactManager = new ContactManager();
        this.ConsoleView = new ConsoleView();
    }

    public void showMenu (){
        boolean exit = false;
        while (!exit) {
            ConsoleView.displayMenu();
            String option = ConsoleView.getInput("");
        switch (option) {
            case "1":
              addContac();  
                break;
                case "2":
            findContac();
                break;
                case "3":
              deleteContact();
                break;
                case "4":
             printList(); 
                break;
                case "5":
                exit = true;
                ConsoleView.showMessage("Exit............");
                break;
            default:
            ConsoleView.showMessage("Invalit option");
                break;
        }


        }


    }

    private void addContac (){
        String name = ConsoleView.getInput("Enter name: ");
        String phone  = ConsoleView.getInput("Enter phone: ");
        Contact<String, String> contact = new Contact<>(name,phone);
        contactManager.addContact( contact);
            ConsoleView.showMessage("contac: ");
       
    }

    private void findContac(){
        String name = ConsoleView.getInput("enter a name to search");
        Contact<?, ?> contact = contactManager.findContactByName(name);
        if (contact != null) {
            ConsoleView.showMessage("contac foud: "+ contact);
            
        }else{
            ConsoleView.showMessage("contact error 44");
        }
    }
    private void deleteContact (){
        String name = ConsoleView.getInput("enter a name to delete: ");
        contactManager.deleteContactByName(name);
        ConsoleView.showMessage("contact delete");

    }

    private void printList (){
        ConsoleView.showMessage("lista");
        contactManager.printList();

    }

}
