public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//moltiplicazione numeri
		
		int a = 5;
		int b = 3;
		
		System.out.println(a * b);
		
		//concatena un intero e una stringa
		
		int c = 10;
		String string = "il mio numero preferito è ";
		System.out.println(string + c);
		
		//inserire una stringa in un array di stringhe
		
		//area triangolo
		double d = 5.5;
		double f = 2.5;
		double area = d*f/2;
		System.out.println("l'area del triangolo è " + area);
		
		
		//pari o dispari
		int e = 3;
		if(e%2 == 0) {
			System.out.println(e + " è pari");
		}else {
			System.out.println(e + " è dispari");
		}
		
		//perimetro rettangolo
		
		int g = 5;
		int h = 7;
		
		int perimetro = g*2 + h*2;
		System.out.println("il perimetro del rettangolo è " + perimetro);
		

	}

}
