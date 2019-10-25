package org.eclipse.main;

import java.util.concurrent.Semaphore;

import org.eclipse.model.MonCompteur;
import org.eclipse.thread.MonThread;
import org.eclipse.thread.TestThread;
import org.eclipse.thread.TonThread;

public class Test {

	public static void main(String[] args) {
		/*Compteur c1=new Compteur("C1");
		Compteur c2=new Compteur("C2");
		Compteur c3=new Compteur("C3");
		Compteur c4=new Compteur("C4");
		Compteur c5=new Compteur("C5");
		c1.start();
		c2.start();
		c3.start();
		c4.start();
		c5.start();*/
		testCompteur();
	}
	public static void testCompteur()
	{
		Semaphore sem= new Semaphore(1);
		MonCompteur TC = new MonCompteur();
		Thread t1 = new Thread(new TestThread(TC," t1 ",sem));
		Thread t2 = new Thread(new TestThread(TC," t2 ",sem));
		Thread t3 = new Thread(new TestThread(TC," t3 ",sem));
		t1.start();
		t2.start();
		t3.start();
	}

	public static void testThread() {
		// test avec heritage de la classe Thread
		MonThread A = new MonThread("A");
		MonThread B = new MonThread("B");
		MonThread C = new MonThread("C");
		A.start();
		System.out.println("A state : " + A.getState());
		A.interrupt();
		B.start();
		C.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("A state : " + A.getState());
		System.out.println(Thread.currentThread().getName() + " : j’ai fini");

	}

	public static void testRunnable() {
		// test avec une implementation de Runnable
		System.out.println("deuxieme test avec Runnable");
		Thread A = new Thread(new TonThread("A"));
		Thread B = new Thread(new TonThread("B"));
		Thread C = new Thread(new TonThread("C"));
		System.out.println(A.isAlive());
		A.start();
		System.out.println(A.isAlive());
		B.start();
		C.start();
		try {
			A.join();
			System.out.println(A.isAlive());
			B.join();
			C.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " : j’ai fini");

	}

	public static void testClasseAnonyme() {
		Thread thread = new Thread("A") {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 5; i++) {
					System.out.print(getName() + " ");
				}
			}
		};
		thread.start();
	}

	public static void testExpLambda() {
		System.out.println("avec expression lambda");
		Runnable runnable = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.print("A ");
			}
		};
		Thread thread1 = new Thread(runnable);
		thread1.start();
	}
}
