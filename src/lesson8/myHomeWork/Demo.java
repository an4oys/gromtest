package lesson8.myHomeWork;

import java.util.Date;

public class Demo {
    Student createHighestParent() {
        Course[] coursesTaken = new Course[]{new Course(new Date(), "Name", 10, "TeacherName", new Student[]{})};
        return new Student("FirstName", "LastName", 20, coursesTaken);
    }

    SpecialStudent createLowestChild() {
        Course[] coursesTaken = new Course[]{new Course(new Date(), "Name", 5, "TeacherName", new Student[]{})};
        return new SpecialStudent("Name", "LastName", 100, coursesTaken, 1001, "email");
    }
}
