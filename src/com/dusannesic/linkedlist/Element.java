package com.dusannesic.linkedlist;

public class Element {

	private String nazivDestinacije;
	private int daljina;
	private Element sledeci;
	
	private Element() {}

	private Element(String nazivDestinacije, int daljina) {
		this.nazivDestinacije = nazivDestinacije;
		this.daljina = daljina;
		this.sledeci = null;
	}

	public static Element kreirajElement(String nazivDestinacije, int daljina) {
		if (daljina > 100) {
			throw new RuntimeException("Ne mozete uneti udaljenost vecu od 100!");
		} else {
			return new Element(nazivDestinacije, daljina);
		}
	}
	
	public String getNazivDestinacije() {
		return nazivDestinacije;
	}

	public void setNazivDestinacije(String nazivDestinacije) {
		this.nazivDestinacije = nazivDestinacije;
	}

	public int getDaljina() {
		return daljina;
	}

	public void setDaljina(int daljina) {
		this.daljina = daljina;
	}

	public Element getSledeci() {
		return sledeci;
	}

	public void setSledeci(Element sledeci) {
		this.sledeci = sledeci;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + daljina;
		result = prime * result + ((nazivDestinacije == null) ? 0 : nazivDestinacije.hashCode());
		result = prime * result + ((sledeci == null) ? 0 : sledeci.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Element other = (Element) obj;
		if (daljina != other.daljina)
			return false;
		if (nazivDestinacije == null) {
			if (other.nazivDestinacije != null)
				return false;
		} else if (!nazivDestinacije.equals(other.nazivDestinacije))
			return false;
		if (sledeci == null) {
			if (other.sledeci != null)
				return false;
		} else if (!sledeci.equals(other.sledeci))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Mesto: " + nazivDestinacije + ", udaljeno od prethodnog za: " + daljina;
	}
	
}
