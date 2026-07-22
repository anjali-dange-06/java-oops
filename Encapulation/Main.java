public class Main {
     public static void main(String[] args){
//     Student s1=new Student();
//   s1.setname("sakji");
//   s1.setId(2);

Student s1 = new Student(1,"anjali");
System.out.println("the name is : "+s1.getname());
System.out.println("the id is : "+s1.getId());
s1.setname("sakshi");
s1.setId(2);
System.out.println("the name is : "+s1.getname());
System.out.println("the id : "+s1.getId());


    }
}