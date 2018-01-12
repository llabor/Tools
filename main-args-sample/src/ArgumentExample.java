/**
 * @author Ezequiel Llarena Borges
 * @version 1.0
 * @since jan 2018 
 * */

/*
 * To run it through the command-line console (example):
 * C:\Users\Ezequiel\workspace\main-args-sample\bin> java ArgumentExample 8 9 1
 */

public class ArgumentExample {
    
	// args contains the supplied command-line arguments as an array of String object
	// args doesn't necessarily have to be named args (you can name it whatever you want)
	// though it's best to follow convention.
	
	public static void main(String[] args) { // (String... args) is equivalent
        if(args.length > 0) {
        	for(int i = 0; i < args.length; i++) {
                System.out.println(args[i]);
            }
        } else {
        	System.out.println("No arguments.");
        }
    }
}
