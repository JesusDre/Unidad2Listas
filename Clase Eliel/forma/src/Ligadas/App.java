package Ligadas;

public class App {
    public static void main(String[] args) {
        SinglyLinkedList lista = new SinglyLinkedList();
        lista.insertar(10);
        lista.insertar(20);
        lista.insertar(30);
        lista.mostrar();
        //lista.buscar(10);
        lista.eliminar(30);
        lista.mostrar();
    }
    
}
