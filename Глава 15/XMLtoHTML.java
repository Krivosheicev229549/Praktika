/*
Кривошейцев Михаил Б763-2
Вариант А
11.  Туристические путевки.
Туристические путевки, предлагаемые агентством, имеют следующие характеристики:
— Type — тип (выходного дня, экскурсионная, отдых, паломничество и т.д.);
— Country — страна, выбранная для путешествия;
— Number days/nights — количество дней и ночей;
— Тransport — вид перевозки туристов (авиа, ж/д, авто, лайнер);
— Hotel characteristic (должно быть несколько) — количество звезд, включено ли питание и какое (HB, BB, Al), какой номер (1-, 2-, 3-местные),
есть ли телевизор, кондиционер и т.д.;
— Сost — стоимость путевки (сколько и что включено).
Корневой элемент назвать Тourist voucher.
С помощью XSL преобразовать XML-файл в формат HTML, c выводом
информации в табличном виде.
*/

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
