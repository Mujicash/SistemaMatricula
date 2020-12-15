package SistemaMatricula;

import java.util.ArrayList;

public class AlumnoMatricula {
    private Alumno A;
    private ArrayList<Curso> C;
    private int cantCurso;

    public AlumnoMatricula(){
        A = new Alumno();
        C = new ArrayList<Curso>();
        cantCurso = 0;
    }
    
    public void setAlumno(Alumno alumno){
        A = alumno;
    }
    
    public Alumno getALumno(){
        return A;
    }
    
    public int getCantCurso(){
        return cantCurso;
    }
    
    public void setCurso(Curso curso){
        if(cantCurso < 7){
            this.C.add(curso);
            cantCurso++;
        }
        else{
            System.out.println("No se puede matricular en mas de 7 cursos");
        }
    }
    
    public Curso getCurso(int posicion){
        return C.get(posicion);
    }
}
