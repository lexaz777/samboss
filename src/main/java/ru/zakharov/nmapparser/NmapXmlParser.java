package ru.zakharov.nmapparser;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.StringReader;

public class NmapXmlParser {
    private static final String FILENAME = "D:\\geekuniversity\\samboss\\scanresults.xml";
//    public static void main(String[] args) {
////        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
////        try {
////            DocumentBuilder db = dbf.newDocumentBuilder();
////            Document doc = db.parse(FILENAME);
////            doc.getDocumentElement().normalize();
////            if (doc.hasChildNodes()) {
////                printNodes(doc.getChildNodes());
////            }
////        } catch (ParserConfigurationException | SAXException | IOException e) {
////            e.printStackTrace();
////        }
//
//
//    }
//
////    private static void printNodes(NodeList nodeList) {
////        for (int i = 0; i < nodeList.getLength(); i++) {
////            Node node = nodeList.item(i);
////            if (Node.ELEMENT_NODE == node.getNodeType()) {
////
////                // Печатаем имя ноды и значение
////                System.out.println();
////                System.out.print("Имя ноды: " + node.getNodeName());
////                System.out.println(" --- Значение ноды: "
////                        + node.getTextContent());
////
////                if (node.hasAttributes()) {
////                    // Есть атрибуты: печатаем и их
////                    NamedNodeMap attributes = node.getAttributes();
////                    for (int j = 0; j < attributes.getLength(); j++) {
////                        Node attribute = attributes.item(j);
////                        System.out.print("Имя атрибута: "
////                                + attribute.getNodeName());
////                        System.out.println(" --- Значение атрибута: "
////                                + attribute.getNodeValue());
////                    }
////                }
////
////                if (node.hasChildNodes()) {
////                    // Есть дочерние ноды: печатаем их
////                    printNodes(node.getChildNodes());
////                }
////            }
////        }
////    }

    private String xmlData = "";

    public String getXmlData() {
        return xmlData;
    }

    public void setXmlData(String xmlData) {
        this.xmlData = xmlData;
    }

    public Nmaprun convert() throws JAXBException {
        StringReader reader = new StringReader(xmlData);
        JAXBContext context = JAXBContext.newInstance(Nmaprun.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Nmaprun nmaprun = (Nmaprun) unmarshaller.unmarshal(reader);
        return nmaprun;
    }


}
