package training.collections;

public class CEO implements Employee {
    private String name;
    private Integer id;

    public CEO(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void printEmployee() {
        System.out.println(id + " " + name);
    }
}
