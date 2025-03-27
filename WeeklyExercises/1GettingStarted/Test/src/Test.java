
public class Test {
	
	public static void main (String[] args) {
		System.out.println ("An Emergency Broadcast");
	}
}

// a.
// ---
// Error: Could not find or load main class Test
// Caused by: java.lang.NoClassDefFoundError: test (wrong name: Test)

	 
// b.
// ---
// An emergency Broadcast
//
// 'No error message as the code will print whatever is between the quotation marks to the console.
//  Switching "Emergency", to "emergency" does not change the function of the code, just what text is printed'

	
// c.
// ---
// Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
// Syntax error, insert ")" to complete MethodInvocation
//Syntax error, insert ";" to complete BlockStatements
// An cannot be resolved to a variable
// Emergency cannot be resolved to a type
// Syntax error, insert ";" to complete LocalVariableDeclarationStatement
// String literal is not properly closed by a double-quote
// String literal is not properly closed by a double-quote
//
// at Test.main(Test.java:6)

	
// d.
// ---
// Error: Main method not found in class Test, please define the main method as:
//    public static void main(String[] args)
// or a JavaFX application class must extend javafx.application.Application

	
// e.
// ---
// Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//         The method bogus(String) is undefined for the type PrintStream
//
//         at Test.main(Test.java:6)

	
// f.
// ---
// Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//         Syntax error, insert ";" to complete BlockStatements
//         at Test.main(Test.java:6)

	
// g.
// ---
// Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//         Syntax error, insert "}" to complete ClassBody
//
//         at Test.main(Test.java:7)
