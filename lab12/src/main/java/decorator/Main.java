package decorator;

public class Main {
    public static void main(String[] args) {
        Document document = new SmartDocument("gs://Users/kvitoslava/Documents/screenshots/Знімок екрана 2022-06-28 о 13.30.24.png");
        document = new TimedDocument(document);
//        document = new CashedDocument(document);
        System.out.println(document.parse());


    }
}
