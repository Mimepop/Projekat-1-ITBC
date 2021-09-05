import java.util.UUID;

public abstract class Grocery implements Energy {
    private String company;
    private String name;
    private UUID id;

    public Grocery(String name) {
        this.name = name;

    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public Grocery(String name, String company) {
        this.company = company;
        this.name = name;
        this.id=UUID.randomUUID();
    }

    public String getName() {
        return name;
    }

    public UUID getId() {
        return id;
    }

    public boolean equals(Grocery o) {
        return company.equals( o.company) && name.equals(o.name);

    }
}
