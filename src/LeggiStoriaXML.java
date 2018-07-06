import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class LeggiStoriaXML {
	public static void main(String[] args) {
		int numeroParagrafi=0;
		int ID;
		String option;
		ArrayList<Paragrafo> listaParagrafi=new ArrayList<Paragrafo>();
		try {
			 	 
			XMLInputFactory xmlif = XMLInputFactory.newInstance();
			XMLStreamReader xmlr = xmlif.createXMLStreamReader("PgAr2018_Story_2.1.xml",
					new FileInputStream("PgAr2018_Story_2.1.xml"));
			while (xmlr.hasNext()) {
				switch (xmlr.getEventType()) {
				case XMLStreamConstants.START_ELEMENT: {
					
					if(xmlr.getLocalName().equals("paragraph")) {
					
						ID=Integer.valueOf(xmlr.getAttributeValue(0));
						System.out.println(ID);
						numeroParagrafi++;
						
					}
					if(xmlr.getLocalName().equals("option")) {
						option=xmlr.getAttributeValue(0);
						
					}
					
				}
				default:
					break;
				}
				xmlr.next();
			}

		} catch (Exception e) {
			System.out.println("Errore nell'apertura del file");
		}

	}
}
