package readingdifferentfileformats;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.NodeList;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
//Read ebay.xml file, and print to console

public class ReadingEbayXMLFile {
	public static final String delimiter = ",";
	public static final String new_line = "\n";
	public static final String Header = "seller_name,description";

	public static void main(String[] args) {

		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();

		try {

			DocumentBuilder builder = builderFactory.newDocumentBuilder();

			Document document = builder.parse(new File("E:\\workspace\\textfile\\ebay.xml"));

			List<EbayClass> list = new ArrayList<EbayClass>();

			NodeList nodes = document.getDocumentElement().getChildNodes();

			for (int i = 0; i < nodes.getLength(); i++) {
				Node node = nodes.item(i);

				if (node.getNodeType() == Node.ELEMENT_NODE) {
					Element element = (Element) node;

					String s = element.getElementsByTagName("seller_name").item(0).getTextContent();
					String d = element.getElementsByTagName("description").item(0).getChildNodes().item(0)
							.getNodeValue();
					EbayClass class1 = new EbayClass(s, d);
					list.add(class1);
				}
			}

			FileWriter writer = new FileWriter(new File("E:\\workspace\\textfile\\ebay.csv"));

			writer.append(Header);
			// writer.append(delimiter);
			writer.append(new_line);

			for (EbayClass class1 : list) {
				writer.append("\"" + class1.getSeller_name() + "\"");
				writer.append(delimiter);
				writer.append("\"" + class1.getDescription() + "\"");
				writer.append(new_line);

			}

			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
