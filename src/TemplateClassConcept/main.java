package TemplateClassConcept;

import java.util.Scanner;

public class main<T> {
    T degree;
    T name;
    T rollNumber;
    {
        System.out.println("initialization block:: constructor called.");

    }
    public static void main(String[] args) {
//        main<String> h = new main<>();
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the degree: ");
//        h.degree = sc.next();
//        System.out.println("Enter the name: ");
//        h.name = sc.next();
        main<Integer> h2 = new main<>();
        System.out.println("Enter the roll number: ");
        try {
            if (sc.hasNextInt()) {
                h2.rollNumber = sc.nextInt();
                System.out.println(h2.getRollNumber());
            }else System.out.println("not a number.");
        } catch (Exception e) {
            System.out.println("exception occur.");
        }
    }
    public T getDegree() {
        return degree;
    }

    public void setDegree(T degree) {
        this.degree = degree;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public T getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(T rollNumber) {
        this.rollNumber = rollNumber;
    }
}

