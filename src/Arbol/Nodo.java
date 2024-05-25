package Arbol;

public class Nodo {
    public int elem;
    public Nodo izq;
    public Nodo der;

    //constructor
    public Nodo(int elem){
        this.elem = elem; //aqui se inserta el dato
        this.izq = null;
        this.der = null;
    }
}
