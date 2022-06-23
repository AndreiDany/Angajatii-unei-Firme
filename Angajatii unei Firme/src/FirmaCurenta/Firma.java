package FirmaCurenta;

import java.util.ArrayList;
import java.util.Iterator;

import LucruCuAngajati.Angajat;
import LucruCuAngajati.AngajatCuOra;
import LucruCuAngajati.AngajatCuSalarFix;

public class Firma {

	ArrayList<Angajat> angajati = new ArrayList<Angajat>();
	
	public boolean angajeaza(Angajat angajat) {
		
		boolean esteInFirma = false;
		
		Iterator<Angajat> it = angajati.iterator();
		
		while(it.hasNext())
		{
			if(angajat.equals(it.next())) {
				esteInFirma = true;
				System.out.println("Persoana " + angajat.getNume() + "este deja in firma!");
			}
		}
		if(esteInFirma == false) {
			angajati.add(angajat);
			return true;
		}

		return false;
	}
	
	public double salariuMediu() {
		
		double mediaSalariilor = 0;
		
		if(angajati.size() == 0)
			return mediaSalariilor;
		
		Iterator<Angajat> it = angajati.iterator();
		
		while(it.hasNext())
		{
			mediaSalariilor = mediaSalariilor + it.next().calculSalar();
		}
		
		mediaSalariilor = mediaSalariilor/angajati.size();
		
		return mediaSalariilor;
		
	}
	
	public static void main(String[] args) {
		
		Angajat a1 = new AngajatCuSalarFix("Pop Ion", 3000.0);
		Angajat a2 = new AngajatCuSalarFix("Pop Dani", 3000.0);
		Angajat a3 = new AngajatCuOra("Pop Raul", 160, 15.0);
		Angajat a4 = new AngajatCuOra("Pop Iosif", 160, 15.0);
		
		Firma firma = new Firma();
		
		firma.angajeaza(a1);
		firma.angajeaza(a2);
		firma.angajeaza(a3);
		firma.angajeaza(a4);
		
		System.out.println("Salariu mediu: " + firma.salariuMediu());
		
		// adaugarea unei persoane existente in firma
		firma.angajeaza(a1);
		
		((AngajatCuSalarFix)a1).schimbaSalarFix(2000.0);
		
		System.out.println("Salariu mediu: " + firma.salariuMediu());
	
	}

}
