package training.collections;

import java.util.List;
import java.util.ArrayList;

public class Company implements Employee {
    private List<Employee> employeeList = new ArrayList<Employee>();

    @Override
    public void printEmployee() {
        for (Employee com : employeeList){
            com.printEmployee();
        }
    }

    public void addEmployee(Employee com){
        employeeList.add(com);
    }

    public void removeEmployee(Employee com){
        employeeList.remove(com);
    }
}
