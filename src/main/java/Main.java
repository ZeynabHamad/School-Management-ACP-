package main.java;

import main.java.model.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //LoginView start= new LoginView();
        //start.login();

        Staff staff1 = new Staff(1, "biner", "male", "22-2-2222", "biner@biner.com", "halabja", "07501111111", StaffRole.TEACHER, 9000000, "password");
        Student stu1 = new Student(1, "hama", "male", "22-2-2222", "hama@hama.com", "halabja", "07502222222", 1);

        Grade cls1 = new Grade(1, "first", 2000);
        Subject sub1 = new Subject(1, "math" , 1);
        Exam exm = new Exam(1, 1 , "informatics", "22-2-2022");
        Set<String> set = new HashSet<>(Arrays.asList("math","english","kurdish"));
        TimeTable tbl = new TimeTable(1,set,"08:00");

        ExamGrade eg = new ExamGrade(1, 1, 78, 1);

        StudentPayment pm = new StudentPayment(1, 1, 80000, "22-2-2022");
        StudentPayment pm1 = new StudentPayment(2, 2, 80000, "22-2-2021");
        StaffPayment sp = new StaffPayment(1, 1, 120000, "22-2-2022");

        StudentAttendance sa = new StudentAttendance(1, 1, "1-1-2021" , "present");

        StaffAttendance stfa = new StaffAttendance(1, 1,"2-2-2022", "absent");

        ArrayList<StudentPayment> ls = new ArrayList<>(Arrays.asList(pm,pm1));

        System.out.println(stu1.getGradeId());
    }

}
