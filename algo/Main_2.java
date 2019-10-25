package org.eclipse.test;

import org.eclipse.model.Adresse;
import org.eclipse.model.Enseignant;
import org.eclipse.model.Etudiant;
import org.eclipse.model.Personne;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adresse adr=new Adresse("kleber","paris","75016");
		Personne p=new Personne(1,"wick","john",adr);
		System.out.println(p);
		
		Enseignant enseignant1 = new Enseignant(3,"green","jonas",1700);
		Enseignant enseignant2 = new Enseignant(4,"wick","jonas",1800);
		Etudiant etudiant1 = new Etudiant(5,"green","john",2);
		Etudiant etudiant2 = new Etudiant(6,"green","james",3);
		Personne [] personnes= {enseignant1,enseignant2,etudiant1,etudiant2};
		for(Personne perso : personnes) {
			System.out.println(perso.afficherDetail());
			}
	}

}
