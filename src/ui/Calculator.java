import java.util.Scanner;
     public class Calculator{
		 // operaciones con dos valores
		 public static void main(String[] args){
			 double[] memory = new double[10];
			 char letter ='0',numLetter = '0';
			 int system = 2,operation2 = 0,negative = 1;
			 String operation,auxNum;
			 double num1 = 0,num2 = 0,next = 0;
			 double result = 0, auxMemory,auxMemory2 = 0;
			 String resultS = "",numS="",numS2 = "";
			 boolean continued = false;
			 Scanner S = new Scanner(System.in);
			 System.out.println("La calculadora se inisializo en modo Normal, para cambiar de modo presiona # despues de el resultado \n"+
			 "recuerde usar E. para representar al Numero Pi (π) \n"+
			 "Tambien puedes abrir la memoria usando B. (solo puedes usarla en Notacion decimal");
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
			 "7. Logaritmo base n \n"+
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
			 "20. Logaritmo base 10 \n"+
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
				 "1. Sistema de notacion Binaria \n"+
				 "2. Sistema de notacion Decimal \n"+
				 "3. Sistema de notacion Hexadeciamal");
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
							num1 = Convertir.biToDec(numS);
							}//repetir esto
						
						System.out.println(" digite el valor con el que va a operarS");
						numS = S.next();
						num2 = Convertir.biToDec(numS);
						
					    }else if(system == 3){
							if(next == 1){
								num1 = result;
							}else{
							System.out.println("porfavor ingrese el primer valor en formato Hexadecimal");
						numS = S.next();
						num1 = Convertir.hexToDec(numS);
							}
						System.out.println(" digite el valor con el que va a operar");
						numS = S.next();
						num2 = Convertir.hexToDec(numS);
							
						}else{
							if(next == 1){
							num1 = result;
							}else{
							System.out.println("porfavor ingrese el primer valor en formato decimal");
							auxNum = S.next();
							auxNum = auxNum.toUpperCase();
							if(auxNum.length() > 0){
								numLetter = auxNum.charAt(0);
							}
							if(numLetter == 'B'){
							num1 = Convertir.memory(memory);
							}else if(numLetter == 'E'){
								num1 = PI;
							}else{
								num1 = Double.parseDouble(auxNum);
							}
						
							}
						    System.out.println("digite el valor con el que va a operar");
							auxNum = S.next();
							auxNum = auxNum.toUpperCase();
							if(auxNum.length() > 0){
								numLetter = auxNum.charAt(0);
							}
							if(numLetter == 'B'){
							num2 = Convertir.memory(memory);
							}else if(numLetter == 'E'){
								num2 = PI;
							}else{
						num2 = Double.parseDouble(auxNum);
							}
						}
						
					}else if(operation2 != 17){
						if(next == 1){
							num1 = result;
						}else{
					 System.out.println("acontinuacion digite el valor a operar");
					 auxNum = S.next();
							auxNum = auxNum.toUpperCase();
							if(auxNum.length() > 0){
								numLetter = auxNum.charAt(0);
							}
							if(numLetter == 'B'){
							num1 = Convertir.memory(memory);
							}else{
						num1 = Double.parseDouble(auxNum);
							}
						}
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
					result = Operation2.potencyN(num1,(int)num2);
					break;
					case 7:
					result = Operation2.logBaseN(num1,(int)num2);
					break;
					case 8:
					result = Operation2.rootN(num1,(int)num2);
					break;
					case 9:
					result = Operation1.root(num1);
					break;
				    case 10:
					for(int i = 1; num1 > 180 || num1 < -180; i++){
						if(num1 > 180){
							num1 -= 180;
							}else{
							num1 += 180;	
							}
						negative = i;
					}
					if(negative%2 != 0){
						num1 *= -1;
					}
					num1 = num1*(PI/180);
					result = Operation1.seno(num1);
					break;
					case 11:
					for(int i = 1; num1 > 180 || num1 < -180; i++){
						if(num1 > 180){
							num1 -= 180;
							}else{
							num1 += 180;	
							}
						negative = i;
					}
					if(negative%2 != 0){
						num1 *= -1;
					}
					num1 = num1*(PI/180);
					result = Operation1.coseno(num1);
					break;
					case 12:
					for(int i = 1; num1 > 180 || num1 < -180; i++){
						if(num1 > 180){
							num1 -= 180;
							}else{
							num1 += 180;	
							}
						negative = i;
					}
					if(negative%2 != 0){
						num1 *= -1;
					}
					num1 = num1*(PI/180);
					result = Operation1.tangente(num1);
					break;
					case 13:
					resultS = Convertir.base10(num1);
					result = num1; 
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
					result = Integer.parseInt(numS);
					}
					break;
					case 18:
					result = Convertir.degrees(num1);
					break;
					case 19:
					result = Convertir.radians(num1);
					break;
					case 20:
					result = Operation1.logBase10(num1);
					}
					if(system == 1 && operation2 != 17){
						resultS = Convertir.binario((int)result);
					}else if(system == 3 && operation2 != 17){
						resultS = Convertir.hexadecimal((int)result);
					}
					if(operation2 == 15 || operation2 == 16 || operation2 == 13 || system == 1 && operation2 != 17  || system == 3 && operation2 != 17 ){
						 System.out.println("el resultado es igual a "+resultS);
						 for(int i = 0; i < memory.length; i++){
							 auxMemory = memory[i];
							 memory[i] = auxMemory2;
							 auxMemory2 = auxMemory;
						 }
						 if(operation2 == 15 || operation2 == 16 || operation2 == 13){
							 memory[0] = num1;
						 }else if(system == 1){
							 memory[0] = Convertir.biToDec(resultS);
						 }else{
							 memory[0] = Convertir.hexToDec(resultS);
						 }
						 
						 }
					else{
						 System.out.println("el resultado es igual a "+result);
						 for(int i = 0; i < memory.length; i++){
							 auxMemory = memory[i];
							 memory[i] = auxMemory2;
							 auxMemory2 = auxMemory;
						 }
						 memory[0] = result;
						 }
				
					}if(continued == false && letter != 'F' && letter != 'A' && result < Double.MAX_VALUE){
			System.out.println("¿desea continuar? \n"+
			"1. Si \n"+
			"2. NO");
			next = S.nextInt();
				 }else if(letter != 'A' && result < Double.MAX_VALUE){
					 next = 1;
				 }else if(letter != 'A'){
					 next = 0;
				 }
				
			 
			
			 }while(letter != 'F');
			 System.out.println("GRACIAS POR PREFERIRNOS, VUELVE PRONTO");
		 }
		 static final double PI = 3.1415926535;
		
	 }
	 
	 
     
	 
	 
	 
	
		 
		 
		 