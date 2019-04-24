package Logics;

import java.util.ArrayList;

/**
 * @author Eduardo C.
 */
public class TabelaPrecos {
    ArrayList<String> nomesProdutos;
    ArrayList<String> precosProdutos;
    public TabelaPrecos(){
        nomesProdutos = new ArrayList<>();
        precosProdutos = new ArrayList<>();
        nomesProdutos.add("PAOZINHO - REQUEIJÃO");
        precosProdutos.add("3.70");
        nomesProdutos.add("PAOZINHO - CHEDDAR");
        precosProdutos.add("3.70");
        nomesProdutos.add("PAOZINHO - PATÊ DE ATUM");
        precosProdutos.add("3.70");
        nomesProdutos.add("DOCE FINO");
        precosProdutos.add("3.70");
        nomesProdutos.add("DOCE DE FESTA");
        precosProdutos.add("3.70");
        nomesProdutos.add("DOCE GOURMET");
        precosProdutos.add("3.70");
        nomesProdutos.add("DOCE ORNAMENTAL");
        precosProdutos.add("3.70");
        nomesProdutos.add("QUEIJO");
        precosProdutos.add("3.70");
        nomesProdutos.add("MORTADELA");
        precosProdutos.add("3.70");
        nomesProdutos.add("SALAME");
        precosProdutos.add("3.70");
    }
    public String[] getNomes(){
        String[] lista = new String[nomesProdutos.size()];
        for (int i = 0; i < nomesProdutos.size(); i++) {
            lista[i] = nomesProdutos.get(i);
        }
        return lista;
    }
    public String[] getPrecos(){
        String[] lista = new String[precosProdutos.size()];
        for (int i = 0; i < precosProdutos.size(); i++) {
            lista[i] = precosProdutos.get(i);
        }
        return lista;
    }
    public void setPreco(int index, String novoPreco){
        precosProdutos.set(index, novoPreco);
    }
}
