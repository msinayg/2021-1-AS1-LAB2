
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 
 */
public class Circulo extends FiguraAbstracta {

    public Circulo() throws IOException {
        this.asignarNombre("CIRCULO");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Por favor ingrese el radio: ");
        String radio = br.readLine();
        this.asignarRadio(Integer.parseInt(radio));
        System.out.println("Por favor ingrese la unidades de media: cm/pulg: ");
        String unidades = br.readLine();
        if (unidades.equals("cm") || unidades.equals("pulg")) {
            this.asignarUnidadMedida(unidades);
            
        } else {
            this.asignarUnidadMedida("cm");
        }
        System.out.println("desea agregar color del borde ? si/no");
            String resp1 = br.readLine();
            this.asignarColorBorde(resp1);

            System.out.println("desea agregar color del fondo ? si/no");
            String resp2 = br.readLine();
            this.asignarColorFondo(resp2);
            
        System.out.println("desea imprimir ? si/no");
        String resp3 = br.readLine();
        switch(resp3){
            case "si":
                this.imprimirFigura(this);
                break;
            case "no":
                this.imprimirFigura(this);
                break;
        }
        
        this.calcularArea(this.obtenerRadio());
        this.calcularPerimetro(this.obtenerRadio());

    }
    
    private int Radio;
    
    public void asignarRadio(int radio) {
        this.Radio = radio;
    }
    
    public int obtenerRadio() {
    
        return 0;
    }

    public double calcularArea(int radio) {
        return 3.1416 * (radio * radio);
    }

    
    public double calcularPerimetro(int radio) {
        return 2 * 3.1416 * radio;
    }

}