import java.io.File;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class XMLtoHTML {

    public static void main(String[] args) {
        try {
            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer transformer = factory.newTransformer(new StreamSource(new File("2.xsl")));
            transformer.transform(new StreamSource(new File("1.xml")), new StreamResult(new File("3.html")));
            System.out.println("HTML-вывод успешно сгенерирован.");
        } catch (Exception e) {
            System.err.println("Ошибка преобразования XML в HTML: " + e.getMessage());
        }
    }

}