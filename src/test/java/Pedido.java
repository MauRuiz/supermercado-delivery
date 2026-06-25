/*
public class Pedido {

    private int total;

    public Pedido(int total) {
        this.total = total;
    }

    public boolean confirmar() {

        return true;
    }

    public int getTotal() {
        return total;
    }
}

*/

public class Pedido {

    private int total;

    public Pedido(int total) {
        this.total = total;
    }

    public boolean confirmar() {
    	// Verifica que exista al menos un producto en el pedido
        if(total <= 0)
            return false;

        return true;
    }

    public int getTotal() {
        return total;
    }
}