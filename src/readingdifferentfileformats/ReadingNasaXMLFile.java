package readingdifferentfileformats;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ReadingNasaXMLFile {

	public static void main(String[] args) {
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();

		try {

			DocumentBuilder builder = builderFactory.newDocumentBuilder();

			org.w3c.dom.Document document = builder.parse(new File("E:/workspace/textfile/nasa.xml"));

			org.w3c.dom.Element element = (document).getDocumentElement();

//			NodeList nodes = ((Node) element).getChildNodes();
			
			NodeList nodes = element.getChildNodes();

			for (int i = 0; i < nodes.getLength(); i++) {
				System.out.println("" + nodes.item(i).getTextContent());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
