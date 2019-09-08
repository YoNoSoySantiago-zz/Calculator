import java.util.Scanner;
     public class Calculator{
		 // operaciones con dos valores
		 public static void main(String[] args){
			 double[] memoria = new double[10];
			 char letter ='0';
			 int system = 2,operation2 = 0;
			 String operation;
			 double num1 = 0,num2 = 0,next = 0;
			 double result = 0;
			 String resultS = "",numS="",numS2 = "";
			 boolean continued = false;
			 Scanner S = new Scanner(System.in);
			 System.out.println("La calculadora se inisializo en modo Normal, para cambiar de modo presiona # despues de el resultado");
			 do{
				letter = 'g';	 
			 System.out.println("escoja la operacion a realizar \n"+
			 "A. Sistema de notacion \n"+
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
			 "14. El factorial de un numero \n"+
			 "15. Convertir a Binario \n" +
			 "16. Convertir a Haxadecimal \n" +
			 "17. Convertir a Decimal \n"+
			 "18. Convertir a Grados \n" +
			 "19. Convertir a Radianes \n" +
			 "E. Numero Pi (π)\n"+
			 "F. Apagar la calculadora \n");
			 
			 operation = S.next();
			 operation = operation.toUpperCase();
			 if(operation.length() > 0){
			 letter = operation.charAt(0);
			 }
			 if(letter == '#'){
				 continued = !continued;
			 }if(letter == 'A'){
				 System.out.println("Seleccione el Sistema de notaciondeseada \n"+
				 "A. Volver al menu principal \n"+
				 "1. Sistema Binario \n"+
				 "2. Sistema Decimal \n"+
				 "3. Sistema Hexadeciamal \n"+
				 "4. Sistema en Grados \n"+
				 "5. Sistema en Radianes");
				 system = S.nextInt();
			 }	 
				 if(letter != 'F' && letter != 'A' && letter != 'B' && letter != 'C' && letter != 'D' && letter != 'E' && letter != '#'){
					 if(operation.length() > 0){
					 operation2 = Integer.valueOf(operation);}
					if(operation2 <= 7 || operation2 == 8){
						
						if(system == 1){
							System.out.println("porfavor ingrese el primer valor a operar en ceros y unos");
							if(next == 1){
								num1 = result;
							}else{
						numS = S.next();
							num1 = Convertir.biToDec(numS);}//repetir esto
						
						System.out.println(" digite el valor con el que va a operarS");
						numS = S.next();
						num2 = Convertir.biToDec(numS);
						}
						else if(system == 3){
							System.out.println("porfavor ingrese el primer valor en formato Hexadecimal");
						numS = S.next();
						num1 = Convertir.hexToDec(numS);
						
						System.out.println(" digite el valor con el que va a operar");
						numS = S.next();
						num2 = Convertir.hexToDec(numS);
						}else{
							System.out.println("porfavor ingrese el primer valor en formato decimal");
						num1 = S.nextDouble();
						    System.out.println("digite el valor con el que va a operar");
						num2 = S.nextDouble();
					
						}
						
					}else if(operation2 != 17){
					 System.out.println("acontinuacion digite el valor a operar");
						num1 = S.nextInt();
					}else{
					 System.out.println("acontinuacion digite el valor a operar");
						numS = S.next();
					}
					switch (operation2){
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
					num1 = num1*(PI/180);
					result = Operation1.seno(num1);
					break;
					case 11:
					num1 = num1*(PI/180);
					result = Operation1.coseno(num1);
					break;
					case 12:
					num1 = num1*(PI/180);
					result = Operation1.tangente(num1);
					break;
					case 13:
					result = Operation1.base10(num1);
					break;
					case 14:
					result = Operation1.factorial((int)num1);
					break;
					case 15:
					resultS = Convertir.binario((int)num1);
					break;
					case 16:
					resultS = Convertir.hexadecimal((int)num1);
					break;
					case 17: //Covertir todo a decimal
					if(system == 3){
					result = Convertir.hexToDec(numS);
					}else if(system == 1){
					result = Convertir.biToDec(numS);	
					}else{
						result = num1;
					}
					break;
					case 18:
					result = Convertir.grados(num1);
					break;
					case 19:
					result = Convertir.radianes(num1);
					break;
					}
					if(system == 1 && operation2 != 17){
						resultS = Convertir.binario((int)result);
					}else if(system == 3 && operation2 != 17){
						resultS = Convertir.hexadecimal((int)result);
					}
					if(operation2 == 15 || operation2 == 16 || system == 1 && operation2 != 17 || system == 3 && operation2 != 17){
						 System.out.println("el resultado es igual a "+resultS);}
					else{
						 System.out.println("el resultado es igual a "+result);}
				
					}if(continued == false && letter != 'F'){
			System.out.println("¿desea continuar? \n"+
			"1. Si \n"+
			"2. NO");
			next = S.nextInt();
				 }else{
					 next = 1;
				 }
				
			 
			
			 }while(letter != 'F');
			 System.out.println("GRACIAS POR PREFERIRNOS, VUELVE PRONTO");
		 }
		 static final double PI = 3.1415926535;
		
	 }
	 
	 
     
	 
	 
	 
	
		 
		 
		 