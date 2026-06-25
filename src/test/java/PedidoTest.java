import static org.junit.Assert.*;
import org.junit.Test;

public class PedidoTest {

    @Test
    public void deberiaPermitirPedidoConCarritoValido() {

        Pedido pedido = new Pedido(100);

        boolean resultado = pedido.confirmar();

        assertTrue(resultado);

        assertEquals(100, pedido.getTotal());
    }

    @Test
    public void noDeberiaPermitirPedidoConCarritoVacio() {

        Pedido pedido = new Pedido(0);

        boolean resultado = pedido.confirmar();

        assertFalse(resultado);

        assertEquals(0, pedido.getTotal());
    }

    @Test
    public void noDeberiaPermitirTotalesNegativos() {

        // Se crea un pedido con un total negativo
        Pedido pedido = new Pedido(-10);

        // Se intenta confirmar el pedido
        boolean resultado = pedido.confirmar();

        // Se verifica que la operación sea rechazada
        assertFalse(resultado);
    }
}