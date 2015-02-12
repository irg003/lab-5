public class Hello
{
    public static void main( String argv[] )
    {
        // Default is "World"
        // Author: Isaac Garcia (irg003@ucsd.edu)
	String name = "World";
        if ( argv.length != 0 )
        {
            name = argv[0];
        }

	Greeter greeter = new Greeter(name);
        System.out.println(greeter.greet());
    }
}
