package controle;

import modelo.*;
import testeJUnit.*;

/**
 * Classe responsável pelo controle de adicionar e excluir os dados do sistema.
 * @author Diógenes Júnior
 * @since 2022
 *
 */
public class ControleDados {
    private Dados d = new Dados();
     /**
	  * Construtor da classe ControleDados que começa com os dados pré cadastrados do sistema
	  */
    public ControleDados() {
        d.PreencherDados();
        d.PreencherDadosGerais(); //construtor que começa com os dados ja pré cadastrados
    }

    public Dados getDados() {
        return d;
    }
    public void setDados(Dados d) {
        this.d = d;
    }

    public Sintoma[] getSintoma(){
        return d.getSintoma();
    }
    public int getQtdSintoma(){
        return d.getQtdSintoma();
    }
    
    public Comprimido[] getComprimidos() {
        return d.getComprimidos();
    }
    public int getQtdComprimidos() {
        return d.getQtdComprimidos();
    }

    public Liquido[] getLiquidos() {
        return d.getLiquidos();
    }
    public int getQtdLiquidos() {
        return d.getQtdLiquidos();
    }
    
    public Ciclo[] getCiclos(){
        return d.getCiclos();
    }
    public int getQtdCiclos(){
        return d.getQtdCiclos();
    }


	/**
	 * Método responsável por adicionar novos dados de comprimidos.
	 * @param dadosComprimidos dados de cada atributo de um comprimido
	 * @return true se o comprimido foi adicionado com sucesso, false caso contrário
	 * 
	 */
    public boolean inserirEditarComprimido(String[] dadosComprimidos) { 
        Comprimido c = new Comprimido(dadosComprimidos[1], dadosComprimidos[2], dadosComprimidos[3], Integer.parseInt(dadosComprimidos[4]), Integer.parseInt(dadosComprimidos[5]));
        d.inserirEditarComprimido(c, Integer.parseInt(dadosComprimidos[0])); //Criando novo objeto comprimido
        return true;
    }
    
    public static boolean testeComprimido(String[] dadosComprimidos) { 
    	Comprimido c = new Comprimido(dadosComprimidos[1], dadosComprimidos[2], dadosComprimidos[3], Integer.parseInt(dadosComprimidos[4]), Integer.parseInt(dadosComprimidos[5]));
        return true;
    }
    
	/**
	 * Método responsável por excluir algum objeto comprimido escolhido
	 * @param i posição do comprimido no vetor
	 * @return true se o comprimido foi excluído com sucesso, false caso contrário
	 */
    public boolean deletarComprimido(int i) {
		int qtdComprimidos = d.getQtdComprimidos();
		String comprimidoRemovido = d.getComprimidos()[i].getNome();
		
		if(i == (d.getQtdComprimidos() - 1)) { //se o comprimido a ser removido for o ultimo do vetor
			d.setQtdComprimidos(d.getQtdComprimidos() - 1); // decrementa a quantidade de comprimidos
			d.getComprimidos()[d.getQtdComprimidos()] = null; //seta o ultimo comprimido como null
			return true;
			
		} 
		else { 
			int posicao = 0;
			while(d.getComprimidos()[posicao].getNome().compareTo(comprimidoRemovido) != 0) { // se o comprimido a ser removido não for o ultimo do vetor
				posicao++;
			}
			for(int j = posicao; j < d.getQtdComprimidos() - 1; j++) { //percorre o vetor de comprimidos a partir da posição do comprimido a ser removido
				d.getComprimidos()[j] = d.getComprimidos()[j+1]; //cada posição do vetor recebe o valor da posição seguinte
			}
			d.getComprimidos()[d.getQtdComprimidos()] = null; //seta o ultimo elemento do vetor como null
			d.setQtdComprimidos(d.getQtdComprimidos() - 1); //decrementa a quantidade de comprimidos
			return true;
		}
	}
    
    
	/**
	 * Método responsável por adicionar novos dados de líquidos.
	 * @param dadosLiquidos dados de cada atributo de um líquido
	 * @return true se o líquido foi adicionado com sucesso, false caso contrário
	 * 
	 */
    public boolean inserirEditarLiquido(String[] dadosLiquidos) { 
    	Liquido l = new Liquido(dadosLiquidos[1], dadosLiquidos[2], dadosLiquidos[3], Integer.parseInt(dadosLiquidos[4]), Integer.parseInt(dadosLiquidos[5]));
        d.inserirEditarLiquido(l, Integer.parseInt(dadosLiquidos[0])); // Criando novo objeto liquido
        return true;
    }
    
