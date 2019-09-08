import java.util.Scanner;
public class Convertir{
             public static String binario(int num1){
				 String result = ""; 
				 while(num1 > 0){
					 result = (num1 % 2) + result;
					 num1 =(num1/2);
				 }
				 return result;
			 }
			 public static String hexadecimal(int num1){
				 String result = "";
				 int division,residuo;
				 if(num1 < 16){
					 result = decToHex(num1);
				 }else{
					 do{
					 division = num1/16;
					 residuo = num1%16;
					 result = decToHex(residuo) + result;
					 num1 = division;
					 }while(num1 >= 16);
					 result = decToHex(num1) + result ;
				 }
				 return result;
			 }
			 public static String decToHex(int num1){
				 String result = "";
				 if(num1 < 0){
				 result = "0";}
				 else if(num1 >= 0 && num1 <= 9){
					 result = String.valueOf(num1) + result;
				 }else if(num1 >= 10 && num1 <= 15){
					 switch (num1){
						 case 10: 
						 result = result + "A";
						 break;
						 case 11: 
						 result = result + "B";
						 break;
						 case 12: 
						 result = result + "C";
						 break;
						 case 13: 
						 result = result + "D";
						 break;
						 case 14: 
						 result = result + "E";
						 break;
						 case 15: 
						 result = result + "F";
				    }
					 
				 }
				 System.out.println(num1);
				 return result;
			 }
			 public static int hexToDec(String hex){
				 int result = 0,aux = 0;
				 int cadena[]; 
				 int longitud = hex.length();
				 cadena = new int[longitud];
				 char hexadecimal[];
				 hex = hex.toUpperCase();
				 hexadecimal = new char[longitud];
				 hexadecimal = hex.toCharArray();
				 for(int i = 0; i < longitud; i++){
					
					 if(hexadecimal[i] == 'A'|| hexadecimal[i] == 'B' || hexadecimal[i] == 'C' || hexadecimal[i] == 'D' || hexadecimal[i] == 'E' || hexadecimal[i] == 'F'){
					switch (hexadecimal[i]) {	 
						 case 'A': 
						 cadena[i] = 10; 
						 break;
						 case 'B': 
						 cadena[i] = 11;
						 break;
						 case 'C': 
						 cadena[i] = 12;
						 break;
						 case 'D': 
						 cadena[i]= 13;
						 break;
						 case 'E': 
						 cadena[i] = 14;
						 break;
						 case 'F': 
						 cadena[i] = 15;
					 }
					 
					 }else{
					   
					  cadena[i] = Integer.parseInt(Character.toString(hexadecimal[i]));
					 
					 }
					
				 }
				 for(int i = 0; i < cadena.length; i++){
					 aux = cadena[i];
					 result = (int) ((cadena[i]* Operation2.potenciaN(16,(cadena.length-(i+1))))+ result);
				 }
				 return result;
				 
			 }
			 public static  int biToDec(String bin){
				 int result = 0, aux;
				 char[] binarioC = bin.toCharArray();
				 int[] binario = new int[binarioC.length];
				 for(int i = 0;i < binario.length;i++){
					 binario[i] = Integer.valueOf(Character.toString(binarioC[i]));
				 }
				 for(int i = 0;i < binario.length; i++){
					 aux = (int) Operation2.potenciaN(2,(binario.length-(i+1)));
					 result = (binario[i]*aux) + result;
				 }
				 return result;
			 }
			 public static double grados(double radians){
				 double result; 
				 result = radians*(180/Calculator.PI);
				 return result;
			 }
			 public static double radianes(double grads){
				 double result;
				 result = grads*(Calculator.PI/180);
				 return result;
			 }
			 public static double memoria(double memoria[]){
				 Scanner C = new Scanner(System.in);
				 System.out.println("los valor de la memoria son: ");
				 for(int i = 0; i < memoria.length; i++){
					 System.out.print((i+1)+". ");
					 System.out.println(memoria[i]);
				 }
				 return memoria[C.nextInt() - 1];
			 }
			 public static String base10(double num1){
				 String result = "";
				 int aux = 0;
				 
				for(int i = 1; num1 >= 10; i++){
				num1 /= 10;
				aux = i;
				}
				result = String.valueOf(num1);
				result = result + "x 10^" + String.valueOf(aux);
				return result;
			 }
             
    
}

			 
