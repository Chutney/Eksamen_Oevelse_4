import java.util.ArrayList;

public class Keyword {

    private String name;
    private String desc;
    private ArrayList<String> seeAlso;

    public Keyword(String name, String desc) {
        this.name = name;
        this.desc = desc;
        seeAlso = new ArrayList<>();
    }

    public void addReferingKeyword(String x) {
        seeAlso.add(x);
    }

    @Override
    public String toString() {
        StringBuilder keywordValues = new StringBuilder();
        keywordValues.append("Name: " + name + "\n");
        keywordValues.append("Description: " + desc + "\n");
        keywordValues.append("See also: " + "\n");

        for (int i = 0; i < seeAlso.size(); i++) {
            keywordValues.append((i+1) + ": " + seeAlso.get(i) + "\n");
        }

        return keywordValues.toString();

    }

}
