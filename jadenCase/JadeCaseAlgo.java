package jadenCase;

public class JadeCaseAlgo {
	public String toJadenCase (String phrase) {
		if (phrase == null ||phrase.equals("")) {
			return null;  //in put should be string or sentence
		}
	char [] array = phrase.toCharArray();// converting phrase string to a array of type char
	
		//iterate through the array checking the previous element if its "  " the the convert to upper case
	for(int x = 0; x<array.length; x++) {
		if (x==0 || array[x-1] == ' ' ) {
			array[x] = Character.toUpperCase(array[x]);
			
		}
		
	}
		return new String(array);// returning a string where all the first letters of each letter is a capital letter
		
	}

}
