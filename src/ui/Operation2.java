// esta clase contiene todas los metodos que requieren dos parametros para operar
public class Operation2{
/**
<p> des: <p> receives two numbers in decimal format, this method allows you to add two numbers and return your result
@Param num1, this parameter represents a decimal number
@Param num2, this parameter represents a decimal number
@return this method returns the sum of the parameters
*/
		 public static double suma(double num1,double num2){
				 
			 double result = 0;
			 result = num1 + num2;
			 return result;
		 }
/**
<p> des: <p> receives two numbers in decimal format, this method allows you to subtract two numbers and return your result
@Param num1, this parameter represents a decimal number
@Param num2, this parameter represents a decimal number
@return this method returns the subtraction of the parameters
*/
		 public static double resta(double num1,double num2){
			 double result;
			 result = num1 - num2;
			 return result;
		 }
/**
<p> des: <p> receives two numbers in decimal format, this method allows you to multiply two numbers and return your result
@Param num1, this parameter represents a decimal number
@Param num2, this parameter represents a decimal number
@return this method returns the multiplication of the parameters
*/
		 public static double multiplicacion(double num1,double num2){
			 double result;
			 result = num1 * num2;
			 return result;
		 }
/**
<p> des: <p> receives two numbers in decimal format, this method allows you to divide two numbers and return your result
@Param num1, this parameter represents a decimal number
@Param num2, this parameter represents a decimal number, this parameter must be different from zero
@return this method returns the division of the parameters
*/
		 public static double division(double num1,double num2){
			 double result;
			 result = num1 / num2;
			 return result;
		 }
/**
<p> des: <p> receives two numbers in decimal format, this method allows to find the module (residual) of two numbers.
@Param num1, this parameter represents a decimal number
@Param num2, this parameter represents a decimal number, this parameter must be different from zero
@return this method returns the division module between parameter 1 parameter 2

*/
		 public static double modulo(double num1,double num2){
			 double result;
			 result = num1 % num2;
			 return result;
		 }
/**
<p> des: <p> receives two numbers in decimal format, this method allows to find the logarithm of any base of a number using
the logBase10 method to do it
@Param num1, this parameter represents an integer to which the logarithm will be taken, this parameter must be greater than zero
@Param base, this parameter represents an integer number representing the base of the logarithm, this parameter must be greater than zero
@return this method returns an integer representing the whole base logarithm N of a number
*/
		  
		 public static double logBaseN(double num1, int base){
			 double result;
				 String number = "";
				 int aux = 0;
				 
				for(int i = 1; num1 >= base; i++){
				num1 /= base;
				aux = i;
				}
				number = String.valueOf(aux) + ".";
				for(int i = 0;i <= 5;i++){
					num1 = potencyN(num1,base);
					if(num1 < base){
						aux = 0;
					}
					for(int j = 1; num1 >= base; j++){
						num1 = num1/base;
						aux = j;
					}
					number = number + String.valueOf(aux);
				}
				result = Double.parseDouble(number);
				 return result;
			 }
/**
<p> des: <p> Receive two numbers, this method allows you to take the root N of a number using equal power
@Param num1, this parameter represents a decimal number to which the root will be taken, if the second parameter is even this number must be positive
@Param n, this parameter represents a positive integer which will be the root of parameter num1
@return this method returns a decimal number that represents
*/
		 public static double rootN(double num1, int n){
			 double result;
			 result = Math.pow(num1,((double)1/n));
			 return result;
		 }
/**
<p> des: <p> Receive two numbers one decimal and one integer, this method allows to draw any positive integer power from a number
@Param num1, this parameter represents a decimal number which represents the base of the operation
@Param n, this parameter represents a positive integer to which the exponent to the caul represents the base is elvado
@return this number returns the decimal power of parameter num1 elvado to parameter n
*/
		 public static double potencyN(double num1, int n){
			 double result=num1, aux = 0;
			 for(int i = 2;i <= n;i++){
				 result = (result*num1);
			 } 
			 if(n == 0){
				 result = 1;
			 }
			 return result;
		 }
		 
	 }