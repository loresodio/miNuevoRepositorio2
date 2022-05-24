
package numerosFraccionarios;

public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion(int n, int d)
    {
        this.numerador=n;
        this.denominador=d;
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador(){
        return denominador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador)
    {
        this.denominador=denominador;
    }

    public boolean sumaFraccion(Fraccion otra)
    {
        if(this.denominador==otra.denominador){
            this.numerador+=otra.numerador;
            return true;
        }
        return false;
    }

    public boolean restaFraccion(Fraccion otra)
    {
        if(this.denominador<otra.denominador){
            this.numerador-=otra.numerador;
            return true;
        }
        return false;
    }

    public void multiplicaFraccion(Fraccion otra)
    {
        this.numerador*=otra.numerador;
        this.denominador*=otra.denominador;
    }

    public void divideFraccion(Fraccion otra)
    {
        this.numerador*=otra.denominador;
        this.denominador*=otra.numerador;
    }

    public static void main(String[] args)
    {

            System.out.println("Respuesta de Syso");
            System.out.println("¿Vienes de Iberia?¿Ahi no tienes un gimnario de tipo volador con Carrero Blanco?");
     
      
    }
}
