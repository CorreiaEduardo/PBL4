package Logics;

/**
 * @author Eduardo C.
 */
public class Paozinho extends Produto{
    private String sabor;

    public Paozinho() {
        
    }

    public Paozinho(double preco,String validade,String especificacao,String sabor) {
        this.preco = preco;
        this.validade = validade;
        this.especificacao = especificacao;
        this.sabor = sabor;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    @Override
    public double calcTempoEntrega(int diaSemana) {
        switch(diaSemana){
            case 1: case 7:// FINAL DE SEMANA.
                return super.calcTempoEntrega(diaSemana)*1.15;
        }
        return super.calcTempoEntrega(diaSemana);
    }
    
}
