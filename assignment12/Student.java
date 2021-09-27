package ankit.assignment12;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

import static java.util.stream.Collectors.averagingInt;
import static java.util.stream.Collectors.averagingDouble;
import static java.util.stream.Collectors.groupingBy;

public class Student {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String engDepartment;
    private int year_of_enrollment;
    private double perTillDate;

    public Student(int id, String name, int age, String gender, String engDepartment, int year_of_enrollment, double perTillDate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.engDepartment = engDepartment;
        this.year_of_enrollment = year_of_enrollment;
        this.perTillDate = perTillDate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getEngDepartment() {
        return engDepartment;
    }

    public int getYear_of_enrollment() {
        return year_of_enrollment;
    }

    public double getPerTillDate() {
        return perTillDate;
    }

    @Override
    public String toString() {
        return "Student" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", engDepartment='" + engDepartment + '\'' +
                ", year_of_enrollment=" + year_of_enrollment +
                ", perTillDate=" + perTillDate +
                ' ';
    }

    public static void displayAllDepartments(List<Student> students){
        students.stream().map((student)->student.getEngDepartment()).distinct().forEach(System.out::println);
    }

    public static void displayStudentsEnrolledAfter2018(List<Student> students){
        students.stream().filter(student->student.getYear_of_enrollment()>2018).forEach(student-> System.out.println(student.getName()));
    }

    public static void displayMaleStudentsWithCS(List<Student> students){
        students.stream().filter(student->student.getEngDepartment().equals("Computer Science") && student.getGender().equals("Male")).forEach(System.out::println);
    }

    public static void displayNoOfMandF(List<Student> students){
        students.stream().collect(groupingBy(Student::getGender)).forEach((k,v)-> System.out.println("Count of "+k+" is "+v.size()));
    }

    public static void displayAverageAgeOfMandF(List<Student> students){
        students.stream().collect(groupingBy(Student::getGender,averagingInt(Student::getAge))).forEach((k,v)-> System.out.println("Average age of "+k+" is "+v));
    }

    public static void displayHighestStudent(List<Student> students){
        Student student=students.stream().min(Comparator.comparing(Student::getPerTillDate)).orElseThrow(NoSuchElementException::new);
        System.out.println(student);

    }

    public static void displayNoOfStudentsInEachDept(List<Student> students){
        students.stream().collect(groupingBy(Student::getEngDepartment)).forEach((k,v)-> System.out.println("Department name "+k+" has "+v.size()+" Students."));
    }

    public static void displayAverageInEachDept(List<Student> students){
        students.stream().collect(groupingBy(Student::getEngDepartment,averagingDouble(Student::getPerTillDate))).forEach((k,v)-> System.out.println("Department name "+k+" has average percentage "+v));
    }

    public static void displayYoungestMale(List<Student> students){
        Student youngestStudent=students.stream().filter(student->student.getEngDepartment().equals("Electronic") && student.getGender().equals("Male")).min(Comparator.comparingInt(Student::getAge)).orElseThrow(NoSuchElementException::new);
        System.out.println(youngestStudent);
    }

    public static void displayCountOfStudentInCS(List<Student> students){
        students.stream().filter(student->student.getEngDepartment().equals("Computer Science")).collect(groupingBy(Student::getGender)).forEach((k,v)-> System.out.println("No of "+k+" Students are: "+v.size()));
    }

}
