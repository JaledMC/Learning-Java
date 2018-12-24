import java.util.Arrays;

public class Printing {
    public void printText(){
        System.out.println("This is a text");
    }
    public void printMessage(String arg1, String arg2){
        System.out.println("The temperature "+arg1+", is "+arg2);
    }
    public void printLongMessages(String[] arg){
        System.out.println("You said: "+ Arrays.toString(arg));
    }
    public void textCharacteristics(String arg) {
        System.out.println(arg.length());
        System.out.println(arg.toUpperCase());
    }
}
