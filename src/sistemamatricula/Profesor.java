package sistemamatricula;


import java.util.Scanner;

public class Profesor {
    Scanner entrada = new Scanner(System.in);
    private String codigo;
    private String nombre;
    private String apellido;
    
    public Profesor(){
        codigo = "";
        nombre = "";
        apellido = "";
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    
    public void ingresarDatos(){
        
        do{
          System.out.print("Código: ");
          codigo = entrada.next();
        }while(codigo.length() != 8);
        
        System.out.print("Nombres: ");
        nombre = entrada.next();
        setNombre(nombre.toUpperCase());
        System.out.print("Apellidos: ");
        apellido = entrada.next();
        setApellido(apellido.toUpperCase());
    }
    
    @Override
    public String toString(){
        return String.format( "%s %s %s%s %s\n",
        codigo,"-",nombre,",",apellido);
    }
}
