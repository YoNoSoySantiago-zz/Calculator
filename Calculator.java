import java.util.Scanner;
     public class Calculator{
		 // operaciones con dos valores
		 public static void main(String[] args){
			 double[] memoria = new double[10];
			 char operation,mode;
			 double num1 = 0,num2 = 0,next = 0;
			 double result = 0;
			 String resultS = "",numS="";
			 boolean continued = false;
			 Scanner S = new Scanner(System.in);
			 System.out.println("La calculadora se inisializo en modo Normal, para cambiar de modo presiona # despues de el resultado");
			 do{
				 do{
			 System.out.println("escoja la operacion a realizar \n"+
			 "1. Suma \n"+
			 "2. resta \n"+
			 "3. multiplicacion \n"+
			 "4. division \n"+
			 "5. modulo \n"+
			 "6. potenciacion \n"+
			 "7. Logaritmo base 10 y base n \n"+
			 "8. raiz n-enesima \n"+
			 "9. Raiz cuadrada \n"+
			 "10. seno \n"+
			 "11. coseno \n"+
			 "12. tangente \n"+
			 "13. base 10 de un numero x \n"+
			 "14. Memoria de los resultados de las ultimas 10 operaciones \n"+
			 "15. El factorial de un numero \n"+
			 "16. Convertir a Binario \n" +
			 "17. Convertir a Haxadecimal \n" +
			 "18. Convertir a Decimal \n"+
			 "19. Convertir a Grados \n" +
			 "20. Convertir a Radianes \n" +
			 "F. Apagar la calculadora \n" +
			 "E. Numero Pi (π) ");
			 
			 operation = S.next().charAt(0);
			 operation = Character.toUpperCase(operation);
			 if(operation == '#'){
				 continued = !continued;
			 }				 
				 if(operation != 'F' && operation != '#' && operation != 'A' && operation != 'B' && operation != 'C' && operation != 'D' && operation != 'E'){
					operation = (char) Character.getNumericValue(operation);
					if(operation <= 8){
						System.out.println("porfavor ingrese el primero valor a operar");
						num1 = S.nextDouble();
						System.out.println(" digite el valor con el que va a operar el anterior valor");
						num2 = S.nextDouble();
					}else if(operation != 18){ System.out.println("digite el valor a operar");
					num1 = S.nextDouble();
					}else{
						System.out.println("#. Escribir el modo del valor a transformar \n"+
					 "B. Sistema binomial \n"+
					 "C. Sistema Decimal \n"+
					 "D. Sistema Hexadecimal");
					 mode = S.next().charAt(0);
					 System.out.println("acontinuacion digite el valor a transformar");
						numS = S.next();
					}
					switch (operation){
					case 1:
					result = Operation2.suma(num1,num2);
					break;
					case 2:
					result = Operation2.resta(num1,num2);
					break;
					case 3:
					result = Operation2.multiplicacion(num1,num2);
					break;
					case 4:
					result = Operation2.division(num1,num2);
					break;
					case 5:
					result = Operation2.modulo(num1,num2);
					break;
					case 6:
					result = Operation2.potenciaN(num1,(int)num2);
					break;
					case 7:
					result = Operation2.logBaseN((int)num1,(int)num2);
					break;
					case 8:
					result = Operation2.raizN(num1,(int)num2);
					break;
					case 9:
					result = Operation1.raiz(num1);
					break;
				    case 10:
					result = Operation1.seno(num1);
					break;
					case 11:
					result = Operation1.coseno(num1);
					break;
					case 12:
					result = Operation1.tangente(num1);
					break;
					case 13:
					result = Operation1.base10(num1);
					break;
					case 14:
					memoria = Operation1.memoria(num1,memoria);
					break;
					case 15:
					result = Operation1.factorial((int)num1);
					break;
					case 16:
					result = Convertir.Binario((int)num1);
					break;
					case 17:
					resultS = Convertir.decToHex((int)num1);
					break;
					case 18: //Convertir todo a dec
					result = Convertir.hexToDec(numS);
					break;
					case 19:
					result = Convertir.grados(num1);
					break;
					case 20:
					result = Convertir.radianes(num1);
					break;
					}
					System.out.println("el resultado es igual a "+result);
				 }
				 if(continued == false && operation != 'F' && operation != '#'){
			System.out.println("¿desea continuar? \n"+
			"1. Si \n"+
			"2. NO");
			next = S.nextInt();
				 }else{
					 next = 1;
				 }
			
		
			 }while(operation != 'F' && next == 1);	
			 
			
			 }while(operation != 'F');
			 System.out.println("GRACIAS POR PREFERIRNOS, VUELVE PRONTO");
		 }
		 static final double PI = 3.1415926535;
		
	
	 
	 }
     
	 
	 
	 
	
		 
		 
		 