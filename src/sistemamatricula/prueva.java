package sistemamatricula;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prueva {

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String codigo;
        
        System.out.print("Digite su codigo: ");
        codigo = entrada.readLine();
        System.out.println("Codigo: "+codigo);
    }
    
}
