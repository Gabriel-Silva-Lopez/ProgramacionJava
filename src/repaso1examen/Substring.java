package repaso1examen;

public class Substring {
	
	public static void main(String[] args) {
	String mistring = "helloslkhellodjladfjhello";
	String substring = "hello";
	int lastIndex = 0;
	int count = 0;

	while(lastIndex != -1){

	    lastIndex = mistring.indexOf(substring,lastIndex);

	    if(lastIndex != -1){
	        count ++;
	        lastIndex += substring.length();
	    }
	}
	System.out.println(count);
	}
}
