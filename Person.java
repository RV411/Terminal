
class Person {
    private String name;
    private Integer operations;

    public Person(String name, Integer operations) {
        this.name = name;
        this.operations = operations;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getoperations() {
        return operations;
    }

    public void setoperations(Integer operations) {
        this.operations = operations;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", operations=" + operations +
                '}';
    }
}
