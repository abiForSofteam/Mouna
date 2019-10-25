package org.eclipse.exceptions;

public class AdresseException extends Exception {
	public AdresseException(String cp, String rue) {
		System.out.println("Le code postal '" + cp + "' doit contenir exactement 5 chiffres ");
		System.out.println("Le nom de la rue '" + rue + "' doit etre en majuscule ");
	}

	public AdresseException(int exp, String valeur) {
		if (exp == 1)
			System.out.println("Le code postal '" + valeur + "' doit contenir exactement 5 chiffres ");
		if (exp == 2)
			System.out.println("Le nom de la rue '" + valeur + "' doit etre en majuscule ");
	}
}
