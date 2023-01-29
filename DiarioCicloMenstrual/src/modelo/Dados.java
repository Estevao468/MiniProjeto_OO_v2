package modelo;

/**
 * Classe responsável pelo aramazenamento de todos os dados
 * @author Estevão e Rhumenigue
 * @since 2023
 * @version 1.0
 * 
 */
public class Dados { // classe que amarzena todos arrays utilizados pelo sistema
    private Sintoma[] sintomas = new Sintoma[50];
	private int qtdSintoma = 0;
    private Comprimido[] comprimidos = new Comprimido[50];
    private int qtdComprimidos = 0;
    private Liquido[] liquidos = new Liquido[50];
    private int qtdLiquidos = 0;
    private Comprimido[] comprimidosPacientes = new Comprimido[50];
    private Liquido[] liquidosPacientes = new Liquido[50];
    private Ciclo[] ciclos = new Ciclo[50];
	private int qtdCiclos = 0;

    /**
     * Método de pré-cadastro de dados dos pacientes no sistema.
     * 
     */
    public void PreencherDados(){ //funcao para pre cadastrar dados no sistema
    	
        comprimidosPacientes[0] = new Comprimido("CPaciente0", "Jassen", "3 vezes na semana", 2, 30);
        liquidosPacientes[0] = new Liquido("LPaciente1", "Jassen", "2 vezes na semana", 2, 50);
        
        comprimidosPacientes[1] = new Comprimido("CPaciente1", "Industria Quimica", "1 vez por dia", 1, 60);
        liquidosPacientes[1] = new Liquido("LPaciente0", "OMS", "3 vezes na semana", 3, 150);
        
        ciclos[0] = new Ciclo("Estevão Magalhães", "31 de agosto");
        ciclos[1] = new Ciclo("Rhumenigue Barbosa", "23 de Maio");

        
        
        
        qtdComprimidos = 2;
        qtdLiquidos = 2;
        qtdSintoma = 2;
    }
    
    
    /**
     * Método de pré-cadastro de dados gerais no sistema.
     */
    public void PreencherDadosGerais() {
    	comprimidos[0] = new Comprimido("Comprimido0", "Jassen", "3 vezes na semana", 2, 30);
        liquidos[0] = new Liquido("Liquido0", "Jassen", "2 vezes na semana", 2, 50);
        
        comprimidos[1] = new Comprimido("Comprimido1", "Industria Quimica", "1 vez por dia", 1, 60);
        liquidos[1] = new Liquido("Liquido1", "OMS", "3 vezes na semana", 3, 150);
        
        qtdComprimidos = 2;
        qtdLiquidos = 2;
    }

    /**
     * Método de adição de um comprimido
     * @param c objeto comprimido
     * @param pos posição do array
     *
     */
    public void inserirEditarComprimido(Comprimido c, int pos){ // funcao de inserir comprimidos cadastrados por ControleDados
        this.comprimidos[pos] = c;
        if(pos == qtdComprimidos)
            qtdComprimidos++;
    }
    

    /**
     * Método de adição de um comprimido de um paciente
     * @param c obejto comprimido
     * @param pos posição do array
     *
     */
    public void inserirEditarComprimidoPaciente(Comprimido c, int pos){ // funcao de inserir comprimidos cadastrados por ControleDados
        this.comprimidosPacientes[pos] = c;
        if(pos == qtdComprimidos);
            qtdComprimidos++;
    }

    /**
     * Método de adição de um liquido
     * @param l objeto liquido
     * @param pos posição do array
     *
     */
    public void inserirEditarLiquido(Liquido l, int pos){ // funcao de inserir liquidos cadastrados por ControleDados
        this.liquidos[pos] = l;
        if(pos == qtdLiquidos)
            qtdLiquidos++;
    }

    /**
     * Método de adição de um liquido de um paciente
     * @param l objeto liquido
     * @param pos posição do array
     *
     */
    public void inserirEditarLiquidoPaciente(Liquido l, int pos){ // funcao de inserir liquidos cadastrados por ControleDados
        this.liquidosPacientes[pos] = l;
        if(pos == qtdLiquidos)
            qtdLiquidos++;
    }
    
    /**
     * Método de adição de um paciente
     * @param p objeto paciente
     * @param pos posição do array
     *
     */
    public void inserirEditarPaciente(Sintoma p, int pos){ // funcao de inserir pacientes cadastrados por ControleDados
        this.sintomas[pos] = p;
        if(pos == qtdSintoma){
            qtdSintoma++;
        }
    }
    
    public static boolean testeInserirEditarPaciente(int posTeste, int qtdPacienteTeste){ // funcao de inserir pacientes cadastrados por ControleDados
        if(posTeste == qtdPacienteTeste){
            qtdPacienteTeste++;
        }
        if(qtdPacienteTeste == 3) {
        	return true;
        }
        else {
        	return false;
        }
    }
    //getters e setters
    public Sintoma[] getSintoma() {
        return sintomas;
    }
    public void setSintoma(Sintoma[] sintoma) {
        this.sintomas = sintoma;
    }
    
    public int getQtdSintoma() {
        return qtdSintoma;
    }
    public void setQtdSintoma(int qtdSintoma) {
        this.qtdSintoma = qtdSintoma;
    }
    
    public Comprimido[] getComprimidos() {
        return comprimidos;
    }
    public void setComprimidos(Comprimido[] comprimidos) {
        this.comprimidos = comprimidos;
    }
    
    public int getQtdComprimidos() {
        return qtdComprimidos;
    }
    public void setQtdComprimidos(int qtdComprimidos) {
        this.qtdComprimidos = qtdComprimidos;
    }
    
    public Liquido[] getLiquidos() {
        return liquidos;
    }
    public void setLiquidos(Liquido[] liquidos) {
        this.liquidos = liquidos;
    }
    
    public int getQtdLiquidos() {
        return qtdLiquidos;
    }
    public void setQtdLiquidos(int qtdLiquidos) {
        this.qtdLiquidos = qtdLiquidos;
    }
    
    public Ciclo[] getCiclos() {
        return ciclos;
    }
    public void setCiclos(Ciclo[] ciclos) {
        this.ciclos = ciclos;
    }
    
    
    
    public int getQtdCiclos() {
        return qtdCiclos;
    }
    public void setQtdCiclos(int qtdCiclos) {
        this.qtdCiclos = qtdCiclos;
    }


	public void inserirEditarLiquidoSintoma(Liquido l, int qtdLiquidos2) {
		// TODO Stub de método gerado automaticamente
		
	}



    
}