package SistemaMatricula;

import java.util.Scanner;

public class Alumno extends Object{
    Scanner entrada = new Scanner(System.in);
    private String codigo;
    private String nombre;
    private String apellido;
    
    public Alumno(){
        codigo = "";
        nombre = "";
        apellido = "";
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
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public void ingresarDatos(){
        
        do{
          System.out.print("Código: ");
          codigo = entrada.nextLine();
        }while(codigo.length() != 8);
        
        System.out.print("Nombres: ");
        nombre = entrada.nextLine();
        setNombre(nombre.toUpperCase());
        System.out.print("Apellidos: ");
        apellido = entrada.nextLine();
        setApellido(apellido.toUpperCase());
    }
    
    @Override
    public String toString(){
        return String.format( "%s %s %s%s %s\n",
        codigo,"-",nombre,",",apellido);
    }

}
