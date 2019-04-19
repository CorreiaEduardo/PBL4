package Logics;

import java.util.ArrayList;

/**
 * @author Eduardo C.
 */
public class Program {
    public static void main(String[] args) {
        Paozinho p = new Paozinho(5, "19/04/2019", "Muito top", "Requeijão");
        Frio f = new Frio(5, "19/04/2019", "Muito top");
        System.out.println(p.calcTempoEntrega(1));
        System.out.println(f.calcTempoEntrega(1));
        
        ArrayList<Produto> pedidos = new ArrayList<>();
        pedidos.add(p);
        Pedido pe = new Pedido(pedidos);
        
        
    }
    
}
