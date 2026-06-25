import static org.junit.Assert.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class PedidoSteps {

    private Pedido pedido;
    private boolean resultado;

    @Given("un carrito con productos por un total de {int} Bs")
    public void carritoConProductos(int total) {

        pedido = new Pedido(total);
    }

    @Given("un carrito vacío")
    public void carritoVacio() {

        pedido = new Pedido(0);
    }

    @When("el cliente confirma el pedido")
    public void confirmarPedido() {

        resultado = pedido.confirmar();
    }

    @Then("el pedido es aprobado")
    public void pedidoAprobado() {

        assertTrue(resultado);
    }

    @Then("el pedido es rechazado")
    public void pedidoRechazado() {

        assertFalse(resultado);
    }

    @Then("el total registrado es {int} Bs")
    public void validarTotal(int totalEsperado) {

        assertEquals(totalEsperado, pedido.getTotal());
    }
}