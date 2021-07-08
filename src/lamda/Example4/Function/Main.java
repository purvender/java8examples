package lamda.Example4.Function;

import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/*
 Function is a built in interface 
 
 public interface Predicate <T>
 {
 	public boolean apply(T1);
 }
 
*/

public class Main {
	 static int i = 5;

	public static void main(String[] args) {
		 //int i = 5;

	        i = 7; // Since we have changed the value of i, the below line will not compile.

	        UnaryOperator<Integer> operator = (input) -> input * i; 

	        System.out.println(operator.apply(i));

		System.out.println("\n==== NameTestNew02 ===");

		List<Person> list1 = Person.createShortList();

		// Define Western and Eastern Lambdas

		Function<Person, String> westernStyle = p -> {
			return "\nName1: " + " " + p.getSurName() + "\n";
		};

		Function<Person, String> easternStyle = p -> "\nName2: " + " " + p.getSurName() + "\n";

		// Print Western List
		System.out.println("\n===Western List===");
		for (Person person : list1) {
			System.out.println(person.printCustom(westernStyle));
		}

		// Print Eastern List
		System.out.println("\n===Eastern List===");
		for (Person person : list1) {
			System.out.println(person.printCustom(easternStyle));
		}

	}

}
