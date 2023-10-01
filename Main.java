/**
 *
 * @author Miguel Capule
 */
package Main;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        /* Encapsulation */
        User u = new User(1213, "Miguel", "Miguel", "Capule");
        u.setUserID(41222);
        int id = u.getUserID();
        System.out.println(id);
        
        
        Character c1 = new Character("Miguel", "Hello", 100, 50, 5);
        Character c2 = new Character("Miguel", "Hello", 100, 50, 5);
        System.out.println(c1.dialog);
        System.out.println(c2.dialog);
        
        Student a = new Student("Miguel", "Capule", "1", "BSCS", "E", 90.6f, 99.9f);
        
        System.out.println("Name: ");
        String name = s.nextLine();
        
        System.out.println("Price: ");
        float price = s.nextFloat();
        
        Product p = new Product(name, price);
        Person p1 = new Person("Miguel", "Capule", 'M', 22);
        Person p2 = new Person("Kobe", "Bryant", 'M', 40);
        Person p3 = new Person("Michael", "Jordan", 'M', 50);
        Person p4 = new Person("Steph", "Curry", 'M', 35);
        
        System.out.println(p1.firstname);
        System.out.println(p1.lastname);
        System.out.println(p1.sex);
        System.out.println(p1.age);
        System.out.println(p2.firstname);
        System.out.println(p2.lastname);
        System.out.println(p2.sex);
        System.out.println(p2.age);
        System.out.println(p3.firstname);
        System.out.println(p3.lastname);
        System.out.println(p3.sex);
        System.out.println(p3.age);
        System.out.println(p4.firstname);
        System.out.println(p4.lastname);
        System.out.println(p4.sex);
        System.out.println(p4.age);
        
        
        Product p5 = new Product("Milk",150.0f);
        Product p6 = new Product("Juice",12.50f);
        Product p7 = new Product("Egg",20.20f);
        Product p8 = new Product("Shake",50.0f);
        
        System.out.println(p5.name);
        System.out.println(p5.price);
        System.out.println(p6.name);
        System.out.println(p6.price);
        System.out.println(p7.name);
        System.out.println(p7.price);
        System.out.println(p8.name);
        System.out.println(p8.price);
        
        
    }
    
}
