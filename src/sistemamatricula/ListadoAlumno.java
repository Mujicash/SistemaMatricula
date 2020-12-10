package SistemaMatricula;

import java.util.ArrayList;
import java.util.Scanner;

public class ListadoAlumno {
    Scanner entrada = new Scanner(System.in);
    private ArrayList <Alumno> Alum; 
    private int cantAlumnos;
    
    public ListadoAlumno(){
        this.Alum = new ArrayList<Alumno>();
        this.cantAlumnos = 0;
    }
    
    public void setAlumnos(){
        do{
            System.out.print("Cantidad de alumnos a ingresar: ");
            cantAlumnos = entrada.nextInt();
        }while(cantAlumnos <= 0 || cantAlumnos >= 999);
        
        //A = new Alumno[cantAlumnos];
        
        
        for(int i=0; i<cantAlumnos; i++){
            Alumno it = new Alumno();
            it.ingresarDatos();
            Alum.add(it);
            //A[i] = new Alumno();
            //A[i].ingresarDatos();
        }
    }
    
    public void mostrarAlumno(){
        
        if(cantAlumnos > 0){
            System.out.println("Lista de alumnos registrados");
            for(Alumno i: Alum){
                System.out.printf("%s",i);                
            }
        }
        else{
            System.out.println("Error, no existen alumnos registrados.");            
        }
    }
    
    public int validarCodigoAlumno(String codigo){
        int pos = -1;
        
        for(int i=0; i<Alum.size(); i++){
            if((Alum.get(i).getCodigo()).equals(codigo)){
                return i;
            }
        }
        
        return pos;
    }
    
    public Alumno getAlumno(int posicion){
        return Alum.get(posicion);
    }
}
