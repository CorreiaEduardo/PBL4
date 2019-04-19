package Logics;

/**
 * @author Eduardo C.
 */
public abstract class Produto {
    protected double preco;
    protected String validade;
    protected String especificacao;
    protected double tempoEntrega;

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
    
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String getEspecificacao() {
        return especificacao;
    }

    public void setEspecificacao(String especificacao) {
        this.especificacao = especificacao;
    }
}
