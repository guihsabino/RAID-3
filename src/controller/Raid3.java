package controller;

import java.util.concurrent.Semaphore;

public class Raid3 extends Thread {   
	private int idArquivo;
	private Semaphore semaforo;

	public Raid3(int idArquivo, int idDisco, Semaphore semaforo) {
		this.idArquivo = idArquivo;
		this.semaforo = semaforo;
	}

	@Override
	public void run() {
		arquivoAdicionado();
		try {
			semaforo.acquire();
		} catch (InterruptedException e) {

			e.printStackTrace();
		} finally {
			semaforo.release();
		}

	}

	private void arquivoAdicionado() {
		int tempo = 30;

			try {
				Thread.sleep(tempo);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			System.out.println("Arquivo #" + idArquivo + " foi para o disco: ");
		}
}