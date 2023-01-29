package controle;
import modelo.*;

/**
 * Classe responsável pelo controle de Ciclo.
 * @author Rhumenigue e Estevão
 * @since 2023
 * @version 1.0
 */
public class ControleSintoma {
    private Sintoma[] s;
    private int qtdSintoma;
    
    
    public ControleSintoma(ControleDados d) {
        s = d.getSintoma();
        qtdSintoma = d.getQtdSintoma();
    }
    
    /**
     * Método responsável pela listagem de sintoma pelos seus nomes
     * @return String com os nomes dos sintomas
     * 
     */
    public String[] getNomeSintoma() {
        String[] sintoma = new String[qtdSintoma]; 
        for(int i = 0; i < qtdSintoma; i++) { 
            sintoma[i] = s[i].getNome();
        } 
        return sintoma;
        
    }
    
    public int getQtd(){
        return qtdSintoma;
    }
    
    public void setQtd(int qtd){
        this.qtdSintoma = qtd;
    }

    public String getNome(int i){
        return s[i].getNome();
    }

    public String getData(int i){
        return s[i].getData();
    }
    
    public String getObservacao(int i) {
    	return s[i].getObservacao();
    }

}
