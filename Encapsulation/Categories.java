package Encapsulation;

public class Categories {
    private int id;
    private String name;
    private boolean expensive;
    
    public Categories(int id, String name, boolean expensive) {
        this.id = id;
        this.name = name;
        this.expensive = expensive;
    }

    public Categories() {
        super();
    }

    public boolean isExpensive() {
        return this.expensive;
    }

    public void setExpensive(boolean expensive) {
        this.expensive = expensive;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() { 
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
