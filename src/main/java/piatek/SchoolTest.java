package piatek;

public class SchoolTest {

    public static void main(String[] args) {
        School school = new School(3);
        try {
            school.add(new Student(1, "Jarek", "Seredyn"));
            school.add(new Student(2, "Marek", "Seredyn"));
            school.add(new Student(3, "Jacek", "Seredyn"));
//            school.add(new Student(4,"Adam","Seredyn"));
        } catch (NoMoreSpaceException e) {
            System.err.println("Nie można dodać tylu osób do szkoły");
            System.err.println(e.getMessage());
        }

        try {
            System.out.println(school.find("Jarek", "Seredyn"));
            System.out.println(school.find("Maciej", "Seredyn"));
        } catch (NoElementFoundException e) {
            System.err.println("Nie znaleziono osoby...");
            System.err.println(e.getMessage());
        }

    }
}
