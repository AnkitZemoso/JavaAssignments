package ankit.assignment12;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        students.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        students.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        students.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        students.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        students.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        students.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        students.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        students.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        students.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        students.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        students.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        students.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        students.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        students.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        students.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
        students.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));

        System.out.println("1. Printing the name of all Departments in the college.");
        Student.displayAllDepartments(students);
        System.out.println();

        System.out.println("2. Printing the names of all students who have enrolled after 2018");
        Student.displayStudentsEnrolledAfter2018(students);
        System.out.println();

        System.out.println("3. Printing the details of all male student in the computer sci department");
        Student.displayMaleStudentsWithCS(students);
        System.out.println();

        System.out.println("4. Printing the no. of Males and females Students.");
        Student.displayNoOfMandF(students);
        System.out.println();

        System.out.println("5. Printing the average age of male and female students.");
        Student.displayAverageAgeOfMandF(students);
        System.out.println();

        System.out.println("6. Printing the details of highest student having highest percentage");
        Student.displayHighestStudent(students);
        System.out.println();

        System.out.println("7. Printing the number of students in each department.");
        Student.displayNoOfStudentsInEachDept(students);
        System.out.println();

        System.out.println("8. Printing the average percentage achieved in each department");
        Student.displayAverageInEachDept(students);
        System.out.println();

        System.out.println("9. Printing the details of youngest male student in the Electronic department");
        Student.displayYoungestMale(students);
        System.out.println();

        System.out.println("10. Printing the count of male and female students in the computer science department.");
        Student.displayCountOfStudentInCS(students);
        System.out.println();


    }
}
