package training.collections;

public class Manager implements Employee {
    private String name;
    private Integer id;

    public Manager(Integer id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public void printEmployee() {
        System.out.println(id + " " + name);
    }
}
