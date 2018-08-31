package view;

import java.util.concurrent.Semaphore;

import controller.Raid3;

public class Principal {

	public static void main(String[] args) {
			int permissoes = 3;
			int totalArquivos = 13;
			int totalDiscos = 4;
			Semaphore semaforo = new Semaphore(permissoes);
			for (int i = 0; i < totalArquivos; i++) {
				Raid3 t = new Raid3(i, i, semaforo);
				t.start();

			}

		}
		
}
