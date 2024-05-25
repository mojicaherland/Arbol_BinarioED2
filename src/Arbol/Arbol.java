package Arbol;

public class Arbol {
    public Nodo raiz;

    //constructor
    public Arbol() {
        this.raiz = null;
    }

    //insertar un dato x en el arbol
    public void insertar(int x) {
        //devuelve el nuevo nodo y se le asigna a raiz
        raiz = insertarRecursivo(raiz, x);
    }

    private Nodo insertarRecursivo(Nodo nuevoRaiz, int x) {
        //logica recursiva

        //caso base
        if (nuevoRaiz == null) {
            //paso a paso
            Nodo nuevoNodo = new Nodo(x);
            nuevoRaiz = nuevoNodo;
            return nuevoRaiz;
            //forma directa
//            return new Nodo(x);
        }
        //caso gral
        if (x < nuevoRaiz.elem) {
            nuevoRaiz.izq = insertarRecursivo(nuevoRaiz.izq, x);//entra a lado izquierdo
        } else {
            nuevoRaiz.der = insertarRecursivo(nuevoRaiz.der, x);
        }
        return nuevoRaiz;
    }

    //recorrido inorden
    public void recInOrden() {
        recInOrdenRecursivo(raiz);
    }

    private void recInOrdenRecursivo(Nodo nuevoRaiz) {
        //caso base
        if (nuevoRaiz == null) {
            return;
        }
        //caso gral
        recInOrdenRecursivo(nuevoRaiz.izq); //hijo izq
        System.out.print(nuevoRaiz.elem + " "); //padre
        recInOrdenRecursivo(nuevoRaiz.der); //hijo der
    }

}
