public class finalize_method {

    finalize_method() {

    }

    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("inside demo's finalize()");
        } catch (Throwable e) {
            throw e;
        } finally {
            System.out.println("Calling finalize method"
                    + " of the Object class");
        }
    }

    public static void main(String[] args) throws Throwable {

        finalize_method fm = new finalize_method();
        fm.finalize();
    }
}