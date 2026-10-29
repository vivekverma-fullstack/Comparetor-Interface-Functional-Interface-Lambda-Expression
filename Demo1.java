import java.util.*;

class Demo1 {
    public static void main(String[] agrs) {
        List<Student> list = new ArrayList<>();

        list.add(new Student("Aditya", 101, 85));
        list.add(new Student("Rohit", 102, 89));
        list.add(new Student("Rohan", 103, 76));
        list.add(new Student("Vivek", 100, 98));

        Comparator<Student> c1 = new SortByName();
        Comparator<Student> c2 = new SortByRollNo();
        Comparator<Student> c3 = new SortByMarks();

        Collections.sort(list, c2);

        for (Student s: list) {
            System.out.println(s.name+" "+s.rollno+" "+s.marks);
        }


    }
}
class SortByName implements Comparator<Student>{
    @Override 
    public int compare(Student s1, Student s2){
        return s1.name.compareTo(s2.name);
    }
}

class SortByRollNo implements Comparator<Student>{
    @Override 
    public int compare(Student s1, Student s2){
        return s1.rollno - s2.rollno;
    }
}

class SortByMarks implements Comparator<Student>{
   @Override 
    public int compare(Student s1, Student s2){
        return s1.marks - s2.marks;
    }
}

class Student {
    String name;
    int rollno;
    int marks;

    Student(String name, int rollno, int marks) {
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }
}