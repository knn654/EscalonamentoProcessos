package view;

import javax.swing.JOptionPane;

import br.com.kaua.filaObject.Fila;
import controller.EscalonadorController;
import model.Processo;

public class Principal {
	

	public static void main(String[] args) {
		Fila fila = new Fila();
		int opc = 0;
		do {
			Processo p = new Processo();
			p.Nome = JOptionPane.showInputDialog("Digite o nome do processo: ");
			p.QtdRetornos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de retornos: "));
			opc = Integer.parseInt(JOptionPane.showInputDialog("Quer continuar a adicionar processo? \n 1 - Sim \n 2 - Não"));
			fila.insert(p);
		} while (opc  != 2);
		
		EscalonadorController escCont = new EscalonadorController();
		escCont.checar(fila);
	}
}
