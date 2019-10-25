package repaso_poo;

public class petFrindly extends Estudiante{
    
    private int ID = 0;
    private String nombre = "";
    
    public petFrindly(String pNombre, String pApellido, String pEmail,
            int pPorcentajeBeca,String pCarrera, int pID)
    {
        super(pNombre, pApellido, pEmail, pPorcentajeBeca, pCarrera);
        this.ID = pID;
    }
    
}
