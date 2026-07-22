/*
Wrapping data and methods together into a single unit (class)
and protecting data using private.
 Variables are hidden

 Encapsulation means hiding data by making variables private and accessing them through getter and setter methods. 
Access happens through methods
 Main Purpose of Encapsulation
✅ Data Hiding
User cannot directly change important data.
✅ Security
Protects data from wrong access.
✅ Control
You decide how data should be changed.
✅ Easy Maintenance
Code becomes organized and clean
*/
class Student{
private int id;
private String name;

Student(int id,String name){
this.id=id;
this.name=name;
}
Student(){

}
public String getname(){
    return name;
}
public int getId()
{

    return id;
}
public void setname(String name){
this.name=name;
}
public void setId(int id){
    this.id=id;
}
public static void main(String[] args){

}
}