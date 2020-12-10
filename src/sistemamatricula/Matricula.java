package SistemaMatricula;

import java.util.ArrayList;
import java.util.Scanner;

public class Matricula {
    Scanner entrada = new Scanner(System.in);
    private ListadoCursos LC;
    private ListadoAlumno LA;
    private ArrayList <AlumnoMatricula> AM;
    private int cantAlumnoMatricula;
    
    public Matricula(){
        LC = new ListadoCursos();
        LA = new ListadoAlumno();
        AM = new ArrayList <AlumnoMatricula>();
        cantAlumnoMatricula = 0;
    }
    
    public void ingresarListaCurso(){
        LC.setCursos();
    }
    
    public void mostrarListaCurso(){
        LC.mostrarCursos();
    }
    
    public void ingresarListaAlumno(){
        LA.setAlumnos();
    }
    
    public void mostrarListaAlumno(){
        LA.mostrarAlumno();
    }
    
    public void matricularAlumno(){
        String cadena, rpta;
        int posicion;
        
        if(cantAlumnoMatricula < 5){
            do{
                LA.mostrarAlumno();
                System.out.print("Ingrese el codigo del alumno: ");
                cadena = entrada.next();
            }while(cadena.length() !=8 );
            
            posicion = LA.validarCodigoAlumno(cadena);
            
            if(posicion != -1){
                AlumnoMatricula alumnomatri = new AlumnoMatricula();
                Alumno alumno = new Alumno();
                alumno = LA.getAlumno(posicion);
                
                alumnomatri.setAlumno(alumno);
                
                do{
                    do{
                        LC.mostrarCursos();
                        System.out.print("Ingrese codigo del curso a matricularse: ");
                        cadena = entrada.next();
                    }while(cadena.length() != 3);
                    
                    posicion = LC.validarCodigoCurso(cadena);
                    
                    if(posicion != -1){
                        Curso curso = new Curso();
                        curso = LC.getCurso(posicion);
                        
                        alumnomatri.setCurso(curso);
                    }
                    else{
                        System.out.println("EL codigo no existe.");
                    }
                    
                    System.out.print("Desea matricularse en otro curso [S/N]: ");
                    rpta = entrada.next();
                }while(rpta.equalsIgnoreCase("S"));
                
                //AM[cantAlumnoMatricula] = alumnomatri;
                AM.add(alumnomatri);
                cantAlumnoMatricula++;
            }
            else{
                System.out.println("El codigo no existe.");
            }
        }
        else{
            System.out.println("No se puede matricular mas de 5 alumnos.");
        }
    }
    
    public void mostrarAlumnoMatriculado(){
        if(cantAlumnoMatricula > 0){
            System.out.println("Lista de Alumnos matriculados");
            for(AlumnoMatricula i: AM){
                Alumno alumno = i.getALumno();
                System.out.println("\n----------ALUMNO---------");
                System.out.println("-Codigo: " + alumno.getCodigo());
                System.out.println("-Nombres: " + alumno.getNombre());
                System.out.println("-Apellidos: " + alumno.getApellido());
                System.out.println("---CURSOS MATRICULADOS---");                
                
                for(int j=0; j< i.getCantCurso(); j++){
                    Curso curso = i.getCurso(j);
                    System.out.println("-Codigo: " + curso.getCodigo());
                    System.out.println("-Curso: " + curso.getNombre());
                    System.out.println("-------------------------");                             
                }
            }
        }
        else{
            System.out.println("No existen alumnos matriculados.");
        }
    }
    
    public int getOpcionMenu(){
        int opc;
        
        do{
            System.out.println("****************************************");
            System.out.println("**********SISTEMA DE MATRICULA**********");
            System.out.println("*Ingresar lista de cursos...........[1]*");
            System.out.println("*Mostrar lista de cursos............[2]*");
            System.out.println("*Ingresar lista de alumnos..........[3]*");
            System.out.println("*Mostrar lista de alumnos...........[4]*");
            System.out.println("*Matricular alumno..................[5]*");
            System.out.println("*Mostrar alumno matriculado.........[6]*");
            System.out.println("*Salir..............................[7]*");
            System.out.println("****************************************");
            System.out.print("Opcion: ");
            opc = entrada.nextInt();
        }while(opc<1 || opc>7);
        
        return opc;
    }
    
    public void Menu(){
        int opcion;
        
        do{
            opcion = getOpcionMenu();
            
            switch(opcion){
                case 1: ingresarListaCurso();
                        break;
                case 2: mostrarListaCurso();
                        break;
                case 3: ingresarListaAlumno();
                        break;
                case 4: mostrarListaAlumno();
                        break;
                case 5: matricularAlumno();
                        break;
                case 6: mostrarAlumnoMatriculado();
                        break;
            }
        }while(opcion !=7);        
    }

    public static void main(String args[]){
        Matricula M = new Matricula();
        M.Menu();
    }
    
}
