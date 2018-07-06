import java.util.ArrayList;
import java.util.Map;

import it.unibs.fp.mylib.*;

public class Paragrafo {

	private int ID;
	private String descrizione;
	private int numDomande;
	private ArrayList<String> domande = new ArrayList<String>();
	private ArrayList<Paragrafo> paragrafo= new ArrayList<Paragrafo>();
	private String domanda;
	private static final String MSG_INS_DESCR = "Inserisci la descrizione del paragrafo ";
	private static final String MSG_INS_DOMANDA = "Inserisci la domanda ";

	public Paragrafo(int ID, String descrizione, ArrayList<String> domande) {
		this.ID = ID;
		this.descrizione = descrizione;
		this.domande = domande;
	}

	public ArrayList<String> getDomande() {
		return domande;
	}

	public void setDomande(ArrayList<String> domande) {
		this.domande = domande;
	}

	public Paragrafo() {

	}

	/**
	 * 
	 * @param num
	 * @return ritorna un oggetto paragrafo completato con la descrizione e la domanda
	 */
	public Paragrafo scriviParagrafo(int num) {
		Paragrafo par = new Paragrafo();
		par.scriviDescrizione();
		int n = InputDati.leggiIntero("Quante domande vuoi inserire: ");
		for (int j = 0; j < n; j++) {
			par.scriviDomanda();
			domande.add(j, domanda);
		}
		paragrafo.add(par);
		return par;

	}

	public String scriviDescrizione() {
		descrizione = InputDati.leggiStringa(MSG_INS_DESCR);

		return descrizione;

	}

	public ArrayList<String> scriviDomanda() {

		domanda = InputDati.leggiStringa(MSG_INS_DOMANDA);
		return domande;
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

	// public Map<Integer, String> getDomanda() {
	// return domande;
	// }
	//
	// public void setDomanda(Map<Integer, String> domanda) {
	// this.domanda = domanda;
	// }

}
