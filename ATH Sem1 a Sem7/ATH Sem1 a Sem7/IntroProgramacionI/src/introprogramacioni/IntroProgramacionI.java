//Este proyecto tiene contenido desde semana uno a semana 7 del curso de Programacion 1
//Vamos a crear un ATH utilizando menus, ciclos, condicionales, etc
package introprogramacioni;
import java.util.Scanner;

public class IntroProgramacionI {

    public static void main(String[] args) {
    try
      {
         Scanner read = new Scanner(System.in);
         int pin = 123; //supongamos que el pin es este
         int option = 0;
         int accountBalance = 3500; //supongamos que este es el balance del cliente
         int debitWanted = 0;
         
         
         System.out.println("Put your pin"); 
         if(read.nextInt() == 123)
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
                          System.out.println("The balance of your account is:" + accountBalance);   
                    break;
                    case 2:
                          System.out.println("How much money you want from you account?" ); 
                          debitWanted = read.nextInt();
                            if(accountBalance > debitWanted )
                            {
                               accountBalance = accountBalance - debitWanted;
                               System.out.println("The balance of your account is:" + accountBalance); 
                            }
                            else
                            {
                               System.out.println("Please check your account balance...");
                            }
                    break;
                    case 3:
                          System.out.println("How much money you want to add to your account?" ); 
                          debitWanted = read.nextInt();    
                          accountBalance = accountBalance + debitWanted;
                          System.out.println("The balance of your account is:" + accountBalance);    
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
