package fizzBuzz;

public class FizzBuzz {


	/*public static Object fizzBuzz(int i) {
		String sres = "";
		if (i%3 == 0) sres += "fizz";
		if (i%5 == 0) sres += "buzz";
		if(sres.equals(""))
			return Integer.toString(i);
		else
			return sres; 
	}*/
	
	
	//Refactor
	
	static Integer[] valSpec = {3, 5};
	static String[] motsSpec = {"fizz", "buzz"};
	
	public static String fizzBuzz(int entree) {
		StringBuilder result = new StringBuilder("");
		for(int i = 0; i < valSpec.length; i++  ) {
			if (entree%valSpec[i] == 0) result.append(motsSpec[i]);
		}
		if(result.length()==0)
			return Integer.toString(entree);
		else
			return result.toString(); 
	}
	
	
	
	
}
