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
public class Dynamic_method_Dispatch {
    public static void main(String[] args) {
        Child c = new Child();
        Parent p = new Child();  // here Dynamic method Dispatch concept used

        p.display();
        c.display();
    }
    
}
