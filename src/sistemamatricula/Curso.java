package SistemaMatricula;

import java.util.Scanner;

public class Curso{
    Scanner entrada = new Scanner(System.in);
    private String codigo;
    private String nombre;
    private double promLab;
    private double promCali;
    private double exaParcial;
    private double exaFinal;
    private double exaSusti;
    private double exaPromedio;
    
    public Curso(){
        codigo = "";
        nombre = "";
    }
    
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void ingresarDatos(){
        System.out.print("Nombre del curso: ");
        nombre = entrada.nextLine();
        setNombre(nombre.toUpperCase());
    }
    
    @Override
    public String toString(){
        return String.format( "%s %s %s\n",
        codigo,"-",nombre);
    }
    
}
