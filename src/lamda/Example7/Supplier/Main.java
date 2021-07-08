package lamda.Example7.Supplier;

import java.util.function.Predicate;
import java.util.function.Supplier;


public class Main {
	static boolean isPersonEligibleForVoting(
	      Supplier<Person> supplier, Predicate<Person> predicate) {
		
	    return predicate.test(supplier.get());
	  }
	  
	  public static void main(String args[]) {
		  
	    Supplier<Person> supplier = () -> new Person("Alex",18);
	    Predicate<Person> predicate = p -> (p.getAge() > 16);
	    
	    boolean eligible =
	        isPersonEligibleForVoting(supplier, predicate);
	    System.out.println("Person is eligible for voting: " + eligible);
	  }}
