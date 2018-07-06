import it.unibs.fp.mylib.InputDati;

public class Avventura {
	public static void main(String[] args) {
		int n=0;
		Paragrafo par = new Paragrafo();
		n=InputDati.leggiIntero("Quante opzioni vuoi inserire? ");
		par.scriviDomanda(n);
		
		
		
	}
}
