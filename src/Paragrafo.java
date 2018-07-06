import java.util.ArrayList;
import java.util.Map;

import it.unibs.fp.mylib.*;

public class Paragrafo {
	
	private int ID;
	private String descrizione;
	private int numDomande;
	private String domanda;
	private Map<Integer, Integer> IDdomanda;
	private ArrayList<String> listaDomande= new ArrayList<String> ();
	private static final String MSG_INS_DESCR="Inserisci la descrizione del paragrafo ";
	private static final String MSG_INS_DOMANDA="Inserisci la descrizione del paragrafo ";
	

	public Paragrafo(int ID, String descrizione, int numDomande) {
		this.ID = ID;
		this.descrizione=descrizione;
		this.numDomande=numDomande;
	}
	
	public Paragrafo() {
		ID=0;
		descrizione=null;
		numDomande=0;
		domanda=null;
	}
	
	public String scriviDescrizione() {
		descrizione= InputDati.leggiStringa(MSG_INS_DESCR);
		return descrizione;
		
	}
	
	public String scriviDomanda() {
		domanda=InputDati.leggiStringa(MSG_INS_DOMANDA);
		return domanda;
	}


	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public String getDescrizione() {
		return descrizione;
	}


	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}


	public int getNumDomande() {
		return numDomande;
	}


	public void setNumDomande(int numDomande) {
		this.numDomande = numDomande;
	}


	public Map<Integer, String> getDomanda() {
		return domanda;
	}


	public void setDomanda(Map<Integer, String> domanda) {
		this.domanda = domanda;
	}
	

	

}
