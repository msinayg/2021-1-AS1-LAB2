import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CrearFiguraApp {
    public CrearFiguraApp() {
    }

    public static void main(String[] arg) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Por favor ingrese la figura, puede ser ciculo o cuadrado: ");
        String figura = br.readLine();
        switch (figura.toLowerCase()){
            case "circulo": 
                Circulo circulo = new Circulo(); 
                break;
            case "cuadrado": 
                Cuadrado cuadrado = new Cuadrado(); 
                break; 
            default:
                break;
        }
    }

}