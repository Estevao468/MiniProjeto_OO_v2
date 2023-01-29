package controle;

import modelo.*;
import testeJUnit.*;

/**
 * Classe responsável pelo controle de adicionar e excluir os dados do sistema.
 * @author Estevão e Rhumenigue
 * @since 2023
 * @version 1.0
 *
 */
public class ControleDados {
    private Dados d = new Dados();
     /**
	  * Construtor da classe ControleDados que começa com os dados pré cadastrados do sistema
	  */
    public ControleDados() {
        d.PreencherDados();
        d.PreencherDadosGerais(); //construtor que começa com os dados pré cadastrados
    }

    public Dados getDados() {
        return d;
    }
    public void setDados(Dados d) {
        this.d = d;
    }

    public Ciclo[] getCiclo() {
        return d.getCiclo();
    }
    public int getQtdCiclo() {
        return d.getQtdCiclo();
    }

    public Sintoma[] getSintoma() {
        return d.getSintoma();
    }
    public int getQtdSintoma() {
        return d.getQtdSintoma();
    }


	/**
	 * Método responsável por adicionar novos dados de ciclos.
	 * @param dadosCiclos dados de cada atributo de um ciclo
	 * @return true se o ciclo foi adicionado com sucesso, false caso contrário
	 * 
	 */
    public boolean inserirEditarCiclo(String[] dadosCiclo) { 
        Ciclo c = new Ciclo(dadosCiclo[1], dadosCiclo[2], dadosCiclo[3],dadosCiclo[4]);
        d.inserirEditarCiclo(c, Integer.parseInt(dadosCiclo[0])); //Criando novo objeto ciclo
        return true;
    }
    
    public static boolean testeCiclo(String[] dadosCiclo) { 
    	Ciclo c = new Ciclo(dadosCiclo[1], dadosCiclo[2], dadosCiclo[3],dadosCiclo[4]);
        return true;
    }
    
	/**
	 * Método responsável por excluir algum objeto ciclo escolhido
	 * @param i posição do ciclo no vetor
	 * @return true se o ciclo foi excluído com sucesso, false caso contrário
	 */
    public boolean deletarCiclo(int i) {
		int qtdCiclo = d.getQtdCiclo();
		String cicloRemovido = d.getCiclo()[i].getNome();
		
		if(i == (d.getQtdCiclo() - 1)) { //se o ciclo a ser removido for o ultimo do vetor
			d.setQtdCiclo(d.getQtdCiclo() - 1); // reduz a quantidade de ciclo
			d.getCiclo()[d.getQtdCiclo()] = null; //seta o último ciclo como null
			return true;
			
		} 
		else { 
			int posicao = 0;
			while(d.getCiclo()[posicao].getNome().compareTo(cicloRemovido) != 0) { // se o ciclo a ser removido não for o ultimo do vetor
				posicao++;
			}
			for(int j = posicao; j < d.getQtdCiclo() - 1; j++) { //percorre o vetor de ciclo a partir da posição do ciclo a ser removido
				d.getCiclo()[j] = d.getCiclo()[j+1]; //cada posição do vetor recebe o valor da posição seguinte
			}
			d.getCiclo()[d.getQtdCiclo()] = null; //seta o ultimo elemento do vetor como null
			d.setQtdCiclo(d.getQtdCiclo() - 1); //reduz a quantidade de ciclo
			return true;
		}
	}
    
    
	/**
	 * Método responsável por adicionar novos dados de sintomas.
	 * @param dadosSintoma dados de cada atributo de um sintoma
	 * @return true se o sintoma foi adicionado com sucesso, false caso contrário
	 * 
	 */
    public boolean inserirEditarSintoma(String[] dadosSintoma) { 
    	Sintoma s = new Sintoma(dadosSintoma[1], dadosSintoma[2], dadosSintoma[3], dadosSintoma[4]);
        d.inserirEditarSintoma(s, Integer.parseInt(dadosSintoma[0])); // Criando novo objeto sintoma
        return true;
    }
    
    public static boolean testeSintoma(String[] dadosSintoma) { 
    	Sintoma s = new Sintoma(dadosSintoma[1], dadosSintoma[2], dadosSintoma[3],dadosSintoma[4]);
        return true;
    }
     /**
	  * Método responsável por excluir algum objeto sintoma escolhido	
	  * @param i posição do sintoma no vetor
	  * @return true se o liqsintomauido foi excluído com sucesso, false caso contrário

	  */
    public boolean deletarSintoma(int i) {
		int qtdSintoma = d.getQtdSintoma();
		String sintomaRemovido = d.getSintoma()[i].getNome();
		
		if(i == (d.getQtdSintoma() - 1)) { //se o sintoma a ser removido for o ultimo do vetor
			d.setQtdSintoma(d.getQtdSintoma() - 1); // reduz a quantidade de sintoma
			d.getSintoma()[d.getQtdSintoma()] = null; //seta o ultimo sintoma como null
			return true;
			
		} 
		else { 
			int posicao = 0;
			while(d.getSintoma()[posicao].getNome().compareTo(sintomaRemovido) != 0) { // se o sintoma a ser removido não for o ultimo do vetor
				posicao++;
			}
			
			for(int j = posicao; j < d.getQtdSintoma() - 1; j++) { //percorre o vetor de sintomas a partir da posição do sintoma a ser removido
				d.getSintoma()[j] = d.getSintoma()[j+1]; //cada posição do vetor recebe o valor da posição seguinte
			}
			d.getSintoma()[d.getQtdSintoma()] = null; //seta o ultimo elemento do vetor como null
			d.setQtdSintoma(d.getQtdSintoma() - 1); //reduz a quantidade de sintomas
			return true;
		}
	}
}

