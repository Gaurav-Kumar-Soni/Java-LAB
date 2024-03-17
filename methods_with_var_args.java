class Students_of_231 {
    Students_of_231(String... person) {
        for (String name : person) {
            System.out.println("Welcome " + name);
        }
    }
}

public class methods_with_var_args {

    public static void main(String[] args) {
        Students_of_231 eg = new Students_of_231("Aditya", "Gaurav", "Inam", "Pratham", "Shashwat");
    }

}
