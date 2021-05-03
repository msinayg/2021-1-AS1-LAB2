
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 
 */
public abstract class FiguraAbstracta implements IFigura {

    
    public FiguraAbstracta() {
        
    }
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    protected String ColorBorde;
    
    protected String ColorFondo;
    
    protected int CoordenadaX;

    protected int CoordenadaY;

    protected String UnidadMedida;

    protected int Area;
    
    protected int Perimetro;
    
    protected String Nombre;

    public void asignarColorBorde(String color) throws IOException {
        switch (color.toLowerCase()){
            case "si": 
                System.out.println("Por favor ingrese el color del margen: ");
                String borde = br.readLine();
                this.ColorBorde = borde;
                break;
            case "no":
                this.dibujarFigura(this);
            default:
                break;
        }
        
    }

    public String obtenerColorBorde() {

        return "";
    }
    
    public void asignarColorFondo(String color) throws IOException {
        switch (color.toLowerCase()){
            case "si": 
                System.out.println("Por favor ingrese el color del fondo: ");
                String fondo = br.readLine();
                this.ColorFondo = fondo;
                break;
            case "no":
                this.dibujarFigura(this);
            default:
                break;
        }
    }

    /**
     * @return
     */
    public String obtenerColorFondo() {
        // TODO implement here
        return "";
    }

    /**
     * @param coordenadaX
     */
    public void asignarCoordenadaX(int coordenadaX) {
        // TODO implement here
    }

    /**
     * @return
     */
    public int obtenerCoordenadaX() {
        // TODO implement here
        return 0;
    }

    /**
     * @param coordenadaY
     */
    public void asignarCoordenadaY(int coordenadaY) {
        // TODO implement here
    }

    /**
     * @return
     */
    public int obtenerCoordenadaY() {
        // TODO implement here
        return 0;
    }

    /**
     * @param unidad
     */
    public void asignarUnidadMedida(String unidad) {
        if (unidad.equals("cm") || unidad.equals("pulg")){
            this.UnidadMedida = unidad;    
        } else {
            System.out.println("unidad no válida");
        }
    }

    /**
     * @return
     */
    public String obtenerUnidadMedida() {
        
        return "";
    }

    /**
     * @param area
     */
    public void asignarArea(int area) {
        this.Area = area;
    }

    /**
     * @return
     */
    public int obtenerArea() {
        // TODO implement here
        return 0;
    }

    /**
     * @param perimetro
     */
    public void asignarPerimetro(int perimetro) {
        // TODO implement here
    }

    /**
     * @return
     */
    public int obtenerPerimetro() {
        // TODO implement here
        return 0;
    }
    
    public void asignarNombre(String nombre) {
        // TODO implement here
    }

    /**
     * @return
     */
    public String obtenerNombre() {
        // TODO implement here
        return "";
    }

    /**
     * @param Figura
     */
    public void dibujarFigura(FiguraAbstracta Figura) {
        System.out.println("dibujando....");
    }

    /**
     * @param Figura
     */
    public void imprimirFigura(FiguraAbstracta Figura) {
        System.out.println("imprimiendo...." + "un" + "");
    }

    /**
     * @param Figura
     */
    public void exportarFiguraPNG(FiguraAbstracta Figura) {
        // TODO implement here
    }

    /**
     * @param Figura
     */
    public void exportarFiguraJPG(FiguraAbstracta Figura) {
        // TODO implement here
    }

    /**
     * @param CoordenadaX 
     * @param CoordenadaY
     */
    public void exportarCoordenadasFigura(int CoordenadaX, int CoordenadaY) {
        // TODO implement here
    }
    public void calcularArea(FiguraAbstracta Figura) {
    }
    
    public void calcularPerimetro(FiguraAbstracta Figura) {
        // TODO implement here
    }

}