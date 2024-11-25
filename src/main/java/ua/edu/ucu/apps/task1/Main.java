package ua.edu.ucu.apps.task1;

public class Main {
    public static void main(String[] args) {
        Student student = Student.builder()
                                 .firstName("Dmytro")
                                 .lastName("Malyk")
                                 .mark(2)
                                 .build();
        System.out.println(student);
    }
}
