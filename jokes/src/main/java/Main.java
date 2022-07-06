import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import javax.swing.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //ChuckNorrisQuotes random = new ChuckNorrisQuotes();
        //JOptionPane.showMessageDialog(null, random.getRandomQuote());

        Document document = Jsoup
                .connect("https://pogoda.onet.pl/prognoza-pogody/krakow-306020").get();
        System.out.println(document.getElementsByClass("temp").get(0).text());
    }
}
