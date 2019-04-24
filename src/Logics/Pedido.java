package Logics;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * @author Eduardo C.
 */
public class Pedido {
    private long horarioCompra;  
    public static int emAberto = 0;
    private ArrayList<Produto> produtos;
    private double totalCompra;
    public Pedido(){
        produtos = new ArrayList<>();
        emAberto++;
        this.totalCompra = 0;
    }

    public long getHorarioCompra() {
        return horarioCompra;
    }

    public void setHorarioCompra(long horarioCompra) {
        this.horarioCompra = horarioCompra;
    }
    
    public Pedido(ArrayList<Produto> produtos){
        emAberto++;
        this.produtos = produtos;
        this.totalCompra = 0;
        this.calcularTotalCompra();
    }
    public double calcularTotalCompra(){
        double total=0;
        try {
            for(Produto produto : this.produtos){
            total+=produto.preco;
        }
        } catch (Exception e) {
            return 0;
        }
        //return BigDecimal.valueOf(total).setScale(2, BigDecimal.ROUND_HALF_UP).floatValue();
        return Math.floor(total * 100) / 100;
    }
    public void addProduto(Produto p){
        this.produtos.add(p);
    }
    public ArrayList<Produto> getProdutos(){
        return this.produtos;
    }
    public Integer[] calcItensPorTipo(){
        Integer[] itensPorTipo = new Integer[]{0,0,0};
        for (Produto produto : this.produtos) {
            if (produto instanceof Frio) {
                itensPorTipo[0]++;
            }else if (produto instanceof Paozinho) {
                itensPorTipo[1]++;
            }else if (produto instanceof Doce) {
                itensPorTipo[2]++;
                
            }
        }
        return itensPorTipo;
    }
    
    public double calcTempoTotalEntrega(int dia){
        double tempo = 0;
        for (Produto produto : this.produtos) {
            tempo+=produto.calcTempoEntrega(dia);
        }
        return tempo;
    }
    
    public long getTempoEstimado(){
        GregorianCalendar c = new GregorianCalendar(Locale.US);
        long tempoDeEntrega = (new Double(this.calcTempoTotalEntrega(c.getTime().getDay()+1))).longValue();
        tempoDeEntrega *= 60000;
        long millis = this.getHorarioCompra()+tempoDeEntrega;
        return millis;
    }
    
}
