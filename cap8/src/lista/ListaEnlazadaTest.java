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
    }

    @Test
    public void testInsertarInicio() {
        lista.insertarInicio(10);
        assertEquals(10, (int)lista.getPrimero().getDato());
        assertEquals(10, (int)lista.getUltimo().getDato());
        assertEquals(1, lista.length());
    }

    @Test
    public void testInsertDespuesNodo() {
        lista.insertarInicio(10);
        lista.insertar(20, 0);

        assertEquals(2, lista.length());
        assertEquals(10, (int)lista.getPrimero().getDato());
        assertEquals((Object) 20, lista.getUltimo().getDato());
    }

    @Test
    public void testGetNodo() {
        lista.insertarInicio(10);
        lista.insertarInicio(20);
        lista.insertarInicio(30);
        // 30 -> 20 -> 10

        assertEquals(30, (int)lista.getNodo(0).getDato());
        assertEquals(20, (int)lista.getNodo(1).getDato());
        assertEquals(10, (int)lista.getNodo(2).getDato());
    }
}