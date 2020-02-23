package training.collections;

public class Runner {
    public static void main(String[] args) {
    CEO yury = new CEO(3, "Yury");
    CEO vlad = new CEO(2, "Vladislav");
    Company team = new Company();
    team.addEmployee(yury);
    team.addEmployee(vlad);

    Manager alice = new Manager(5,"Alice");
    Manager maria = new Manager(4, "Mary");
    Company secondTeam = new Company();
    secondTeam.addEmployee(alice);
    secondTeam.addEmployee(maria);

    Company combineTeam = new Company();
    combineTeam.addEmployee(team);
    combineTeam.addEmployee(secondTeam);
    combineTeam.printEmployee();
    }
}
