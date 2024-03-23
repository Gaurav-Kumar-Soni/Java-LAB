
abstract class Sample_A {
    final int emp_id;
    int phn_no;
    String emp_name;

    Sample_A(String emp_name, int phn_no, int emp_id) {
        this.emp_name = emp_name;
        this.emp_id = emp_id;
        this.phn_no = phn_no;
    }

    abstract void display_details();
    
}

class Sample_B extends Sample_A {
    int salary;
    String address;

    Sample_B(String emp_name, int phn_no, int emp_id, int salary, String address) {
        super(emp_name, phn_no, emp_id);
        this.address = address;
        this.salary = salary;
    }

    @Override
    void display_details() {
        System.out.println("employee name is " + emp_name);
        System.out.println("employee Id is " + emp_id);
        System.out.println("his/her phone number is " + phn_no);
        System.out.println("address is " + address);
        System.out.println("employee salary  " + salary);
    }

}

class Parent{
    void display(){
        System.out.println("This is print from Parent class.");
    }
}

class Child extends Parent{
    void display(){
        System.out.println("This is print from Child Class.");
    }
}

public class Question3 {
    public static void main(String[] args) {

        Sample_B empB = new Sample_B("Shubman", 937323, 241, 28348, "Punjab");

        empB.display_details();

        Child c = new Child();
        Parent p = new Child();  // here Dynamic method Dispatch concept used

        p.display();
        c.display();
    }
}



