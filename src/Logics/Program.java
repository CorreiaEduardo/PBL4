package Logics;

import java.util.ArrayList;

/**
 * @author Eduardo C.
 */
public class Program {
    public static void main(String[] args) {
        Paozinho p = new Paozinho(5, "Muito top", "Requeijão");
        Frio f = new Frio(5, "Muito top","Kibe");
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(p);
        produtos.add(f);
        Pedido pedido1 = new Pedido(produtos);
        
        System.out.println(pedido1.calcItensPorTipo()[0]+" frio,"+pedido1.calcItensPorTipo()[1]+" paozinho,"+pedido1.calcItensPorTipo()[2]+" doce.");
        System.out.println(pedido1.calcTempoTotalEntrega(1));
        System.out.println(pedido1.calcularTotalCompra());
        
        
    }
    
}
