/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Kimo Store
 */
public class Instructor {
    static class Student {
        String name;
        double grade;

        Student(String name, double grade) {
            this.name = name;
            this.grade = grade;
        }

        @Override
        public String toString() {
            return String.format("%-20s %.2f", name, grade);
        }
    }

    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(String name, double grade) {
        if (name == null || name.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Name cannot be empty.");
            return;
        }
        if (grade < 0 || grade > 100) {
            JOptionPane.showMessageDialog(null, "Grade must be between 0 and 100.");
            return;
        }
        students.add(new Student(name, grade));
    }

    public void editStudent(String name, double grade) {
        for (Student student : students) {
            if (student.name.equals(name)) {
                student.grade = grade;
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Student not found: " + name);
    }

    public void deleteStudent(String name) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).name.equals(name)) {
                students.remove(i);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Student not found: " + name);
    }

    public void displayStudents() {
        StringBuilder studentList = new StringBuilder();
        for (Student student : students) {
            studentList.append(student.toString()).append("\n");
        }

        JTextArea textArea = new JTextArea(studentList.toString());
        JScrollPane scrollPane = new JScrollPane(textArea);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        scrollPane.setPreferredSize(new Dimension(300, 200));

        JOptionPane.showMessageDialog(null, scrollPane, "Student List", JOptionPane.INFORMATION_MESSAGE);
    }
}