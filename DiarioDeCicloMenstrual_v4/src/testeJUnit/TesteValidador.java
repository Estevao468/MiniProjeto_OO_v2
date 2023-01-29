package testeJUnit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import controle.*;
import modelo.*;


public class TesteValidador {
	
	
	//testa se insere ou edita o Sintoma
	@Test
	public void testeTotalSintoma() {
		String[] dadosTeste = new String[50];
		dadosTeste[1] = "Sintoma Teste";
		dadosTeste[2] = "Data Teste";
		dadosTeste[3] = "Observação Teste";
		assertTrue(ControleDados.testeSintoma(dadosTeste));
	}
	
	//testa se insere ou edita o Ciclo
	@Test
	public void testeTotalCiclo() {
		String[] dadosTeste = new String[50];
		dadosTeste[1] = "CIclo Teste";
		dadosTeste[2] = "Data Teste";
		dadosTeste[3] = "Observação Teste";
		assertTrue(ControleDados.testeCiclo(dadosTeste));
		
	}
	

	
}