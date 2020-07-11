package Interfaces;


import java.util.*;

class Human implements Comparable<Human> {
        String name;
        int sal;

        Human(String name, int sal){
            this.name = name;
            this.sal = sal;
        }


        @Override
        public int compareTo(Human human) {
            if (this.sal < human.sal){
                return 1;
            }else if (this.sal > human.sal){
                return -1;
            }else {
                return this.name.compareTo(human.name);
            }
        }
    }

     public class Main {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
           // int salary = s.nextInt();
            int t = s.nextInt();
            ArrayList<Human> list = new ArrayList<>();
            while (t-- > 0) {
                list.add(new Human(s.next(), s.nextInt()));
            }

            Collections.sort(list);

            for (Human human : list) {
               // if (human.sal >= salary) {
                    System.out.println(human.name + " " + human.sal);
                //} else {
              //      break;
               // }
            }
        }

}
