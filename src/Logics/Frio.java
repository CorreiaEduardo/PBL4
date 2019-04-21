package Logics;

/**
 * @author Eduardo C.
 */
public class Frio extends Produto{
    private String tipo;
    public Frio() {
    }
    
    public Frio(double preco,String validade,String especificacao, String tipo) {
        this.preco = preco;
        this.validade = validade;
        this.especificacao = especificacao;
        this.tipo = tipo;
    }
    
    
    @Override
    public double calcTempoEntrega(int diaSemana) {
        switch(diaSemana){
            case 1:// DOMINGO.
                return super.calcTempoEntrega(diaSemana)*1.10;
        }
        return super.calcTempoEntrega(diaSemana);
    }

    public String getTipo() {
        return tipo;
    }
}
