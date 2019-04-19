package Logics;

/**
 * @author Eduardo C.
 */
public class Doce extends Produto{
    private String tipo;

    public Doce() {
    }
    
    public Doce(double preco,String validade,String especificacao,String tipo) {
        this.preco = preco;
        this.validade = validade;
        this.especificacao = especificacao;
        this.tipo = tipo;
    }
    
    @Override
    public double calcTempoEntrega(int diaSemana) {
        switch(diaSemana){
            case 1: case 7:// FINAL DE SEMANA.
                return super.calcTempoEntrega(diaSemana)*1.2;
        }
        return 2;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
