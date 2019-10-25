
package repaso_poo;

public class Repaso_POO {


    public static void main(String[] args) {
        
      String nombre = "Allan";
      String email = "allan.monge119@gmail.com";
      
      ValidationPersona validador = new ValidationPersona();
      
      if(validador.AtributosCorrectos(nombre, email))
      {
          Persona Cleo = new Persona(nombre, email, "");
          System.out.println("Persona creada");
      }
      else
      {
          System.out.println("Los parametros estan incorrectos");
      }
      
      
      Estudiante Goku = new Estudiante("Goku","Kakaroto", 
              "test", 50, "Ing Sistemas");
      
           
        
    }
    
}
