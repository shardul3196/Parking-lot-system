package models;

public class Tickets {
    private String id;
    private Type type;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Tickets{" +
                "id='" + id + '\'' +
                '}';
    }
}
