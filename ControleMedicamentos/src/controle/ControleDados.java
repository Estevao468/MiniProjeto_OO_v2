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
	 * Método responsável por adicionar novos dados de comprimidos.
	 * @param dadosComprimidos dados de cada atributo de um comprimido
	 * @return true se o comprimido foi adicionado com sucesso, false caso contrário
	 * 
	 */
    public boolean inserirEditarCiclo(String[] dadosCiclo) { 
        Ciclo c = new Ciclo(dadosCiclo[1], dadosCiclo[2], dadosCiclo[3],dadosCiclo[4]);
        d.inserirEditarCiclo(c, Integer.parseInt(dadosCiclo[0])); //Criando novo objeto comprimido
        return true;
    }
    
    public static boolean testeCiclo(String[] dadosCiclo) { 
    	Ciclo c = new Ciclo(dadosCiclo[1], dadosCiclo[2], dadosCiclo[3],dadosCiclo[4]);
        return true;
    }
    
	/**
	 * Método responsável por excluir algum objeto comprimido escolhido
	 * @param i posição do comprimido no vetor
	 * @return true se o comprimido foi excluído com sucesso, false caso contrário
	 */
    public boolean deletarCiclo(int i) {
		int qtdCiclo = d.getQtdCiclo();
		String comprimidoRemovido = d.getCiclo()[i].getNome();
		
		if(i == (d.getQtdCiclo() - 1)) { //se o comprimido a ser removido for o ultimo do vetor
			d.setQtdCiclo(d.getQtdCiclo() - 1); // decrementa a quantidade de comprimidos
			d.getCiclo()[d.getQtdCiclo()] = null; //seta o ultimo comprimido como null
			return true;
			
		} 
		else { 
			int posicao = 0;
			while(d.getCiclo()[posicao].getNome().compareTo(comprimidoRemovido) != 0) { // se o comprimido a ser removido não for o ultimo do vetor
				posicao++;
			}
			for(int j = posicao; j < d.getQtdCiclo() - 1; j++) { //percorre o vetor de comprimidos a partir da posição do comprimido a ser removido
				d.getCiclo()[j] = d.getCiclo()[j+1]; //cada posição do vetor recebe o valor da posição seguinte
			}
			d.getCiclo()[d.getQtdCiclo()] = null; //seta o ultimo elemento do vetor como null
			d.setQtdCiclo(d.getQtdCiclo() - 1); //decrementa a quantidade de comprimidos
			return true;
		}
	}
    
    
	/**
	 * Método responsável por adicionar novos dados de líquidos.
	 * @param dadosLiquidos dados de cada atributo de um líquido
	 * @return true se o líquido foi adicionado com sucesso, false caso contrário
	 * 
	 */
    public boolean inserirEditarSintoma(String[] dadosSintoma) { 
    	Sintoma s = new Sintoma(dadosSintoma[1], dadosSintoma[2], dadosSintoma[3], dadosSintoma[4]);
        d.inserirEditarSintoma(s, Integer.parseInt(dadosSintoma[0])); // Criando novo objeto liquido
        return true;
    }
    
    public static boolean testeSintoma(String[] dadosSintoma) { 
    	Sintoma s = new Sintoma(dadosSintoma[1], dadosSintoma[2], dadosSintoma[3],dadosSintoma[4]);
        return true;
    }
     /**
	  * Método responsável por excluir algum objeto líquido escolhido	
	  * @param i posição do líquido no vetor
	  * @return true se o liquido foi excluído com sucesso, false caso contrário

	  */
    public boolean deletarSintoma(int i) {
		int qtdSintoma = d.getQtdSintoma();
		String sintomaRemovido = d.getSintoma()[i].getNome();
		
		if(i == (d.getQtdSintoma() - 1)) { //se o liquido a ser removido for o ultimo do vetor
			d.setQtdSintoma(d.getQtdSintoma() - 1); // decrementa a quantidade de liquidos
			d.getSintoma()[d.getQtdSintoma()] = null; //seta o ultimo liquido como null
			return true;
			
		} 
		else { 
			int posicao = 0;
			while(d.getSintoma()[posicao].getNome().compareTo(sintomaRemovido) != 0) { // se o liquido a ser removido não for o ultimo do vetor
				posicao++;
			}
			
			for(int j = posicao; j < d.getQtdSintoma() - 1; j++) { //percorre o vetor de liquidos a partir da posição do liquido a ser removido
				d.getSintoma()[j] = d.getSintoma()[j+1]; //cada posição do vetor recebe o valor da posição seguinte
			}
			d.getSintoma()[d.getQtdSintoma()] = null; //seta o ultimo elemento do vetor como null
			d.setQtdSintoma(d.getQtdSintoma() - 1); //decrementa a quantidade de liquidos
			return true;
		}
	}
}

