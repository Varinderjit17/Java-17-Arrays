import arrays.javaArrays;
import comparable.Student;
import comparable.StudentGpaComparator;
import inheritance.BankAccountService;

import java.util.Arrays;
import java.util.Comparator;

public class javaMain {
    public static void main(String args[]) {
        //ARRAYS PACKAGE
        //array initialisation, for loop
        //javaArrays.javaArraysExample();

        //java.util.arrays Methods
        //ArraysMethods.ArrayMethodsDemo();

        //INHERITANCE PACKAGE
        //BankAccountService.bankAccountService();

        //COMPARABLE PACKAGE
        Student s1 = new Student("Rupi", 3.5);
        Student s2 = new Student("Aish",7.8);
        Student s3 = new Student("Mani",2.4);

        Student [] students = {s1, s2, s3};

//        Arrays.sort(students);
//        System.out.println("Sorted students "+ Arrays.toString(students));

        //COMPARATOR INTERFACE
        Comparator<Student> sortobj = new StudentGpaComparator();
        Arrays.sort(students, sortobj);
        System.out.println("Sorted students "+ Arrays.toString(students));
    }
}
