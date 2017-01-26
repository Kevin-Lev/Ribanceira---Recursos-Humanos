/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import model.Student;

/**
 *
 * @author yukio
 */
public class StudentBean implements Serializable {

    private List<Student> students;

    public StudentBean() {
    }

    public List<Student> getStudents() {
        if (students == null || students.isEmpty()) {
            students = Arrays.asList(
                    new Student("Kikusan", 50),
                    new Student("Yukio", 20),
                    new Student("Kevin", 130),
                    new Student("Harumi", 200),
                    new Student("Pizza", 0)
            );
            
            System.out.println("IsEmpty");
        }

        return students;
    }
}
