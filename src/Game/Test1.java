package Game;

public class Test1 {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Dima", 14);
        Schoolar schoolar2 = new Schoolar("Mawa", 12);
        Schoolar schoolar3=new Schoolar("Sawa",11);
        Schoolar schoolar4=new Schoolar("Polya",13);

        Students student1 = new Students("Olqa", 19);
        Students student2 = new Students("Kolya", 20);

        Employee employee1 = new Employee("Sergey", 33);
        Employee employee2 = new Employee("Aleksey", 45);

        Team<Schoolar> schoolarTeam=new Team("Dragons");
        Team<Schoolar> schoolarTeam2=new Team("Godzilla");


        Team<Students> studentTeam=new Team<>("Vunderkindi");
        Team<Employee> employeeTeam=new Team<>("Rabotyagi");
        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);
        System.out.println("-------------");
        schoolarTeam2.addNewParticipant(schoolar3);
        schoolarTeam2.addNewParticipant(schoolar4);
        System.out.println("------------------");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);
        System.out.println("------------------");
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);
        System.out.println("------------------");
        schoolarTeam.playWith(schoolarTeam2);

    }
}