    public static boolean testeLiquido(String[] dadosLiquidos) { 
    	Liquido l = new Liquido(dadosLiquidos[1], dadosLiquidos[2], dadosLiquidos[3], Integer.parseInt(dadosLiquidos[4]), Integer.parseInt(dadosLiquidos[5]));
        return true;
    }
     /**
	  * Método responsável por excluir algum objeto líquido escolhido	
	  * @param i posição do líquido no vetor
	  * @return true se o liquido foi excluído com sucesso, false caso contrário

	  */
    public boolean deletarLiquido(int i) {
		int qtdLiquidos = d.getQtdLiquidos();
		String liquidoRemovido = d.getLiquidos()[i].getNome();
		
		if(i == (d.getQtdLiquidos() - 1)) { //se o liquido a ser removido for o ultimo do vetor
			d.setQtdLiquidos(d.getQtdLiquidos() - 1); // decrementa a quantidade de liquidos
			d.getLiquidos()[d.getQtdLiquidos()] = null; //seta o ultimo liquido como null
			return true;
			
		} 
		else { 
			int posicao = 0;
			while(d.getLiquidos()[posicao].getNome().compareTo(liquidoRemovido) != 0) { // se o liquido a ser removido não for o ultimo do vetor
				posicao++;
			}
			
			for(int j = posicao; j < d.getQtdSintoma() - 1; j++) { //percorre o vetor de liquidos a partir da posição do liquido a ser removido
				d.getLiquidos()[j] = d.getLiquidos()[j+1]; //cada posição do vetor recebe o valor da posição seguinte
			}
			d.getLiquidos()[d.getQtdLiquidos()] = null; //seta o ultimo elemento do vetor como null
			d.setQtdLiquidos(d.getQtdLiquidos() - 1); //decrementa a quantidade de liquidos
			return true;
		}
	}
    
    
	/**
	 * Método responsável por adicionar novos dados de pacientes.
	 * @param dadosPacientes dados de cada atributo de um paciente
	 * @return true se o paciente foi adicionado com sucesso, false caso contrário
	 * 
	 */
    public boolean inserirEditarSintoma(String[] dadosSintoma){
    	Liquido l = new Liquido(dadosSintoma[8], dadosSintoma[9], dadosSintoma[10], 
        		Integer.parseInt(dadosSintoma[11]), Integer.parseInt(dadosSintoma[12]));
    	    
        Sintoma p = new Sintoma(dadosSintoma[1], dadosSintoma[2], dadosSintoma[3], dadosSintoma[4], dadosSintoma[5], null);

        d.inserirEditarLiquidoSintoma(l, getQtdLiquidos());
        d.inserirEditarPaciente(p, Integer.parseInt(dadosSintoma[0]));
        		
        return true;
    }
    

	/**
	 * Método responsável por excluir algum objeto paciente escolhido
	 * @param i posição do paciente no vetor
	 * @return true se o paciente foi excluído com sucesso, false caso contrário
	 * 
	 */
    public boolean deletarSintoma(int i) {
		int qtdSintoma = d.getQtdSintoma();
    	String sintomaRemovido = d.getSintoma()[i].getNome();
    	
		if(i == (d.getQtdSintoma() - 1)) {  //se o paciente a ser removido for o ultimo do vetor
			d.setQtdSintoma(d.getQtdSintoma() - 1); // decrementa a quantidade de pacientes
			d.getSintoma()[d.getQtdSintoma()] = null; //seta o ultimo paciente como null
			return true;
			
		} 
		else { 
			int posicao = 0;
			while(d.getSintoma()[posicao].getNome().compareTo(sintomaRemovido) != 0) { // se o paciente a ser removido não for o ultimo do vetor
				posicao++;
			}
			for(int j = posicao; j < d.getQtdSintoma() - 1; j++) { //percorre o vetor de pacientes a partir da posição do paciente a ser removido
				d.getSintoma()[j] = null; // seta posição do vetor como null
				d.getSintoma()[j] = d.getSintoma()[j+1]; //cada posição do vetor recebe o valor da posição seguinte
			}
			d.getSintoma()[d.getQtdSintoma()] = null; //seta o ultimo elemento do vetor como null
			d.setQtdSintoma(d.getQtdSintoma() - 1); //decrementa a quantidade de pacientes
			return true;
		}
	}
}

