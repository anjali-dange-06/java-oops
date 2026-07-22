package OOPS;
public class copyconstructor {
    int id;
    String name;
    // Parameterized Constructor
    copyconstructor(int id, String name) {
        this.id = id;
        this.name = name;
    }
    // Copy Constructor
    copyconstructor(copyconstructor obj) {
        this.id = obj.id;
        this.name = obj.name;
    }
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
    public static void main(String[] args) {
        // Original Object 
        copyconstructor s1 = new copyconstructor(101, "Anu");
        // First Way: Reference Copy 
        copyconstructor s2 = s1;//Changes through one reference affect the other.
        // Second Way: Copy Constructor
        copyconstructor s3 = new copyconstructor(s1); //Changes in one object do not affect the other.
        // Modify s2
        s2.id = 200;
        s2.name = "Rahul";
        System.out.println("s1:");
        s1.display();
        System.out.println("\ns2:");
        s2.display();
        System.out.println("\ns3:");
        s3.display();
    }
}