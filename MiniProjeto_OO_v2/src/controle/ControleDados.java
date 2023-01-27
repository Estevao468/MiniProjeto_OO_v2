package controle;

import modelo.Ciclo;
import modelo.Comprimido;
import modelo.Dados;
import modelo.Liquido;
import modelo.Sintomas;
import modelo.Usuario;

/**
 * Classe responsável pelo controle de adicionar e excluir os dados do sistema.
 * @author Rhumenigue e Estevao
 * @since 2023
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


    public Usuario[] getUsuario(){
        return d.getUsuario();
    }
    public int getQtdUsuario(){
        return d.getQtdUsuario();
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
    
    public Ciclo[] getCiclo(){
        return d.getCiclo();
    }
    
    public int getQtdCiclo(){
        return d.getQtdCiclo();
        
    }
    
    public Sintomas[] getSintomas(){
        return d.getSintomas();
    }
    public int getQtdSintomas(){
        return d.getQtdSintomas();
    }


	/**
	 * Método responsável por adicionar novos dados de ciclo.
	 * @param dadosCiclos dados de cada atributo de um ciclo
	 * @return true se o ciclo foi adicionado com sucesso, false caso contrário
	 * 
	 */
    public boolean inserirEditarCiclo(String[] dadosCiclos) { 
        Ciclo c = new Ciclo(dadosCiclos[1], dadosCiclos[2]);
        d.inserirEditaCiclo(c, Integer.parseInt(dadosCiclos[0])); //Criando novo objeto ciclo
        return true;
    }
    
    public static boolean testeCiclo(String[] dadosCiclos) { 
    	Ciclo c = new Ciclo(dadosCiclos[1], dadosCiclos[2]);
        return true;
    }
    
	/**
	 * Método responsável por excluir algum objeto ciclo escolhido
	 * @param i posição do ciclo no vetor
	 * @return true se o ciclo foi excluído com sucesso, false caso contrário
	 */
    public boolean deletarCiclo(int i) {
		int qtdCiclos = d.getQtdCiclo();
		String ciclo = d.getCiclo()[i].getDetalhedoCiclo();
		
		if(i == (d.getQtdCiclo() - 1)) { //se o ciclo a ser removido for o ultimo do vetor
			d.setQtdCiclo(d.getQtdCiclo() - 1); // diminui a quantidade de comprimidos
			d.getCiclo()[d.getQtdCiclo()] = null; //seta o ultimo Ciclo como null
			return true;
			
		} 
		else { 
			int posicao = 0;
			Object cicloRemovido = null;
			while(d.getCiclo()[posicao].getDetalhedoCiclo().compareTo((String) cicloRemovido) != 0) { // se o Ciclo a ser removido não for o ultimo do vetor
				posicao++;
			}
			for(int j = posicao; j < d.getQtdCiclo() - 1; j++) { //percorre o vetor de Ciclos a partir da posição do Ciclo a ser removido
				d.getCiclo()[j] = d.getCiclo()[j+1]; //cada posição do vetor recebe o valor da posição seguinte
			}
			d.getCiclo()[d.getQtdCiclo()] = null; //seta o ultimo elemento do vetor como null
			d.setQtdCiclo(d.getQtdCiclo() - 1); //diminui a quantidade de comprimidos
			return true;
		}
	}
    
    
	/**
	 * Método responsável por adicionar novos dados de sintomas.
	 * @param dadosLiquidos dados de cada atributo de um líquido
	 * @return true se o líquido foi adicionado com sucesso, false caso contrário
	 * 
	 */
    public boolean inserirEditarSintoma(String[] dadosSintomas) { 
    	Sintomas s = new Sintomas(dadosSintomas[1], dadosSintomas[2]);
        d.inserirEditarSintoma(s, Integer.parseInt(dadosSintomas[0])); // Criando novo objeto sintoma
        return true;
    }
    
    public static boolean testeSintoma(String[] dadosSintomas) { 
    	Sintomas s = new Sintomas(dadosSintomas[1], dadosSintomas[2]);
        return true;
    }
     /**
	  * Método responsável por excluir algum objeto Sintoma escolhido	
	  * @param i posição do Sintoma no vetor
	  * @return true se o liqSintomauido foi excluído com sucesso, false caso contrário

	  */
    public boolean deletarSintoma(int i) {
		int qtdSintomas = d.getQtdSintomas();
		String sintomaRemovido = d.getSintomas()[i].getDetalhedoSintoma();
		
		if(i == (d.getQtdSintomas() - 1)) { //se o Sintoma a ser removido for o ultimo do vetor
			d.setQtdSintomas(d.getQtdSintomas() - 1); // diminui a quantidade de Sintomas
			d.getSintomas()[d.getQtdSintomas()] = null; //seta o ultimo Sintoma como null
			return true;
			
		} 
		else { 
			int posicao = 0;
			while(d.getSintomas()[posicao].getDetalhedoSintoma().compareTo(sintomaRemovido) != 0) { // se o Sintoma a ser removido não for o ultimo do vetor
				posicao++;
			}
			
			for(int j = posicao; j < d.getQtdUsuario() - 1; j++) { //percorre o vetor de Sintoma a partir da posição do Sintoma a ser removido
				d.getSintomas()[j] = d.getSintomas()[j+1]; //cada posição do vetor recebe o valor da posição seguinte
			}
			d.getSintomas()[d.getQtdSintomas()] = null; //seta o ultimo elemento do vetor como null
			d.setQtdSintomas(d.getQtdSintomas() - 1); //decrementa a quantidade de Sintoma
			return true;
		}
	}
    
    
	/**
	 * Método responsável por adicionar novos dados de usuario.
	 * @param dadosPacientes dados de cada atributo de um paciente
	 * @return true se o paciente foi adicionado com sucesso, false caso contrário
	 * 
	 */
    public boolean inserirEditarUsuario(String[] dadosUsuario){
    	    
    	Usuario u = new Usuario(dadosUsuario[1], dadosUsuario[2], dadosUsuario[3],dadosUsuario[4],dadosUsuario[5],dadosUsuario[6],dadosUsuario[7]);
        d.inserirEditarUsuario(u, Integer.parseInt(dadosUsuario[0])); // Criando novo objeto usuario
        return true;
    }
    

	/**
	 * Método responsável por excluir algum objeto Usuario escolhido
	 * @param i posição do Usuario no vetor
	 * @return true se o Usuario foi excluído com sucesso, false caso contrário
	 * 
	 */
    public boolean deletarUsuario(int i) {
		int qtdUsuario = d.getQtdUsuario();
    	String usuarioRemovido = d.getUsuario()[i].getNome();
    	
		if(i == (d.getQtdUsuario() - 1)) {  //se o Usuario a ser removido for o ultimo do vetor
			d.setQtdUsuario(d.getQtdUsuario() - 1); // diminui a quantidade de Usuarios
			d.getUsuario()[d.getQtdUsuario()] = null; //seta o ultimo Usuario como null
			return true;
			
		} 
		else { 
			int posicao = 0;
			while(d.getUsuario()[posicao].getNome().compareTo(usuarioRemovido) != 0) { // se o Usuario a ser removido não for o ultimo do vetor
				posicao++;
			}
			for(int j = posicao; j < d.getQtdUsuario() - 1; j++) { //percorre o vetor de Usuario a partir da posição do Usuario a ser removido
				d.getUsuario()[j] = null; // seta posição do vetor como null
				d.getUsuario()[j] = d.getUsuario()[j+1]; //cada posição do vetor recebe o valor da posição seguinte
			}
			d.getUsuario()[d.getQtdUsuario()] = null; //seta o ultimo elemento do vetor como null
			d.setQtdUsuario(d.getQtdUsuario() - 1); //decrementa a quantidade de Usuario
			return true;
		}
	}

}