package org.ngomezg.student;

public class Student {
    private final Integer studentId;
    private final String studenName;

    public Student(Integer studentId, String studenName) {
        this.studentId = studentId;
        this.studenName = studenName;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public String getStudenName() {
        return studenName;
    }
}
