package folder_A;

class sub_A extends file_A1 {

    public void test(){
        file_A1 A1 = new file_A1();

        A1.display_protected();
        A1.display_public();
    // A1.display_private();  will get error
    }
}

public class file_A2 {
    public static void main(String[] args) {
        file_A1 A1 = new file_A1();

        A1.display_public();
        A1.display_protected();
        // A1.display_private();  will get Error

    }
}
