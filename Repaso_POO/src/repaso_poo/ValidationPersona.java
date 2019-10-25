package repaso_poo;

public class ValidationPersona {
    
    public ValidationPersona(){}
    
    public boolean AtributosCorrectos(String pNombre, String pEmail)
    {
        boolean resultado = true;
        
        if(pNombre.equals(""))
        {
            resultado = false;
        }
        
        if(!pEmail.contains("@"))
        {
            resultado = false;
        }
       
        return resultado;
    }
    
}
