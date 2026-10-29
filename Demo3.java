import java.util.*;

public class Demo3 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Vivek", 100, 36));
        list.add(new Student("Aditya", 99, 36));
        list.add(new Student("Aannya", 106, 36));
        Collections.sort(list,(s1,s2)->s1.name.compareTo(s2.name)); //Lambda Expression (a,b)->a-b
        for (Student s : list) {
            System.out.println(s.name+" "+s.rollno);
        }
    }
}

class Student{
    String name; 
    int rollno;
    int marks;
    Student(String name, int rollno, int marks){
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }
}
