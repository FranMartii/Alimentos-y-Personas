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
    private int caloriasTotales;
    private int maxCalorias;

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
        return caloriasTotales;
    }

    public int comer(Comida comida){
        int caloriasEstaComida = -1;
        if (getCaloriasIngeridas() <= getCaloriasTotales()){
            caloriasEstaComida = comida.getCalorias();
            caloriasTotales += comida.getCalorias();
        }
        return caloriasEstaComida;
    }

    public String contestar(String pregunta){
        System.out.println(pregunta);
        String respuesta = "NO";
        if(getCaloriasIngeridas() <= getCaloriasTotales() && !pregunta.contains(nombre)){
            if(pregunta.length() % 3 == 0){
                respuesta = "SI";
            }
        }
        if(getCaloriasIngeridas() > getCaloriasTotales() || pregunta.contains(nombre)){
            respuesta = pregunta.toUpperCase();
        }
        System.out.println(respuesta);
        return respuesta;        
    }

    public String getAlimentoMasCaloricoConsumido(){
        return "";
    }
    
    public int getCaloriasTotales(){
        int maxCalorias = (10 * pesoPersona) + (6 * alturaPersona) + (5 * edad) - 161;
        if(hombre){
            maxCalorias = (10 * pesoPersona) + (6 * alturaPersona) + (5 * edad) + 5;
        }
        return maxCalorias;
    }
}
