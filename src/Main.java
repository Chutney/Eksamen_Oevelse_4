public class Main {
    public static void main(String[] args) {

        Keyword kw = new Keyword("Potato", "This is a potato that grows in the dirt");

        kw.addReferingKeyword("Beetroot");
        kw.addReferingKeyword("Carrot");

        System.out.println(kw.toString());


    }
}