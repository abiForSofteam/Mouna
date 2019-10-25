package org.eclipse.thread;

import java.util.concurrent.Semaphore;

import org.eclipse.model.MonCompteur;

public class TestThread implements Runnable {
	MonCompteur TC;
	private String name;
	private Semaphore sem;

	// non thread safe
	/*
	 * public void run() { try { for (int i = 0; i < 3; i++) { if (TC.getCompteur()
	 * > 0) { TC.decrementerCompteur(); System.out.println("Opération réussie " +
	 * TC.getCompteur() + " demandée par " + name); Thread.sleep(500); } else
	 * System.out.println("échec " + TC.getCompteur() + " demandée par " + name); }
	 * } catch (InterruptedException e) { System.out.println(e.getMessage()); } }
	 */
	// synchronized
	/*
	 * public void run() { try { for (int i = 0; i < 3; i++) { synchronized (TC) {
	 * if (TC.getCompteur() > 0) { TC.decrementerCompteur();
	 * System.out.println("Opération réussie " + TC.getCompteur() + " demandée par "
	 * + name); Thread.sleep(500); } else System.out.println("échec " +
	 * TC.getCompteur() + " demandée par " + name); } } } catch
	 * (InterruptedException e) { System.out.println(e.getMessage()); } }
	 */
//semaphore
	public void run() {
		try {
			for (int i = 0; i < 3; i++) {
				sem.acquire();
				if (TC.getCompteur() > 0) {
					TC.decrementerCompteur();
					System.out.println("Operation reussie " + TC.getCompteur() + " demandee par " + name);
					Thread.sleep(500);
				} else
					System.out.println("Echec " + TC.getCompteur() + " demandee par " + name);
				sem.release();
			}
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}

	public TestThread(MonCompteur tC, String name) {
		super();
		TC = tC;
		this.name = name;
	}

	public TestThread(MonCompteur tC, String name, Semaphore sem) {
		super();
		TC = tC;
		this.name = name;
		this.sem = sem;
	}

}