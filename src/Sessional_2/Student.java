package Sessional_2;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Student {
    String name;
    int marks;

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public static void main(String[] args) {
//        LinkedList<Student> stud = new LinkedList<>();
//        stud.add(new Student("kartik",100));
//        stud.add(new Student("Keval",30));
//        stud.add(new Student("Mayur",200));
//
//        for(Student ele : stud){
//            if(ele.getMarks() > 80){
//                System.out.println(ele.getName() + " Has More Than 80");
//            }
//            else{
//                System.out.println(ele.getName() + " Has Not More Than 80");
//            }
//        }
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(10);
        queue.add(20);
        queue.add(0);
        queue.add(5);

        System.out.println(queue);
        Queue<Integer> newQueue = new LinkedList<>();
        newQueue.add(1);
        newQueue.add(2);

        queue.addAll(newQueue);
        System.out.println(newQueue);
        System.out.println(queue);
    }
}
