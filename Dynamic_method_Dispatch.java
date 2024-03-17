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
        Child baby = new Child();
        Parent daddy = new Child();  // here Dynamic method Dispatch concept used

        daddy.display();
        baby.display();
    }
    
}
