package firstDay;

public class Identifiers {

	public static void main(String[] args) {
		
		//valid identifiers
		/*
		 * The only allowed characters for identifiers are all alphanumeric characters([A-Z],[a-z],[0-9]), 
		 * ‘$‘(dollar sign) and ‘_‘ (underscore).
		 * For example “geek@” is not a valid java identifier as it contain ‘@’ special character.
		 * Identifiers should not start with digits([0-9]). 
		 * For example “123geeks” is a not a valid java identifier.
		 */
		
		int num = 20;
		
		int $num = 30;
		
		int _num = 40;
		
		System.out.print(num);
		
		//invalid identifiers
		/*
		 * Reserved Words can’t be used as an identifier. 
		 * For example “int while = 20;” is an invalid statement as while is a reserved word. 
		 * There are 53 reserved words in Java.
		 */
		
		//for is a reserved word ==> invalid identifier
		//int for = 70; 

	}

}
