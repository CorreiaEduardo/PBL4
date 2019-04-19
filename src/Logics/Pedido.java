package Logics;

import java.util.ArrayList;

/**
 * @author Eduardo C.
 */
public class Pedido {
    public static int emAberto = 0;
    private ArrayList<Produto> produtos;
    private double totalCompra;
    public Pedido(){
        emAberto++;
        this.totalCompra = 0;
    }
    public Pedido(ArrayList<Produto> produtos){
        emAberto++;
        this.produtos = produtos;
        this.totalCompra = 0;
        this.calcularTotalCompra();
    }
    private void calcularTotalCompra(){
        for(Produto produto : this.produtos){
            this.totalCompra+=produto.preco;
        }
    }
    public void addProduto(Produto p){
        this.produtos.add(p);
    }
    
}
