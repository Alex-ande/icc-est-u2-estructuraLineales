package View;

import java.util.Scanner;

public class ConsoleView {
   private Scanner scanner;
   public ConsoleView(){
   this.scanner = new Scanner(System.in);
   }
   public void displayMenu (){
   System.out.println("=== contac Manager Menu ===");
   System.out.println("T1. Add Contac");
   System.out.println("T2. Find Contac");
   System.out.println("T3. Delete Contac");
   System.out.println("T4. Print Contac");
   System.out.println("T5. Exit");
   System.out.println("Choose an option: ");
   
   
   
   }
   public String getInput (String prompt){

    System.out.println("* "+ prompt);
    return scanner.nextLine();
   } 
   public void showMessage (String message){
   System.out.println("--"+ message);
   }
}
