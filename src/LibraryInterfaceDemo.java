public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        KidUser kid1 = new KidUser(10, "Kids");
        KidUser kid2 = new KidUser(18, "Fiction");

        kid1.registerAccount();
        kid1.requestBook();

        kid2.registerAccount();
        kid2.requestBook();

        // Test case #2: AdultUser
        AdultUser adult1 = new AdultUser(5, "Kids");
        AdultUser adult2 = new AdultUser(23, "Fiction");

        adult1.registerAccount();
        adult1.requestBook();

        adult2.registerAccount();
        adult2.requestBook();
    }
}