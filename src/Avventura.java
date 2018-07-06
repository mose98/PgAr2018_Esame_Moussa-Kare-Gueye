import it.unibs.fp.mylib.InputDati;

public class Avventura {
	public static void main(String[] args) {
		int num=0, n=0;
		String titolo = null;
		
		Paragrafo par = new Paragrafo();
		StoriaGrafo storyMap=new StoriaGrafo(titolo, n);
		titolo=InputDati.leggiStringa("Inserisci il titolo della tua storia ");
		n=InputDati.leggiIntero("Quanti paragrafi vuoi inserire? ");
		for(int i=0;i<n;i++) {
			par.scriviParagrafo(num);
		}
		
		System.out.println("Ora inserisci i collegamenti ");
		
		
		
		
		
		
		
		
	}
}
