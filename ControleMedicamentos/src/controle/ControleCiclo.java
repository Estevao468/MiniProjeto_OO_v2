package controle;
import objetos.*;

/**
 * Classe responsável pelo controle de comprimidos.
 * @author Henrique Pucci
 * @since 2022
 *
 */
public class ControleCiclo {
    private Ciclo[] c;
    private int qtdCiclo;

    public ControleCiclo(ControleDados d){
        c = d.getCiclo();
        qtdCiclo = d.getQtdCiclo();
    }

    /**
     * Método responsável pelo listamento de comprimidos pelos seus nomes
     * @return String com os nomes dos comprimidos
     *
     */
    public String[] getNomeCiclo() { 
        String[] ciclo = new String[qtdCiclo];
        for(int i = 0; i < qtdCiclo; i++) {
            ciclo[i] = c[i].getNome(); //adiciona o nome do comprimido no vetor
        }
        return ciclo;  
    }
    

    public int getQtd(){
        return qtdCiclo;
    }

    public void setQtd(int qtd){
        this.qtdCiclo = qtd;
    }
    
    public String getNome(int i){
        return c[i].getNome();
    }

    public String getData(int i){
        return c[i].getData();
    }
    
    public String getObservacao(int i) {
    	return c[i].getObservacao();
    }
}

