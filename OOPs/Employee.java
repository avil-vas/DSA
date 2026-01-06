package OOPs;

public class Employee {
    String eName;
    int eid;
    String des;

    Employee() {
        System.out.println(" hi i am parent");
    }
    

     Employee(String eName) {
       
        this.eName=eName;
        System.out.println("current object"+this);
    }

    Employee(String des,int eid) {
        this("Avil");
        System.out.println("Hi");
        this.des=des;
        this.eid=eid;


    }

   class A extends Employee{

       A(){
         System.out.println("I am child here ");
       }
        
    }



    
    

    public static void main(String[] args) {
        Employee e1=new Employee();
       Employee.A a=e1.new A();


        
    }
    
}
