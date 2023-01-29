package controle;
import modelo.*;

/**
 * Classe responsável pelo controle de comprimidos.
 * @author Henrique Pucci
 * @since 2022
 *
 */
public class ControleComprimido {
    private Comprimido[] c;
    private int qtdComprimidos;

    public ControleComprimido(ControleDados d){
        c = d.getComprimidos();
        qtdComprimidos = d.getQtdComprimidos();
    }

    /**
     * Método responsável pelo listamento de comprimidos pelos seus nomes
     * @return String com os nomes dos comprimidos
     *
     */
    public String[] getNomeComprimido() { 
        String[] comprimidos = new String[qtdComprimidos];
        for(int i = 0; i < qtdComprimidos; i++) {
            comprimidos[i] = c[i].getNome(); //adiciona o nome do comprimido no vetor
        }
        return comprimidos;  
    }
    

    public int getQtd(){
        return qtdComprimidos;
    }

    public void setQtd(int qtd){
        this.qtdComprimidos = qtd;
    }
    
    public String getNome(int i){
        return c[i].getNome();
    }

    public String getMarca(int i){
        return c[i].getMarca();
    }
    
    public String getFrequencia(int i) {
    	return c[i].getFrequencia();
    }
    
    public String getComprimidosPorDia(int i) {
    	return Integer.toString(c[i].getComprimidosporDia());
    }

    public String getComprimidosTotal(int i){
        return Integer.toString(c[i].getComprimidosTotal());
    }
}

