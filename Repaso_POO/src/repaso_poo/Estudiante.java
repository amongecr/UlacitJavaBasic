package repaso_poo;

public class Estudiante extends Persona{
    
    private int PorcentajeBeca = 0;
    private String Carrera = "";
    
    public Estudiante(String pNombre, String pApellido, String pEmail,
            int pPorcentajeBeca,String pCarrera)
    {
        super(pNombre, pApellido, pEmail);
        this.PorcentajeBeca = pPorcentajeBeca;
        this.Carrera = pCarrera;
        
    }

    public int getPorcentajeBeca() {
        return PorcentajeBeca;
    }

    public void setPorcentajeBeca(int PorcentajeBeca) {
        this.PorcentajeBeca = PorcentajeBeca;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }
    
    
    
    
    
}
