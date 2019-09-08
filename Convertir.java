import java.util.Scanner;
public class Convertir{
/**
<p> des: <p> this method receives an integer in decimal format which will be transformed into binary using the method of division between two
@Param num1, this parameter represents a positive integer
@return this method returns the binary value of the number it represents
*/
             public static String binario(int num1){
				 String result = ""; 
				 while(num1 > 0){
					 result = (num1 % 2) + result;
					 num1 =(num1/2);
				 }
				 return result;
/**
<p> des: <p> This method receives an integer in decimal format which will be transformed into hexadecimal using the method decToHex method to extract the values in hexadecimal format and return them in a string
@Param num1, this parameter represents a positive integer
@return this method returns a string of characters that represents the number in hexadecimal format
*/
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
/** <p> desc: <p> receives a number from 1 to 15 which will be transformed into its hexadeciamal equivalent
@Param num1, this parameter represents a positive integer from 1 to 15
@throws DifferentNummber
if the number received is different from the range 1 to 15
this exception is executed
@return this net returns a character that represents the corresponding hexadecimal value of the number
*/		 
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
/**
<p> desc: <p> Resive a string in hexadecimal format,
This method allows you to convert the received string into a decimal integer
transforming all characters into integers
using the hexadeciaml format equality to transform all letters into integers

@Param hex, the received hexadecimal represents a hexadecimal number that includes
the letters from A to F and whole numbers.
@throws SinSimbolos
if the resividated chain has any symbol or character different from the letters from A to F and whole numbers
this exception will be executed
@return this method returns the hexadeciaml number received in its corresponding decimal number
 
*/
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
					 result = (int) ((cadena[i]* Operation2.potencyN(16,(cadena.length-(i+1))))+ result);
				 }
				 return result;
				 
			 }
/**
<p> des: <p> This method receives a string of zeros and ones which will be transformed into decimal using the powers of 2
@Param bin, this parameter represents a string of zeros and ones
@return this method returns a positive integer of the binary number that represents
*/		 
			 public static  int biToDec(String bin){
				 int result = 0, aux;
				 char[] binarioC = bin.toCharArray();
				 int[] binario = new int[binarioC.length];
				 for(int i = 0;i < binario.length;i++){
					 binario[i] = Integer.valueOf(Character.toString(binarioC[i]));
				 }
				 for(int i = 0;i < binario.length; i++){
					 aux = (int) Operation2.potencyN(2,(binario.length-(i+1)));
					 result = (binario[i]*aux) + result;
				 }
				 return result;
			 }
/**
<p> des: <p> this method receives a decimal number that represents a number in radians to be transformed into degrees
@Param radians, this parameter represents a decimal number in radian format
@return this method returns a decimal number in degrees format of the number it represents
*/
			 public static double degrees(double radians){
				 double result; 
				 result = radians*(180/Calculator.PI);
				 return result;
			 }
/**
<p> des: <p> this method receives a decimal number that represents a number in degrees to be transformed into radians
@Param radians, this parameter represents a decimal number in degree format
@return this method returns a decimal number in radian format of the number it represents
*/
			 public static double radians(double grads){
				 double result;
				 result = grads*(Calculator.PI/180);
				 return result;
			 }
/**
<p> des: <p> this method receives an array of decimal numbers to display on the screen and allows the user to choose a value from the array to return it
<p> pre: <p> the fix must come with the values of the last days system results of the decimal format
@Param memory [], this parameter the last days results of the operations in system of the decimal format
@return this method returns the value selected from the array value list
*/			 
			 public static double memory(double memory[]){
				 Scanner C = new Scanner(System.in);
				 System.out.println("los valor de la memoria son: ");
				 for(int i = 0; i < memory.length; i++){
					 System.out.print((i+1)+". ");
					 System.out.println(memory[i]);
				 }
				 return memory[C.nextInt() - 1];
			 }
/**
<p> des: <p> this method receives a decimal number, this method shows the scientific notation of the selected number looking for the exponent of ten
@Param num1, this parameter represents a decimal number
@return this method returns a string that represents the scientific notation of the number
*/			 
			 public static String base10(double num1){
				 String result = "";
				 int aux = 0;
				if(num1 >= 10){ 
				for(int i = 1; num1 >= 10; i++){
				num1 /= 10;
				aux = i;}
				}else{
					for(int i = 1; num1 < 1; i++){
						num1 *= 10;
						aux = i;
					}
					aux *= -1;
				}
				result = String.valueOf(num1);
				result = result + "x 10^" + String.valueOf(aux);
				return result;
			 }
             
    
}

			 
