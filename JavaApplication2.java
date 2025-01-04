/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Kimo Store
 */
public class JavaApplication2 extends Instructor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Instructor instructor = new Instructor();

       JFrame frame = new JFrame("Student Management");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(4, 1));

        JButton addButton = new JButton("Add Student");
        JButton editButton = new JButton("Edit Student");
        JButton deleteButton = new JButton("Delete Student");
        JButton displayButton = new JButton("Display Students");

        frame.add(addButton);
        frame.add(editButton);
        frame.add(deleteButton);
        frame.add(displayButton);

        // Action Listeners for Buttons
        addButton.addActionListener(e -> {
            String name = JOptionPane.showInputDialog("Enter student name:");
            String gradeInput = JOptionPane.showInputDialog("Enter student grade:");
            try {
                double grade = Double.parseDouble(gradeInput);
                instructor.addStudent(name, grade);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Invalid grade. Please enter a number.");
            }
        });

        editButton.addActionListener(e -> {
            String name = JOptionPane.showInputDialog("Enter the name of the student to edit:");
            String gradeInput = JOptionPane.showInputDialog("Enter the new grade:");
            try {
                double grade = Double.parseDouble(gradeInput);
                instructor.editStudent(name, grade);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Invalid grade. Please enter a number.");
            }
        });

        deleteButton.addActionListener(e -> {
            String name = JOptionPane.showInputDialog("Enter the name of the student to delete:");
            instructor.deleteStudent(name);
        });

        displayButton.addActionListener(e -> instructor.displayStudents());

        frame.setVisible(true);
    }
}
