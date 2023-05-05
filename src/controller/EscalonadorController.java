package controller;

import br.com.kaua.filaObject.Fila;

import model.Processo;
public class EscalonadorController {
	
	public EscalonadorController() {
		super();
	}

	public void checar(Fila fila) {
		while (!fila.isEmpty()) {
			try {
				Processo p = (Processo) fila.remove();
				if (p.QtdRetornos > 1) {
					do {
						p.QtdRetornos = p.QtdRetornos - 1;
					} while (p.QtdRetornos > 1);
					fila.insert(p);
					System.out.println(p.Nome + " - " + p.QtdRetornos);
				} else {
					System.out.println(p.Nome + " - " + p.QtdRetornos);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
