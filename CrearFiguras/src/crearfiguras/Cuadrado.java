
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 
 */
public class Cuadrado extends FiguraAbstracta {

    /**
     * Default constructor
     */
    public Cuadrado() throws IOException {
        this.asignarNombre("CUADRADO");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Por favor ingrese el ancho: ");
        String ancho = br.readLine();
        this.asignarAncho(Integer.parseInt(ancho));
        System.out.println("Por favor ingrese la unidades de media: cm/pulg: ");
        String unidades = br.readLine();
        this.asignarUnidadMedida(unidades);
        
        System.out.println("desea agregar color del borde ? si/no");
        String resp1 = br.readLine();
        this.asignarColorBorde(resp1);

        System.out.println("desea agregar color del fondo ? si/no");
        String resp2 = br.readLine();
        this.asignarColorFondo(resp2);
        
        System.out.println("el area del círculo es: " + this.calcularArea(this.obtenerAncho()));
        System.out.println("el perimetro del círculo es: " + this.calcularPerimetro(this.obtenerAncho()));
        
    }

    /**
     * 
     */
    private int Ancho;

    /**
     * @param ancho
     */
    public void asignarAncho(int ancho) {
        // TODO implement here
    }

    /**
     * @return
     */
    public int obtenerAncho() {
        // TODO implement here
        return 0;
    }

    
    public int calcularArea(int ancho) {
        return ancho*ancho;
    }

    
    public int calcularPerimetro(int ancho) {
        return 4*ancho;
    }

}