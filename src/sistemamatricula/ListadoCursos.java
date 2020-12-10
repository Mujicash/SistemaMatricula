package SistemaMatricula;

import java.util.ArrayList;
import java.util.Scanner;

public class ListadoCursos {
    Scanner entrada = new Scanner(System.in);
    //private Curso C[];
    private ArrayList<Curso> cur;
    private int cantCursos;
    
    public ListadoCursos(){
        cur = new ArrayList<Curso>();
        cantCursos = 0;
    }
    
    public void setCursos(){
        do{
            System.out.print("Cantidad de cursos a ingresar: ");
            cantCursos = entrada.nextInt();
        }while(cantCursos <= 0 || cantCursos >=999);
        
        //C = new Curso[cantCursos];
        
        for(int i=0; i<cantCursos; i++){
            Curso it = new Curso();
            String cadena = "00000" + (i+1);
            //C[i] = new Curso();
            //C[i].setCodigo(cadena.substring(cadena.length()-3,cadena.length()));
            //C[i].ingresarDatos();
            it.setCodigo(cadena.substring(cadena.length()-3,cadena.length()));
            it.ingresarDatos();
            cur.add(it);
        }
    }
    
    public void mostrarCursos(){
        if(cantCursos > 0){
            System.out.println("Lista de cursos registrados");
            for(Curso i: cur){
                System.out.printf("%s",i);
            }
        }
        else{
            System.out.println("Error, no existen cursos registrados.");
        }
    }
    
    public int validarCodigoCurso(String codigo){
        int pos = -1;
        
        for(int i=0; i<cur.size(); i++){
            if(cur.get(i).getCodigo().equals(codigo)){
                return i;
            }
        }
        
        return pos;
    }
    
    public Curso getCurso(int posicion){
        return cur.get(posicion);
    }
}
