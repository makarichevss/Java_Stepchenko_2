package lesson1.game;

public class Test {
	public static void main(String[] args) {
		Pupil pupil1 = new Pupil("Ivan", 13);
		Pupil pupil2 = new Pupil("Petr", 15);

		Student student1 = new Student("Oleg", 20);
		Student student2 = new Student("Mark", 21);

		Team<Pupil> pupilTeam = new Team<>("Dragons");
		pupilTeam.addNewParticipant(pupil1);
		Team<Pupil> pupilTeam2 = new Team<>("Dragons2");
		pupilTeam.addNewParticipant(pupil2);
		Team<Student> studentTeam = new Team<>("Wagons");
		studentTeam.addNewParticipant(student1);
		pupilTeam.playWith(pupilTeam2);
	}
}
