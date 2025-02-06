import arrays.javaArrays;
import comparable.Student;
import comparable.StudentGpaComparator;
import inheritance.BankAccountService;
import innerclasses.Employee;
import innerclasses.EmployeeComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

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
//        Student s1 = new Student("Rupi", 3.5);
//        Student s2 = new Student("Aish",7.8);
//        Student s3 = new Student("Mani",2.4);
//
//        Student [] students = {s1, s2, s3};

//        Arrays.sort(students);
//        System.out.println("Sorted students "+ Arrays.toString(students));

        //COMPARATOR INTERFACE
//        Comparator<Student> sortobj = new StudentGpaComparator();
//        Arrays.sort(students, sortobj);
//        System.out.println("Sorted students "+ Arrays.toString(students));

        //INNER CLASSES INTERFACE
        Employee e1 = new Employee(10008,"Rupi",2015);
        Employee e2 = new Employee(13445,"Jane",2021);
        Employee e3 = new Employee(10001,"Laura",2013);
        List<Employee> employees = new ArrayList<>(List.of(e1,e2,e3));

//        Comparator<Employee> comparatorObj = new EmployeeComparator();
//        employees.sort(comparatorObj);
//
//        System.out.println(employees);

        Comparator comparatorObj = new Employee.EmployeeNestedComparator("yearStarted");
        employees.sort(comparatorObj);
        for(Employee e: employees) {
            System.out.println(e);
        }
    }
}
