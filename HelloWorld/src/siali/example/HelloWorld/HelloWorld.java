package siali.example.HelloWorld;
/**First java program, a class with a method which print 'Hello World'.
 * /** define a javadoc documentation
 *
 * -public means that method can be accessed by any class who received an instance of this class. With protected, method
 * can only be accessed by his class and inherited, and with protected only by his class
 *
 * with static, this method are from the class, not a instance. If we change it, it changes for every instance
 *
 * void because it hasn't any output value
 *
 * there must be a main method in a file
 *
 * Multiple String argument inputs can be given
 * */
public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello World!");
    }
}