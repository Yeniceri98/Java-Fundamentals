package sections.sec67_XML_Parsing_With_DOM;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class DOMParser {
    public static void main(String[] args) {
        try {
            // Parse the XML File
            File file = new File("sections/sec67_XML_Parsing_With_DOM/example.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(file);

            // Get the root element
            Element root = document.getDocumentElement();
            System.out.println("Root element: " + root.getNodeName());

            // Get a list of all elements with the tag name "book"
            NodeList nodeList = root.getElementsByTagName("book");

            // Iterate through the list and print the content of each item
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;

                    String id = element.getAttribute("id");
                    String title = element.getElementsByTagName("title").item(0).getTextContent();
                    String price = element.getElementsByTagName("author").item(0).getTextContent();
                    String description = element.getElementsByTagName("year").item(0).getTextContent();

                    System.out.println("ID: " + id);
                    System.out.println("Title: " + title);
                    System.out.println("Author: " + price);
                    System.out.println("Year: " + description);
                    System.out.println();
                }
            }

            // Find By Id
            Element foundBook = findBookById(document, "2");
            if (foundBook != null) {
                System.out.println("Found Book By Id: " + foundBook.getElementsByTagName("title").item(0).getTextContent());
            }

            // Update Element
            updateBookYear(document, "1", "2020");

            // Add New Element
            addNewBook(document, root, "3", "Improbable", "Adam Fawer", "2005");

            // Remove Element
            Element bookToDelete = (Element) document.getElementsByTagName("book").item(2);
            root.removeChild(bookToDelete);

            // Save changes to XML
            saveXMLChanges(document, file);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Element findBookById(Document document, String bookId) {
        NodeList nodeList = document.getElementsByTagName("book");

        for (int i = 0; i < nodeList.getLength(); i++) {
            Element book = (Element) nodeList.item(i);

            if (book.getAttribute("id").equals(bookId)) {
                return book;
            }
        }

        return null;
    }

    private static void updateBookYear(Document document, String bookId, String newYear) {
        Element book = findBookById(document, bookId);

        if (book != null) {
            System.out.println("Before: " + book.getElementsByTagName("year").item(0).getTextContent());
            book.getElementsByTagName("year").item(0).setTextContent(newYear);      // Update
            System.out.println("Now: " + newYear);
        } else {
            System.out.println("Book not found");
        }
    }

    private static void addNewBook(Document document, Element root, String id, String title, String author, String year) {
        Element newBook = document.createElement("book");
        newBook.setAttribute("id", id);

        Element titleElement = document.createElement("title");
        titleElement.setTextContent(title);

        Element authorElement = document.createElement("author");
        authorElement.setTextContent(author);

        Element yearElement = document.createElement("year");
        yearElement.setTextContent(year);

        newBook.appendChild(titleElement);
        newBook.appendChild(authorElement);
        newBook.appendChild(yearElement);

        root.appendChild(newBook);

        System.out.println("New Book Added: " + title + " - " + author + " - " + year);
    }

    private static void saveXMLChanges(Document document, File file) {
        try {
            // Normalize the document (helps to keep consistent structure)
            document.getDocumentElement().normalize();

            // Remove unnecessary whitespace nodes
            stripWhitespaceNodes(document.getDocumentElement());

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4"); // Optional: Set indentation size

            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(file);

            transformer.transform(source, result);
            System.out.println("XML file updated successfully!");
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }

    // Recursively removes whitespace-only text nodes
    private static void stripWhitespaceNodes(Node node) {
        NodeList children = node.getChildNodes();
        for (int i = children.getLength() - 1; i >= 0; i--) {
            Node child = children.item(i);
            if (child.getNodeType() == Node.TEXT_NODE && child.getTextContent().trim().isEmpty()) {
                node.removeChild(child);
            } else if (child.getNodeType() == Node.ELEMENT_NODE) {
                stripWhitespaceNodes(child);
            }
        }
    }
}

/*
    DOM (Document Object Model), bir XML veya HTML belgesinin bir ağaç yapısında temsil edilmesi için standart bir API'dir
    DOM, belgenin her bir öğesini bir nesne olarak temsil eder ve bu nesneler arasındaki ilişkileri belirtir

    DocumentBuilderFactory ile XML dosyasını parse edip bir Document nesnesi oluşturulur
    getDocumentElement() ile kök eleman alınır
    getElementsByTagName() ile belirli bir etikete sahip tüm düğümler alınıp işlenir
    getAttribute("id") ile XML elementinin attribute değerleri çekilir
    getTextContent() ile belirli bir elementin içeriği okunur
*/
