import java.util.*;

/**
 * Write a description of class Persona here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Persona
{

    private String nombre;
    private boolean hombre;
    private int pesoPersona;
    private int alturaPersona;
    private int edad;
    
    /**
     * Constructor
     */
    public Persona(String nombre,boolean hombre,int pesoPersona,int alturaPersona,int edad)
    {
        this.nombre = nombre;
        this.hombre = hombre;
        this.pesoPersona = pesoPersona;
        this.alturaPersona = alturaPersona;
        this.edad = edad;
    }

    public int getCaloriasIngeridas(){
        return 1;
    }
    
    public Comida comer(Comida comida){
        return comida;
    }
    
    public String contestar(String texto){
        return texto;
    }
    
    public String getAlimentoMasCaloricoConsumido(){
        return "";
    }
}
