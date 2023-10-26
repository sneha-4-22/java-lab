import java.util.*;
class Person{
    String name;
    String address;
    Person(String name,String address){
        this.name=name;
        this.address=address;
    }
    public String getname(){
        return this.name;
    }
    public String getaddress(){
        return this.address;
    }
    public void setaddress(String address){
        this.address=address;
    }
}
class Students extends Person{
    String program;
    int year;
    double fee;
    Students(String name,String address,String program,int year,double fee){
     super(name,address);
     this.program=program;
     this.year=year;
     this.fee=fee;
    }
    public String getprogram(){
        return this.program;
    }
    public void setprogram(String program){
        this.program=program;
    }
}
public class PersonClass {
    public static void main(String[] args) {
        
    }
}
