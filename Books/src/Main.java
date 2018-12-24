import jdk.internal.util.xml.impl.Input;

public class Main {
    public static void main(String[] arg) {
        Inputs contacts = new Inputs();
        contacts.fileRead("contacts.txt");

        Inputs book = new Inputs();
        book.readBook("book.txt");
    }
}



