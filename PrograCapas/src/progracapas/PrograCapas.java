
package progracapas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class PrograCapas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try 
        {

           BLL_Persona bll_persona = new BLL_Persona();
           boolean result = bll_persona.InsertarPersona("Gabriel");
           //bll_persona.DeletePersona("allan");
           
           

           
        } catch (Exception e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }
    }
    
}
