package org.eclipse.model;

import org.eclipse.exceptions.AdresseException;
import org.eclipse.exceptions.IncorrectCodePostalException;
import org.eclipse.exceptions.IncorrectStreetNameException;

public class Adresse {
	private String rue;
	private String ville;
	private String codePostal;

	public Adresse(String rue, String ville, String codePostal) throws AdresseException {
		// if (!rue.equals(rue.toUpperCase()) || codePostal.length() != 5)
		// throw new AdresseException(codePostal,rue);

		if (codePostal.length() != 5 && !rue.equals(rue.toUpperCase())) {
			throw new AdresseException(codePostal, rue);
		} else {
			if (codePostal.length() != 5) {
				throw new AdresseException(1, codePostal);
			}
			if (!rue.equals(rue.toUpperCase())) {
				throw new AdresseException(2, rue);
			}
		}

		this.rue = rue;
		this.ville = ville;
		this.codePostal = codePostal;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) throws IncorrectStreetNameException {
		if (!rue.equals(rue.toUpperCase()))
			throw new IncorrectStreetNameException(rue);
		this.rue = rue;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) throws IncorrectCodePostalException {
		if (codePostal.length() != 5)
			throw new IncorrectCodePostalException(codePostal);
		this.codePostal = codePostal;
	}

	@Override
	public String toString() {
		return "Adresse [rue=" + rue + ", ville=" + ville + ", codePostal=" + codePostal + "]";
	}

}
