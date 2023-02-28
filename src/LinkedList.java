public class LinkedList {

    class Node {
        int value;
        Node next = null;
        Node(int value){
            this.value = value;
        }
    }

    protected Node head = null;
    protected Node tail = null;

    public void agregarValorAlInicio(int valor){
        Node nuevoNodo = new Node(valor);
        nuevoNodo.next = head;
        head = nuevoNodo;
        if(nuevoNodo.next == null) {
            tail = nuevoNodo;
        }
    }

    public void agregarFinal(int valor) {
        Node nuevoNodo = new Node(valor);
        if(tail == null){
            head = nuevoNodo;
        } else {
            tail.next = nuevoNodo;
            tail = nuevoNodo;
        }
    }

    public void agregarPorPosicion(int posicion, int valor){
        if(posicion < 0) {
            throw new IndexOutOfBoundsException();
        } else if(posicion == 0){
            agregarValorAlInicio(valor);
        } else{
            Node nuevoNodo = new Node(valor);
            Node actual = head;
            for (int i = 0; i < posicion-1; i++) {
                if(actual == null) {
                    throw new IndexOutOfBoundsException();
                }
                actual = actual.next;
            }
            if(actual.next == null){
                agregarFinal(valor);
            } else {
                nuevoNodo.next = actual.next;
                actual.next = nuevoNodo;
            }
        }

    }

    public void eliminarFrente(){
        if(head != null){
            head = head.next;
        }
    }

    public void eliminarTail(){
        if(head == null){ 
            return;
        } else if(head == tail){
            head = null;
            tail = null;
            return;
        }
        Node actual = head;
        while(actual.next != tail){
            actual = actual.next;
        }
        actual.next = null;
        tail = actual;
    }


    public void eliminarPorPosicion(int posicion){
        if(posicion < 0) {
            throw new IndexOutOfBoundsException();
        } else{
            Node actual = head;
            for (int i = 0; i < posicion-1; i++) {
                if(actual == null) {
                    throw new IndexOutOfBoundsException();
                }
                actual = actual.next;
            }
            if(actual.next == null){
                throw new IndexOutOfBoundsException();
            } else if(actual.next == tail){
                actual.next = null;
                tail = actual;
            } else {
                actual.next = actual.next.next;
            }
        }
    }

    public int obtenerPorPosicion(int posicion) {
        if (posicion < 0) {
            throw new IndexOutOfBoundsException();
        }

        Node actual = head;
        for (int i = 0; i < posicion; i++) {
            if (actual == null) {
                throw new IndexOutOfBoundsException();
            }
            actual = actual.next;
        }

        return actual.value;
    }




}
