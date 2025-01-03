/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

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
            return name + " - " + grade;
        }
    }
       private ArrayList<Student> students = new ArrayList<>();
       
        public void addStudent(String name, double grade) {
            students.add(new Student(name,grade));
            
        }
         public void editStudent(String name, double grade) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).name.equals(name)) {
                students.get(i).grade = grade;
                break;
            }
        }
    }

       public void deleteStudent(String name) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).name.equals(name)) {
                students.remove(i);
                break;
            }
        }
    }
            public void displayStudents() {
            StringBuilder studentList = new StringBuilder();
        for (int i = 0; i < students.size(); i++) {
              studentList.append(students.get(i).toString()).append("\n");
        }
         JTextArea textArea = new JTextArea(studentList.toString());
        JScrollPane scrollPane = new JScrollPane(textArea);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        scrollPane.setPreferredSize(new java.awt.Dimension(250, 150));

        JOptionPane.showMessageDialog(null, scrollPane, "Student List", JOptionPane.INFORMATION_MESSAGE);
    }
         
         
    }