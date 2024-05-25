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

    //recorrido preOrden
    public void repreOrden() {
        recPreOrdenRecursivo(raiz); //
    }

    private void recPreOrdenRecursivo(Nodo nodo) {
        //caso base
        if (nodo == null) {
            return;
        }
        //caso gral
        System.out.print(nodo.elem + " "); //padre
        recPreOrdenRecursivo(nodo.izq); //hijo izq
        recPreOrdenRecursivo(nodo.der); //hijo der
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

    //recorrido postOrden
    public void recPostOrden() {
        recPostOrdenRecursivo(raiz);
    }

    private void recPostOrdenRecursivo(Nodo nodo) {
        if (nodo == null) {
            return;
        }
        //caso gral
        recPostOrdenRecursivo(nodo.izq); //hijo izq
        recPostOrdenRecursivo(nodo.der); //hijo der
        System.out.print(nodo.elem + " "); //raiz
    }
}
