package Logics;

/**
 * @author Eduardo C.
 */
public class Frio extends Produto{

    public Frio() {
    }
    
    public Frio(double preco,String validade,String especificacao) {
        this.preco = preco;
        this.validade = validade;
        this.especificacao = especificacao;
    }
    
    
    @Override
    public double calcTempoEntrega(int diaSemana) {
        switch(diaSemana){
            case 1:// DOMINGO.
                return super.calcTempoEntrega(diaSemana)*1.10;
        }
        return 2;
    }
}
