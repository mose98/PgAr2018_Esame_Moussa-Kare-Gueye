import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Node;


public class LeggiStoriaXML {
	public static void main(String[] args) {
		int numeroParagrafi = 0;
		ArrayList<Paragrafo> listaParagrafi = new ArrayList<Paragrafo>();
		try {
			File filename = new File("PgAr2018_Story_2.1.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(filename);

			Node root = doc.getFirstChild();

			for (int i = 0; i < root.getChildNodes().getLength(); i++) {
				Node paragrafo = root.getChildNodes().item(i);

				for (int j = 0; j < paragrafo.getChildNodes().getLength(); j++) {
					Node element = paragrafo.getChildNodes().item(j);
					if (element.getNodeType() == Node.ELEMENT_NODE) {
						System.out.println(element.getNodeName() + " " + element.getTextContent());
						if (element.hasAttributes()) {
							for (int k = 0; k < element.getAttributes().getLength(); k++) {

								Node attribute = element.getAttributes().item(k);
								System.out.println(attribute.getNodeName() + " " + attribute.getTextContent());
							}
						}
					}
				}
			}

		} catch (Exception e) {
			System.out.println("Errore nell'apertura del file");
		}

	}
}
