package controle;
import modelo.*;

/**
 * Classe responsável pelo controle dos ciclos.
 * @author Estevão e Rhumenigue
 * @since 20223
 * @version 1.0
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
     * Método responsável por os ciclos pelos seus nomes
     * @return String com os nomes dos ciclos
     *
     */
    public String[] getNomeCiclo() { 
        String[] ciclo = new String[qtdCiclo];
        for(int i = 0; i < qtdCiclo; i++) {
            ciclo[i] = c[i].getNome(); //adiciona o nome do ciclo no vetor
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

