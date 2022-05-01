import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class trials {
	// Initializing necessary ArrayLists.
	static ArrayList<Integer> coefficients = new ArrayList<Integer>();
	static ArrayList<String> elementsUnsorted = new ArrayList<>();
	static ArrayList<Integer> exponentsUnsorted = new ArrayList<>();
	
	public static void main(String[] args) {
		String exp = "2x^3+4x^4+5x-42";
		Pattern polynomialPattern = Pattern.compile("([+-]?[^-+]+)");
		Matcher polynomialMatcher = polynomialPattern.matcher(exp);
		int x=0;
		// Building our elementsUnsorted list by regex.
		while (polynomialMatcher.find()) {
		    x=x+1;
		    System.out.println("Group "+x+": " + polynomialMatcher.group(1));
		    elementsUnsorted.add(polynomialMatcher.group(1));
		}
		System.out.println(elementsUnsorted);
		// Now we have our elements, I need to get their coefficients.
		
		// Adding the first coefficient to our ArrayList. (x^0)
		for (String elem : elementsUnsorted) {
			if (!(elem.contains("^")) && !(elem.contains("x"))) 
				coefficients.add(Integer.parseInt(elem));
		}
		
		// Adding the second coefficent to our ArrayList. (x^1)
		for (String elem : elementsUnsorted) {
			if (!(elem.contains("^")) && (elem.contains("x"))) 
				coefficients.add(Integer.parseInt(elem.substring(elem.indexOf("+") + 1, elem.indexOf("x"))));
		}
		
		System.out.println(coefficients);
		
		// Derecelere g�re elementsSorted listesi yap
		
		// e�er ifadede '^' yoksa 
		// -> e�er ifadede 'x' yoksa
		// --> coefficients listesinin ilk eleman� bulundu
		// -> e�er ifadede 'x' varsa
		// --> coefficients listesinin ikinci eleman� bulundu
		
		// e�er ifadede '^' varsa
		// --> exponentsSorted listesi yapmal�s�n
		// exponentsUNSORTED listesi yap ve 
		// for i in elements unsorted
		// -> if contains '^'
		// --> exponentsUNSORTED.add(i.charAt(lastindex))
		// exponentsSorted = sort(exponentsUNSORTED)
		// j = 0;
		// while (elementsUnsorted.length > 0)
		// ->for (elem: elementsUnsorted)
		// -->if elementsUnsorted.get(i) == exponentsUNSORTED(j)
		// --->elementsSorted.add(elementsUnsorted.get(i))
		// --->elementsUnsorted.remove(elementsUnsorted.get(i))
		// --->j++;
		// -->else 
		// --->continue
		
		// nihayetinde elimizde elements sorted olmas� laz�m
		// for (elem : elementsSorted)
		// ->coefficients.add(all characters before 'x' (REGEX)
		// elementsSorted listesinin coefficientlerini ��kar
		// ---> B�ylece ilk ad�m tamamlanm�� olur.
		
		// ---------------valueAt fonksiyonu i�in-----------------
		// for i=0, i++ in coefficients
		// total value = 0
		// total value += coefficients.get(i) * x^i 
		// return total value
		
		// ---------------setDeltaX fonksiyonu i�in---------------
		// classlara �zel bir mant��� var, onu anla
		// muhtemelen 1 sat�rl�k bir kod
		
		// --------------compute integral fonksiyonu i�in---------
		// aral�k say�s� = (b-a)/deltaX
		// for i=0; i<aral�k say�s� - 1; i++
		// integration += deltaX * valueAt(a + i*deltaX)
		
		
	}
}
