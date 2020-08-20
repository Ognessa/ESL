package carrira.elan.englishslanglist;

public class Product {
    public String name;
    public String expl;

    public Product(String name, String expl) {
        super();
        this.name = name;
        this.expl = expl;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getExplanation() {
        return expl;
    }
    public void setExplanation(String expl) {
        this.expl = expl;
    }
}
