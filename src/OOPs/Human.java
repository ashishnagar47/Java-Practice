package OOPs;

public class Human {
    String name;
    int hand = 2;
    static int a = 4;
    int salary;

    public void loan() {
        int bonus = salary / 10;

    }

    public Human() {
        //    salary=10000000;
        this(1000);
     //   this("ashish");
    }

    public Human(int salary) {
        this.salary = salary;
    }
    public Human(String name){
        this.name=name;
    }
}
