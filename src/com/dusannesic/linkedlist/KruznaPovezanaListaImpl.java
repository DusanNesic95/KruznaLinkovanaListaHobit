package com.dusannesic.linkedlist;

public class KruznaPovezanaListaImpl implements KruznaPovezanaLista {

	private Element prviElement;
	
	public KruznaPovezanaListaImpl() {}
	
	public KruznaPovezanaListaImpl(Element prviElement) {
		this.prviElement = prviElement;
	}

	@Override
	public void dodajElement(Element novi) {
		Element trenutni = prviElement;
		
		if (trenutni.getSledeci() == null) {
			trenutni.setSledeci(prviElement);
		} else {
			while (trenutni.getSledeci() != prviElement) {
				trenutni = trenutni.getSledeci();
			}			
		}
		
		novi.setSledeci(prviElement);
		trenutni.setSledeci(novi);
	}

	@Override
	public void prikaziElemente() {
		Element trenutni = prviElement;
		
		System.out.println("Elementi liste su: ");
		
		//Regulisanje liste koja ima samo jedan element
		if (trenutni.getSledeci() == null) {
			System.out.println("Mesto: " + trenutni.getNazivDestinacije());
		} else {
			while (trenutni.getSledeci() != prviElement) {
				if (trenutni.getNazivDestinacije().equals("Okrug")) {
					System.out.println("Mesto: " + trenutni.getNazivDestinacije());
				} else {
					System.out.println(trenutni.toString());					
				}
				trenutni = trenutni.getSledeci();
			}
			System.out.println(trenutni.toString());
		}
	}

	public Element getPrviElement() {
		return prviElement;
	}

	public void setPrviElement(Element prviElement) {
		this.prviElement = prviElement;
	}

}
