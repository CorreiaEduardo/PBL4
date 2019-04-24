package Logics;

import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * @author Eduardo C.
 */
public abstract class Produto {
    protected double preco;
    protected String validade;
    protected String fabricacao;
    protected String especificacao;
    protected double tempoEntrega;

    public Produto() {
        GregorianCalendar calendario = new GregorianCalendar(Locale.US);
        this.fabricacao = ""+calendario.getTime().getMonth();
        this.validade = ""+calendario.getTime().getMonth()+7;
    }
    
    public double calcTempoEntrega(int diaSemana){
        if (this instanceof Frio) {
            return 6;
        }else if(this instanceof Doce){
            return 5;
        }else if(this instanceof Paozinho){
            return 2;
        }
        return -1;
    }

    public String getFabricacao() {
        return fabricacao;
    }
    
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getValidade() {
        return validade;
    }

    public String getEspecificacao() {
        return especificacao;
    }

    public void setEspecificacao(String especificacao) {
        this.especificacao = especificacao;
    }
}
