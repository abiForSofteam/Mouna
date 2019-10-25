package org.eclipse.thread;

public class Compteur extends Thread {
	private static int ordre = 1;
public Compteur(String name) {
	super(name);
	// TODO Auto-generated constructor stub
}
@Override
public void run() {
	int i;
	for (i = 1; i <= 7; i++) {
		System.out.println(this.getName() + " iteration "+i);
		try {
			Thread.sleep((long) (Math.random() * 3000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		System.out.println(this.getName()+" a fini de compter à la position "+ordre++);
}
}
