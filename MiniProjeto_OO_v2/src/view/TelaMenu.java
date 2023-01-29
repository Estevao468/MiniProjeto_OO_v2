package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import controle.*;

/**
 * Classe referente ao menu principal do sistema 
 * @author Rhumenigue e Estevao
 * @since 2023
 *
 */
public class TelaMenu implements ActionListener {
	
	private static JFrame janela = new JFrame("Sintomas");
	private static JLabel titulo = new JLabel("Diario de Ciclo Menstrual");
	private static JButton sintomas = new JButton("Sintomas");
	private static JButton usuario = new JButton("Usuario");
	public static ControleDados dados = new ControleDados();
	
	/**
	 * Método que adiciona todos elementos visuais referentes a TelaMenu
	 * 
	 */
	public TelaMenu() { // layout do menu principal
		titulo.setFont(new Font("Arial", Font.BOLD, 30));
		titulo.setBounds(160, 40, 600, 30);
		sintomas.setBounds(355, 300, 140, 50);
		usuario.setBounds(170, 300, 140, 50);
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(usuario);
		janela.add(sintomas);
		
		
		janela.setSize(700, 500);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	/**
	 * Método Main do sistema
	 * @param argumentos
	 * 
	 */
	public static void main(String[] args) { // funcao main do sistema
		TelaMenu menu = new TelaMenu();
		
		usuario.addActionListener(menu);
		sintomas.addActionListener(menu);
	}
	
	/**
	 * Método de ativação da ação nos botões presentes
	 * @param e evento de clique
	 * @param usuario 
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 *
	 */
	public void actionPerformed(ActionEvent e, Object usuario) {
		Object src = e.getSource();
		
		if(src == usuario){
			janela.dispose();
			new TelaListaUsuarios().mostrarDados(dados, 1);
			// chama a tela que lista os usuarios cadastrados
		}

		if(src == sintomas) {
			janela.dispose();
			new TelaDetalheSintoma().mostrarDados(dados);
			
		}	// chama a tela de escolha do tipo de 
	}
	@Override
	public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
		
		if(src == usuario){
			janela.dispose();
			new TelaListaUsuarios().mostrarDados(dados, 1);
			// chama a tela que lista os usuarios cadastrados
		}

		if(src == sintomas) {
			janela.dispose();
			new TelaDetalheSintoma().mostrarDados(dados);
			
		}	// chama a tela de escolha do tipo
		
	}
}
