package modelo;

/**
 * Classe referente ao amarzenamento de todas instâncias dos 
 * Objetos no sistema.
 * @author Rhumenigue e Estevão
 * @version 1.0
 *
 */
public class Dados { // classe que amarzena todos arrays utilizados pelo sistema
    
    private Ciclo[] ciclo = new Ciclo[50];
    private int qtdCiclo = 0;
    private Sintoma[] sintoma = new Sintoma[50];
    private int qtdSintoma = 0;

    /**
     * Método de pré-cadastro de dados no sistema.
     * 
     */
    public void PreencherDados(){ //funcao para pre cadastrar dados no sistema
   
        qtdCiclo = 3;
        qtdSintoma = 3;
    }
    
    
    /**
     * Método de pré-cadastro de dados gerais no sistema.
     */
    public void PreencherDadosGerais() {
    	ciclo[0] = new Ciclo("Folicular", "01/01/2023", "Fluxo intenso","Forte");
        sintoma[0] = new Sintoma("Cólica", "01/01/2023", "Fortes dores","Médio");
        
        ciclo[1] = new Ciclo("Ovulatorio", "15/01/2023", "Período fertil","Forte");
        sintoma[1] = new Sintoma("Enxaqueca", "20/01/2023", "Dores de cabeça","Forte");
        
        ciclo[2] = new Ciclo("Lutea", "30/01/2023", "Fim do Período","Fraco");
        sintoma[2] = new Sintoma("Nenhum", "30/01/2023", "Nada","Médio");
        
        qtdCiclo = 3;
        qtdSintoma = 3;
    }

    /**
     * Método de adição de um ciclo
     * @param c objeto ciclo
     * @param pos posição do array
     *
     */
    public void inserirEditarCiclo(Ciclo c, int pos){ // funcao de inserir ciclo cadastrados por ControleDados
        this.ciclo[pos] = c;
        if(pos == qtdCiclo)
            qtdCiclo++;
    }
    
    
    /**
     * Método de adição de um sintoma
     * @param l objeto sintoma
     * @param pos posição do array
     *
     */
    public void inserirEditarSintoma(Sintoma l, int pos){ // funcao de inserir sintoma cadastrados por ControleDados
        this.sintoma[pos] = l;
        if(pos == qtdSintoma)
            qtdSintoma++;
    }

 
    
    public Ciclo[] getCiclo() {
        return ciclo;
    }
    public void setCiclo(Ciclo[] ciclo) {
        this.ciclo = ciclo;
    }
    
    public int getQtdCiclo() {
        return qtdCiclo;
    }
    public void setQtdCiclo(int qtdCiclo) {
        this.qtdCiclo = qtdCiclo;
    }
    
    public Sintoma[] getSintoma() {
        return sintoma;
    }
    public void setSintoma(Sintoma[] sintoma) {
        this.sintoma = sintoma;
    }
    
    public int getQtdSintoma() {
        return qtdSintoma;
    }
    public void setQtdSintoma(int qtdSintoma) {
        this.qtdSintoma = qtdSintoma;
    }
    
}