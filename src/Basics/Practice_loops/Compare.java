package Basics.Practice_loops;

import java.util.*;

    class Employee implements Comparable<Employee>{
        int sal;
        String name;
        Employee(String name,int sal){
            this.sal=sal;
            this.name=name;
        }

        public int compareTo(Employee comp){
            if(this.sal>comp.sal){
                return -1;
            }
            else if(this.sal<comp.sal){
                return 1;
            }
            else{
                return this.name.compareTo(comp.name);
            }
        }
    }
    public class Compare {
        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sal = s.nextInt();
        int t = s.nextInt();
        ArrayList<Employee> list = new ArrayList<>();
        while (t-- > 0) {
            list.add(new Employee(s.next(), s.nextInt()));
        }

        Collections.sort(list);

        for (Employee human : list) {
            if (human.sal >= sal) {
                System.out.println(human.name + " " + human.sal);
            } else {
                break;
            }
        }
    }
}

