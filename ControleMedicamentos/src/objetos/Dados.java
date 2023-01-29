package objetos;

/**
 * Classe referente ao amarzenamento de todas instâncias dos 
 * Objetos no sistema.
 * @author Henrique Pucci
 *
 */
public class Dados { // classe que amarzena todos arrays utilizados pelo sistema
    
    private Ciclo[] ciclo = new Ciclo[50];
    private int qtdCiclo = 0;
    private Sintoma[] sintoma = new Sintoma[50];
    private int qtdSintoma = 0;
    private Ciclo[] comprimidosPacientes = new Ciclo[50];
    private Sintoma[] liquidosPacientes = new Sintoma[50];

    /**
     * Método de pré-cadastro de dados dos pacientes no sistema.
     * 
     */
    public void PreencherDados(){ //funcao para pre cadastrar dados no sistema
   
        qtdCiclo = 2;
        qtdSintoma = 2;
    }
    
    
    /**
     * Método de pré-cadastro de dados gerais no sistema.
     */
    public void PreencherDadosGerais() {
    	ciclo[0] = new Ciclo("Comprimido0", "Jassen", "3 vezes na semana",null);
        sintoma[0] = new Sintoma("Liquido0", "Jassen", "2 vezes na semana",null);
        
        ciclo[1] = new Ciclo("Comprimido1", "Industria Quimica", "1 vez por dia",null);
        sintoma[1] = new Sintoma("Liquido1", "OMS", "3 vezes na semana",null);
        
        qtdCiclo = 2;
    }

    /**
     * Método de adição de um comprimido
     * @param c objeto comprimido
     * @param pos posição do array
     *
     */
    public void inserirEditarCiclo(Ciclo c, int pos){ // funcao de inserir comprimidos cadastrados por ControleDados
        this.ciclo[pos] = c;
        if(pos == qtdCiclo)
            qtdCiclo++;
    }
    

    /**
     * Método de adição de um comprimido de um paciente
     * @param c obejto comprimido
     * @param pos posição do array
     *
     */
    public void inserirEditarCicloPaciente(Ciclo c, int pos){ // funcao de inserir comprimidos cadastrados por ControleDados
        this.comprimidosPacientes[pos] = c;
        if(pos == qtdCiclo);
            qtdCiclo++;
    }

    /**
     * Método de adição de um liquido
     * @param l objeto liquido
     * @param pos posição do array
     *
     */
    public void inserirEditarSintoma(Sintoma l, int pos){ // funcao de inserir liquidos cadastrados por ControleDados
        this.sintoma[pos] = l;
        if(pos == qtdSintoma)
            qtdSintoma++;
    }

    /**
     * Método de adição de um liquido de um paciente
     * @param l objeto liquido
     * @param pos posição do array
     *
     */
    public void inserirEditarSintomaPaciente(Sintoma l, int pos){ // funcao de inserir liquidos cadastrados por ControleDados
        this.liquidosPacientes[pos] = l;
        if(pos == qtdSintoma)
            qtdSintoma++;
    }
    
    /**
     * Método de adição de um paciente
     * @param p objeto paciente
     * @param pos posição do array
     *
     */
    
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