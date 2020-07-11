package OOPs;

public class Children {
    public static void main(String[] args) {
        Human raj = new Human();
        raj.name = "Raj";
        Human human=new Human();
        System.out.println(raj.name);
        Human s=new Human(1000);
        Human name=new Human("ashish");
        System.out.println(s.salary);
        System.out.println(name.name);
    }
}