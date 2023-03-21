import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		boolean salir = false;//Definiendo variables
		int opcion; int mes=0;
		float num1 = 0; float num2 = 0; float resultado = 0; float num3;
		String signo = "";
		
		System.out.println("     --Calculator S.A--\n");
		
		while (!salir) {//mostrando menú repetitivo
			System.out.println("	Menú");//imprimiendo menu
			System.out.println("1.Sumar");
			System.out.println("2.Restar");
			System.out.println("3.Multiplicar");
			System.out.println("4.Dividir");
			System.out.println("5.Resto (modulo)");
			System.out.println("6.Zodiaco");
			System.out.println("7.Número mayor de 3 números");
			System.out.println("8.Capicua");
			System.out.println("0.Salir\n");
			
			System.out.println("Introduzca una opción:\n");
			opcion = sc.nextInt();
			
			switch (opcion) {
			
				case 1:
					System.out.println("Introduzca el primer número flotante a sumar:");
					num1 = sc.nextFloat();//guardando valores
					System.out.println("Introduzca el segundo número flotante a sumar:\n");
					num2 = sc.nextFloat();
					resultado = num1 + num2;//Hacemos la suma de los valores
					System.out.println("La suma de "+num1+" y "+num2+" es "+resultado+"\n");//imprimiendo valores
					break;
				
				case 2:
					System.out.println("Introduzca el primer número flotante a restar:");
					num1 = sc.nextFloat();
					System.out.println("Introduzca el segundo número flotante a restar:");
					num2 = sc.nextFloat();
					resultado = num1 - num2;//Hacemos la resta de los valores
					System.out.println("La resta de "+num1+" y "+num2+" es "+resultado+"\n");
					break;
				
				case 3:
					System.out.println("Introduzca el primer número flotante a multiplicar:");
					num1 = sc.nextFloat();
					System.out.println("Introduzca el segundo número flotante a multiplicar:");
					num2 = sc.nextFloat();
					resultado = num1 * num2;//multiplicamos los valores
					System.out.println("La multiplicacion de "+num1+" y "+num2+" es "+resultado+"\n");
					break;
				
				case 4:
					System.out.println("Introduzca el primer número flotante a dividir:");
					num1 = sc.nextFloat();
					System.out.println("Introduzca el segundo número flotante a dividir:");
					num2 = sc.nextFloat();
					
					if(num2==0) {
						System.out.println("Error division por "+num2);//en el caso de que el valor 2 sea 0
					}else {
						resultado = num1 / num2;//dividimos los valores
						System.out.println("La division de "+num1+" y "+num2+" es "+resultado+"\n");
					}
					break;
	
				case 5:
					System.out.println("Introduzca el primer número flotante a dividir:");
					num1 = sc.nextFloat();
					System.out.println("Introduzca el segundo número flotante a dividir:");
					num2 = sc.nextFloat();
					
					if(num2==0) {
						System.out.println("Error division por "+num2+"\n");//en el caso de que el valor 2 sea 0
					}else {
						resultado = num1 % num2;//Así conseguimos el resto (modulo)
						System.out.println("El resto de "+num1+" y "+num2+" es "+resultado+"\n");
					}					
					break;
	
				case 6:
					System.out.println("Introduzca su mes de nacimiento(1-12)\n");
					mes = sc.nextInt();
					switch(mes) {
					case 1:
						signo = "Aries";
						break;
					
					case 2:
						signo = "Tauro";
						break;
					
					case 3:
						signo = "Géminis";
						break;
					
					case 4:
						signo = "Cáncer";
						break;
					
					case 5:
						signo = "Leo";
						break;
					
					case 6:
						signo = "Virgo";
						break;
					
					case 7:
						signo = "Libra";
						break;
					
					case 8:
						signo = "Escorpio";
						break;
					
					case 9:
						signo = "Sagitario";
						break;
					
					case 10:
						signo = "Capricornio";
						break;
					
					case 11:
						signo = "Acuario";
						break;
					
					case 12:
						signo = "Piscis";
						break;
					
						
					default:
						signo = "error";
						break;
					}
					if(signo=="error") {//
						System.out.println("Error debe introducir un número del 1 al 12\n");//numero introducido no valido
					}else {
						System.out.println("Su signo zodiacal es: "+signo+"\n");//conseguimos el signo zodiacal
					}
					
					break;
	
				case 7:
					System.out.println("Introduzca el primer número flotante de los 3:");
					num1 = sc.nextFloat();
					System.out.println("Introduzca el segundo número flotante de los 3:");
					num2 = sc.nextFloat();
					System.out.println("Introduzca el tercer número flotante de los 3:\n");
					num3 = sc.nextFloat();
					resultado = num1;//le damos el mismo valor a "resultado" para comprobar la opreacion
					if(resultado < num2) {
						resultado = num2;
					}
					if(resultado < num3) {
						resultado = num3;
					}
					System.out.println("El "+resultado+" es el mayor de los 3.\n");
					break;
	
				case 8:
					System.out.print("Introduzca un número para saber si es capicua: ");
					int valor1= sc.nextInt();
					String comprobante = "";
					int digito;
					int inv=0;
					        int aux=valor1;
					        while (aux>0){
					            digito=aux%10;
					            inv=inv*10+digito;
					            aux=aux/10;
					        }
					        if (valor1!=inv) {
					           comprobante ="no";
					        }
					System.out.print("El "+valor1+ " " +comprobante+ " es Capicua\n");		
					break;
	
				case 0:
					System.out.println("El programa ha finalizado");
					salir=true;//Aquí acabamos el programa cambiando la funcion del bool
					break;
				default:
					System.out.println("Esa opción no es válida");//Si se añade un numero que no es el del menú da error
				
					break;
				
			}
		}
		
		
		
		
		
	}

}
