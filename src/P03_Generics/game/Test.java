package P03_Generics.game;

public class Test {
    public static void main(String[] args) {
        Scholar scholar1 = new Scholar("Ivan", 13);
        Scholar scholar2 = new Scholar("Mary", 15);

        Scholar scholar3 = new Scholar("Serge", 12);
        Scholar scholar4 = new Scholar("Helga", 15);

        Student student1 = new Student("Nick", 20);
        Student student2 = new Student("Xenia", 18);

        Employee employee1 = new Employee("Zaur", 32);
        Employee employee2 = new Employee("Mike", 47);

        Team<Scholar> scholarTeam = new Team<>("Dragons");
        scholarTeam.addNewParticipant(scholar1);
        scholarTeam.addNewParticipant(scholar2);

        Team<Scholar> scholarTeam2 = new Team<>("Thinker");
        scholarTeam2.addNewParticipant(scholar3);
        scholarTeam2.addNewParticipant(scholar4);

        Team<Student> studentTeam = new Team<>("Go");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        Team<Employee> employeeTeam = new Team<>("Employees");
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        scholarTeam.playWith(scholarTeam2);

    }
}
