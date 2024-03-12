import java.util.*;

public class B90480 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String args[]) {
		String word, acronym;
		
		
		while (true) {
			
			System.out.print("Insira o seu texto: ");
			word = sc.nextLine();
			if (word.equals("")) break;
			
			acronym = Acronimo(word);
			
			System.out.printf("O acrónimo é: %s", acronym);
			System.out.println("");
		}
	}
	
	public static String Acronimo (String string) {
		String porto = "";
		
		String[] palavra = string.split(" ");
		
		for (int i = 0; i < palavra.length; i++) {
			if (palavra[i].length() > 3) {
				porto = porto + Character.toUpperCase(palavra[i].charAt(0));
			}
		}
		
		return porto;
	}
}

