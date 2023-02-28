public class Main {
    public static void main(String[] args) {
        LinkedList linkedList =  new LinkedList();
        linkedList.agregarValorAlInicio(61);
        linkedList.agregarValorAlInicio(69);
        linkedList.agregarValorAlInicio(31);
        linkedList.agregarValorAlInicio(21);
        linkedList.agregarFinal(30);
        linkedList.agregarPorPosicion(1, 14);
        linkedList.agregarPorPosicion(2, 18);
        //linkedList.agregarPorPosicion(100, 18);
        //[61]->[30]
        //head   tail

        //[61]->[14]->[30]
        //head   tail

        linkedList.eliminarFrente();
        linkedList.eliminarPorPosicion(1);
        linkedList.eliminarTail();
        System.out.println(linkedList.obtenerPorPosicion(2));

    }
}