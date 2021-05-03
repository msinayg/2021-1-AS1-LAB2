
import java.util.*;

/**
 * 
 */
public interface IFigura {

    /**
     * @param Figura
     */
    public void dibujarFigura(FiguraAbstracta Figura);

    /**
     * @param Figura
     */
    public void imprimirFigura(FiguraAbstracta Figura);

    /**
     * @param Figura
     */
    public void exportarFiguraPNG(FiguraAbstracta Figura);

    /**
     * @param Figura
     */
    public void exportarFiguraJPG(FiguraAbstracta Figura);

    /**
     * @param CoordenadaX 
     * @param CoordenadaY
     */
    public void exportarCoordenadasFigura(int CoordenadaX, int CoordenadaY);
    
    public void calcularArea(FiguraAbstracta Figura);
    
    public void calcularPerimetro(FiguraAbstracta Figura);

}