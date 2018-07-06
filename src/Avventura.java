import it.unibs.fp.mylib.InputDati;

public class Avventura {
	public static void main(String[] args) {
		int num=0, n=0;
		Paragrafo par = new Paragrafo();
		n=InputDati.leggiIntero("Quanti paragrafi vuoi inserire? ");
		for(int i=0;i<n;i++) {
			par.scriviParagrafo(num);
		}
		
		
		
		
		
		
	}
}
