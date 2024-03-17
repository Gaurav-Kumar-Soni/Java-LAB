package folder_B;

import folder_A.*;

class Sample_B1 extends file_A1 {

    public void test() {

        display_public();

        display_protected(); // Fixed the method visibility issue

    }

}

public class file_B1 {
    public static void main(String[] args) {

        Sample_B1 B1 = new Sample_B1();

        B1.display_public();
        B1.test();
        // B1.display_private() gives error
        // B1.display_protected() gives error

    }
}
