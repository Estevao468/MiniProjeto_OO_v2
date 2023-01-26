package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import controle.*;

public class TelaMenu implements ActionListener {
	
	private static JFrame janela = new JFrame("Diario de Ciclo Menstrual");
	private static JLabel titulo = new JLabel("Menu Principal");
	private static JButton usuario = new JButton("Usuario");
	private static JButton sintomas = new JButton("Ciclo");
	public static ControleDados dados = new ControleDados();
	
	public TelaMenu() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(180, 80, 150, 150);
		sintomas.setBounds(280, 300, 100, 30);
		usuario.setBounds(100, 300, 100, 30);
		
		janela.setLayout(null);
		janela.add(BorderLayout.CENTER, titulo);
		janela.add(BorderLayout.WEST, usuario);
		janela.add(BorderLayout.EAST, sintomas);
		
		janela.add(titulo);
		janela.add(usuario);
		janela.add(sintomas);
		
		janela.setSize(500, 400);
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		TelaMenu menu = new TelaMenu();
		
		usuario.addActionListener(menu);
		sintomas.addActionListener(menu);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == usuario)
			new TelaFuncoes().mostrarDados(dados, 1);
		
		if(src == sintomas)
			new TelaFuncoes().mostrarDados(dados, 2);
		
	}
}