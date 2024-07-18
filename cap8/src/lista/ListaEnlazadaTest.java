package lista;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ListaEnlazadaTest {
    private ListaEnlazada<Integer> lista;

    @Before
    public void configurar() {
        lista = new ListaEnlazada<>();
    }

    @Test
    public void testInicial() {
        assertEquals(0, lista.length());
        assertTrue(lista.estaVacio());
    }

    @Test
    public void testinsertarPrimero() {
        lista.insertarPrimero(10);
        assertEquals(10, (int)lista.getPrimero().getDato());
        assertEquals(10, (int)lista.getUltimo().getDato());
        assertEquals(1, lista.length());
    }

    @Test
    public void testInsertarUltimo() {
        lista.insertarPrimero(10);
        lista.insertarUltimo(20);

        assertEquals(2, lista.length());
        assertEquals(10, (int)lista.getPrimero().getDato());
        assertEquals(20, (int)lista.getUltimo().getDato());
    }

    @Test
    public void testInsertarEnMedio() {
        lista.insertarPrimero(10);
        lista.insertarUltimo(30);
        lista.insertar(20, 0); // Insertar 20 después de 10

        assertEquals(3, lista.length());
        assertEquals(20, (int)lista.getPrimero().getDato());
        assertEquals(10, (int)lista.getNodo(1).getDato());
        assertEquals(30, (int)lista.getUltimo().getDato());
    }

    @Test
    public void testGetNodo() {
        lista.insertarPrimero(10);
        lista.insertarPrimero(20);
        lista.insertarPrimero(30);
        // 30 -> 20 -> 10

        assertEquals(30, (int)lista.getNodo(0).getDato());
        assertEquals(20, (int)lista.getNodo(1).getDato());
        assertEquals(10, (int)lista.getNodo(2).getDato());
    }

    @Test
    public void testBuscar() {
        lista.insertarPrimero(10);
        lista.insertarPrimero(20);
        lista.insertarPrimero(30);
        // 30 -> 20 -> 10

        assertEquals(0, lista.buscar(30));
        assertEquals(1, lista.buscar(20));
        assertEquals(2, lista.buscar(10));
        assertEquals(-1, lista.buscar(40)); // No existe en la lista
    }

    @Test
    public void testRemoverEnmedio() {
        lista.insertarPrimero(10);
        lista.insertarPrimero(20);
        lista.insertarPrimero(30);
        // 30 -> 20 -> 10

        lista.remover(1);
        // 30 -> 10
        assertEquals(2, lista.length());
        assertEquals(10, (int)lista.getNodo(1).getDato());
        assertEquals(30, (int)lista.getPrimero().getDato());
    }

    @Test
    public void testRemoverInicio() {
        lista.insertarPrimero(10);
        lista.insertarPrimero(20);
        lista.insertarPrimero(30);
        // 30 -> 20 -> 10

        lista.remover(0);
        // 20 -> 10
        assertEquals(2, lista.length());
        assertEquals(20, (int)lista.getPrimero().getDato());
    }

    @Test
    public void testRemoverFinal() {
        lista.insertarPrimero(10);
        lista.insertarPrimero(20);
        lista.insertarPrimero(30);
        // 30 -> 20 -> 10

        lista.remover(2);
        // 30 -> 20
        assertEquals(2, lista.length());
        assertEquals(20, (int)lista.getUltimo().getDato());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoverListaVacia() {
        lista.remover(0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoverPosicionInvalida() {
        lista.insertarPrimero(10);
        lista.remover(2); // Posición inválida
    }

    @Test
    public void testEditar() {
        lista.insertarPrimero(10);
        lista.insertarPrimero(20);
        lista.insertarPrimero(30);
        // 30 -> 20 -> 10

        lista.editar(25, 1);
        // 30 -> 25 -> 10
        assertEquals(25, (int)lista.getNodo(1).getDato());
    }

    @Test
    public void testToString() {
        lista.insertarPrimero(10);
        lista.insertarPrimero(20);
        lista.insertarPrimero(30);
        // 30 -> 20 -> 10
        boolean result = lista.toString().equals("30-> 20-> 10->");
        assertTrue(result);
    }
}
