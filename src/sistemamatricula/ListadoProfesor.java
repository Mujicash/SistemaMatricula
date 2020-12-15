package sistemamatricula;

import java.util.ArrayList;
import java.util.Scanner;

public class ListadoProfesor {
    Scanner entrada = new Scanner(System.in);
    private ArrayList<Profesor> prof;
    private int cantProfesores;
    
    public ListadoProfesor(){
        prof = new ArrayList<Profesor>();
        cantProfesores = 0;
    }
    
    public void setProfesores(){
        do{
            System.out.print("Cantidad de alumnos a ingresar: ");
            cantProfesores = entrada.nextInt();
        }while(cantProfesores <= 0 || cantProfesores >= 999);
        
        for(int i=0; i<cantProfesores; i++){
            Profesor it = new Profesor();
            it.ingresarDatos();
            prof.add(it);
        }
    }
    
    public void mostrarProfesores(){
        if(cantProfesores > 0){
            System.out.println("Lista de profesores registrados");
            for(Profesor i: prof){
                System.out.printf("%s",i);                
            }
        }
        else{
            System.out.println("Error, no existen profesores registrados.");            
        }
    }
    
    public int validarCodigoProfesor(String codigo){
        int pos = -1;
        
        for(int i=0; i<prof.size(); i++){
            if((prof.get(i).getCodigo()).equals(codigo)){
                return i;
            }
        }
        
        return pos;
    }
    
    public Profesor getAlumno(int posicion){
        return prof.get(posicion);
    }
}
