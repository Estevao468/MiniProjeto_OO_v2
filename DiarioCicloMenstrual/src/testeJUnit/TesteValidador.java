package testeJUnit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import controle.*;
import modelo.*;


public class TesteValidador {
	
	@Test
	//teste se o nome do paciente não é null;
	public void testeNomePaciente() {
		int certo1 = 2;
		int certo2 = 2;
		int errado1 = 1;
		int errado2 = 1;
		assertTrue(Dados.testeInserirEditarPaciente(certo1,certo2));
		assertFalse(Dados.testeInserirEditarPaciente(errado1, errado2));
	}
	
	//testa se insere ou edita o Liquido
	@Test
	public void testeTotalLiquido() {
		String[] dadosTeste = new String[50];
		dadosTeste[1] = "Liquido Teste";
		dadosTeste[2] = "Marca Teste";
		dadosTeste[3] = "Frequencia Teste";
		dadosTeste[4] = "4";
		dadosTeste[5] = "50";
		assertTrue(ControleDados.testeLiquido(dadosTeste));
	}
	
	//testa se insere ou editar o Comprimido
	@Test
	public void testeTotalComprimido() {
		String[] dadosTeste = new String[50];
		dadosTeste[1] = "Comprimido Teste";
		dadosTeste[2] = "Marca Teste";
		dadosTeste[3] = "Frequencia Teste";
		dadosTeste[4] = "6";
		dadosTeste[5] = "150";
		assertTrue(ControleDados.testeComprimido(dadosTeste));
		
	}
	
	
	
}