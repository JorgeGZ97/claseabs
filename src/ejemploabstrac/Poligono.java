package ejemploabstrac;

public abstract class Poligono {                                                                                  
  
    private int numLados;

    public Poligono() {
        this.numLados=0;
    }

    public int getNumLados() {
        return numLados;
    }

    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }
    //Declaración del método abstracto area()                                                                     
    public abstract double area();
}
