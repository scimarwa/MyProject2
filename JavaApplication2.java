/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

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

        instructor.addStudent("Ahmed", 100);
        instructor.addStudent("Samir", 80);

        System.out.println("Students:");
        instructor.displayStudents();

        instructor.editStudent("Ahmed", 90);
        instructor.deleteStudent("Samir");

        System.out.println("Updated Students:");
        instructor.displayStudents();
        // TODO code application logic here
    }
    
}
