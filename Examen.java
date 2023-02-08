import java.util.Scanner;
public class Examen {
	Scanner scan= new Scanner (System.in);
	public Examen () {
	
	}
	public void primeraMayuscula() {
		System.out.println("Ingrese la frase a la que quiera que se le convierta la primera letra en mayuscula:"); 
		String myString1=scan.nextLine();
		int length=myString1.length();
		char firstChar = myString1.charAt(0);
		String charToString=String.valueOf(firstChar);
		String upperString=charToString.toUpperCase();
		String subString=myString1.substring(1, length);
		String newString=upperString+subString;
		System.out.println(newString);
	}
	public void invertirCadena() {
		System.out.println("Ingrese la frase la que quiere invertir:"); 
		String myString1=scan.nextLine();
		int length=myString1.length();
		String firstChar;
		String NewString="";
		char[] myChars = myString1.toCharArray();
		for(int i=length-1; i>=0;i--) {
			firstChar=String.valueOf(myChars[i]);
			NewString=NewString+firstChar;
		}
		System.out.println(NewString);
	}
	public void vocalesMayuscula() {
		System.out.println("Ingrese la frase que quiere convertir a mayusculas:"); 
		String myString1=scan.nextLine();
		String upperString=myString1.toUpperCase();
		System.out.println(upperString);
	}
	public void fizzBuzz() {
		for(int i=1;i<=100;i++) {
			if (i%3==0&&i%5==0) {
				System.out.println("FizzBuzz");
				continue;
			}if(i%3==0) {
				System.out.println("Fizz");
				continue;
			}if(i%5==0) {
				System.out.println("Buzz");
				continue;
			}else {
				System.out.println(i);
				continue;
			}
		}
		
	}
	public void palindromo() {
		System.out.println("Ingresa la frase que quiere comprobar si es palindromo:"); 
		String myString1=scan.nextLine();
		int length=myString1.length();
		String firstChar;
		String NewString="";
		char[] myChars = myString1.toCharArray();
		for(int i=length-1; i>=0;i--) {
			firstChar=String.valueOf(myChars[i]);
			NewString=NewString+firstChar;
		}
		myString1=myString1.replaceAll(" ","");
		myChars = myString1.toCharArray();
		NewString=NewString.replaceAll(" ","");
		length=myString1.length();
		char[] NewNewString=NewString.toCharArray();
		for(int i=length-1;i>=0;i--) {
		 if (myChars[i]==NewNewString[i]) {
			 continue;
		 }else {
			  System.out.println("No es un palíndromo");
			  System.exit(0);;
		 }
		}System.out.println("Si es un palíndromo");
		
	}
	

}
