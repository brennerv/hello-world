public class helloworld {

    public static final String MY_NAME = "Vadim";

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World!!!");
        if (args.length > 0) System.out.println("My name is " + MY_NAME + " " + args[0]);
    }
}
