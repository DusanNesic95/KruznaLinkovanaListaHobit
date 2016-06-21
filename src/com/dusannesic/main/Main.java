package com.dusannesic.main;

import com.dusannesic.linkedlist.Element;
import com.dusannesic.linkedlist.KruznaPovezanaListaImpl;

public class Main {

	public static void main(String[] args) {
		Element prviElement = Element.kreirajElement("Okrug", 0);
		
		KruznaPovezanaListaImpl lista = new KruznaPovezanaListaImpl(prviElement);
		
//		lista.prikaziElemente();
		
		lista.dodajElement(Element.kreirajElement("Mount Doom", 50));
		lista.dodajElement(Element.kreirajElement("Morgul layar", 60));
		lista.dodajElement(Element.kreirajElement("Darnei cave", 27));
//		lista.dodajElement(new Element("Twin tower", 120, null));
		
		lista.prikaziElemente();
	}
	
}
