package folder_A;

public class file_A1 {

    public void display_public() {
        System.out.println("This method is in Public");
    }

    protected void display_protected() {
        System.out.println("This method is in Protected");
    }

    private void display_private() {
        System.out.println("This method is in Private");
    }

    public static void main(String[] args) {
        file_A1 A1 = new file_A1();

        A1.display_public();
        A1.display_protected();
        A1.display_private();
    }

}
