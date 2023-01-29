package testeJUnit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import controle.*;
import modelo.*;


public class TesteValidador {
	
	
	//testa se insere ou edita o Liquido
	@Test
	public void testeTotalSintoma() {
		String[] dadosTeste = new String[50];
		dadosTeste[1] = "Liquido Teste";
		dadosTeste[2] = "Data Teste";
		dadosTeste[3] = "Observação Teste";
		assertTrue(ControleDados.testeSintoma(dadosTeste));
	}
	
	//testa se insere ou editar o Comprimido
	@Test
	public void testeTotalCiclo() {
		String[] dadosTeste = new String[50];
		dadosTeste[1] = "Comprimido Teste";
		dadosTeste[2] = "Data Teste";
		dadosTeste[3] = "Observação Teste";
		assertTrue(ControleDados.testeCiclo(dadosTeste));
		
	}
	
	
	
}