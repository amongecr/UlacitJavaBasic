
package repaso_poo;

public class Persona {
    
    private String Nombre = "";
    private String apellido = "";
    private String email = "";
    private int ID  = 0;
    
    public Persona(String pNombre, String pApellido, String pEmail)
    {
        this.Nombre = pNombre;
        this.apellido = pApellido;
        this.email = pEmail;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    

    
}
