//Este proyecto tiene contenido desde semana 7 a semana 14 del curso de Programacion 1
//Vamos a crear un ATH utilizando menus, ciclos, condicionales, objetos, etc
package introprogramacioni;
import java.util.Scanner;

public class IntroProgramacionI {

    public static void main(String[] args) {
    try
      {
         Scanner read = new Scanner(System.in);
         int option = 0;
         int debitWanted = 0;
         int createClienteInd = 0;
         account newAccount = new account(null, null, 0, null, null);
         
         System.out.println("Create a client? S=1/N=0"); 
         createClienteInd = read.nextInt();
                
             switch(createClienteInd)
             {
                //String customerName, String custumerLastName,double balance,String userPin, String accountNumber
                case 1:
                    System.out.println("Client name:" );  
                    newAccount.setCustomerName(read.next());
                    System.out.println("Client last name:" );  
                    newAccount.setCustumerLastName(read.next());
                    System.out.println("Account balance:" );  
                    newAccount.setBalance(read.nextDouble());
                    System.out.println("User userpin:" );  
                    newAccount.setUserPin(read.next());
                    System.out.println("Client account number:" );  
                    newAccount.setAccountNumber(read.next());
                    break;
                case 2:
                    createClienteInd = 1;  
                    break;
            }
         System.out.println(newAccount.getUserPin());
         System.out.println("Put the pin to access to the ATH"); 
         if(read.next().equals(newAccount.getUserPin()))
         {
            do
            {
                System.out.println("Welcome to the Ulacit ATH"); 
                System.out.println("Here is the menu:");
                System.out.println("Press 1 to check your balance");
                System.out.println("Press 2 to extract money from your account");
                System.out.println("Press 3 to add money to your account");
                System.out.println("Press 0 to exit");
                option = read.nextInt();
                
                switch(option){
                    case 1:
                          System.out.println("The balance of your account is:" + newAccount.getBalance());   
                    break;
                    case 2:
                          System.out.println("How much money you want from you account?" ); 
                          debitWanted = read.nextInt();
                            if(newAccount.extractMoney(debitWanted) == true)
                            {
                               System.out.println("The balance of your account is:" + newAccount.getBalance()); 
                            }
                            else
                            {
                               System.out.println("Please check your account balance...");
                            }
                    break;
                    case 3:
                          System.out.println("How much money you want to add to your account?" ); 
                          debitWanted = read.nextInt();    
                          newAccount.addMoney(debitWanted);
                          System.out.println("The balance of your account is:" + newAccount.getBalance());    
                    break;
                    case 0:
                    break;
                }
                   
            }
            while(option == 1 || option == 2 || option == 3); 
         }
      
      } 
    catch(Exception e)
    {
       System.out.println("A ocurrido un error con tus datos: " +  e);   
    }
   }
}
    

