 package view;

import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import controle.*;
import modelo.*;

/**
 * Classe referente a criação da tela principal do sistema 
 * @author Estevão e Rhumenigue
 * @since 2023
 * @version 1.0
 *
 */
public class TelaMenu implements ActionListener {
	
	private static JFrame janela = new JFrame("Diario de Ciclo Menstrual");
	private static JLabel titulo = new JLabel("Menu");
	private static JButton diario = new JButton("Diario");
	public static ControleDados dados = new ControleDados();
	
	/**
	 * Método que adiciona todos elementos visuais referentes a TelaMenu
	 * 
	 */
	public TelaMenu() { // layout do menu principal
		titulo.setFont(new Font("Arial", Font.BOLD, 30));
		titulo.setBounds(280, 80, 600, 30);
		diario.setBounds(250, 250, 140, 50);
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(diario);
		
		
		janela.setSize(670, 500);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	/**
	 * Método Main do sistema
	 * @param args
	 * 
	 */
	public static void main(String[] args) { // funcao main do sistema
		TelaMenu menu = new TelaMenu();
		
		diario.addActionListener(menu);
	}
	
	/**
	 * Método de ativação da ação nos botões presentes
	 * @param e evento de clique
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 *
	 */
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		

		if(src == diario) {
			janela.dispose();
			new TelaEscolhaDiario();
			
		}	// chama a tela de escolha do tipo se sintoma ou ciclo
	}
	public void mostrarDados(ControleDados dados2, int i) {
		// TODO Stub de método gerado automaticamente
		
	}
		
}
