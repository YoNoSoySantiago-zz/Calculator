// esta clase tiene los metodos que requieren de solo un parametro para operar
public class Operation1{
		 // sucesion de Tylor
/**
<p> des: <p> receives a decimal number, this method allows you to calculate the sine of a number using Taylor's sequence to give an approximate value of sine
@Param num1, this parameter represents decimal number which must be entered as in radian format
@return this method returns a decimal number showing the sine it represents
*/
		 public static double seno(double num1){
			 double result = 0;
			 for(int i = 1;i <= 7; i++){
				int fact = 1;
				int j = 1;
				while(j<=(1+(2*(i-1)))){
					fact = fact*j;
					j++;
				}
				if(i % 2 == 0){
					result = result - (Operation2.potencyN(num1,(1+(2*(i-1))))/fact);
				}else{result = result + (Operation2.potencyN(num1,(1+(2*(i-1))))/fact);
					
				}
			 }
			 
			 return result;
		 }
		 // identidad Trygonometrica
/**
<p> des: <p> receives a decimal number, this method allows to calculate the cosine of a number using the Taylor sequence 7 to give an approximate value to cosine
@Param num1, this parameter represents decimal number which must be entered as in radian format
@return this method returns a decimal number showing the cosine of the number it represents
*/
		 public static double coseno(double num1){
		 
			 double result = 0;
			 for(int i = 1;i <= 7; i++){
				int fact = 1;
				int j = 1;
				while(j<=((2*(i-1)))){
					fact = fact*j;
					j++;
				}
				if(i % 2 == 0){
					result = result - (Operation2.potencyN(num1,((2*(i-1))))/fact);
				}else{result = result + (Operation2.potencyN(num1,((2*(i-1))))/fact);
					
				}
			 }
			 return result;
		 }
/**
<p> des: <p> receives a decimal number, this method allows to calculate the tangent of a number using the trygonometric equality of the tangent to calculate it using the sine and cosine methods
<p> pre: <p> the sine and cosine methods must be able to receive a double number and transform it to their corresponding sine and cosine respectively, the result of the cosine method must be different from zero
@Param num1, this parameter represents decimal number which must be entered as in radian format
@return this method returns a decimal number showing the tengent of the number it represents
*/
			 public static double tangente(double num1){
				 double result;
				 result = seno(num1)/coseno(num1);
				 return result;
			 }
			 //formula de Newton
/**
<p> des: <p> receives a decimal number, this method allows you to calculate the square root of a number using Newton's formula to give the approximate value of the square root
@Param num1, this parameter represents decimal number which must be greater than zero
@return this method returns a decimal number showing the square root of the number it represents
*/
			 public static double root(double num1){
				 double result;
				 result = 1;
				 for(int i = 0;i < 25;i++){
					 result=result-((result*result-num1)/(2*result));
				 }
				 return result;
			 }
/**
<p> des: <p> receives a natural number, this method allows you to calculate the factorial of a number by multiplying all the natural numbers that exist as a result of it until
@Param num1, this parameter represents natural number
@return this method returns a natural number which represents the factorial of the corresponding number
*/ 	 
			 
			 public static double factorial(int num1){
				 double result = 1;
				 while ( num1!=0) {
                     result=result*num1;
                     num1--;
					 }
				return result;
			 } 
/**
<p> des: <p> receives a decimal number, this method allows to calculate the logBase10 of a number using a sequence of loops to digitize
@Param num1, this parameter represents decimal number which must be greater than zero
@return this method returns a decimal number showing the square root of the number it represents
*/	 
			 public static double logBase10(double num1){
				 double result;
				 String number = "";
				 int aux = 0;
				 
				for(int i = 1; num1 >= 10; i++){
				num1 /= 10;
				aux = i;
				}
				number = String.valueOf(aux) + ".";
				for(int i = 0;i <= 5;i++){
					num1 = Operation2.potencyN(num1,10);
					if(num1 < 10){
						aux = 0;
					}
					for(int j = 1; num1 >= 10; j++){
						num1 = num1/10;
						aux = j;
					}
					number = number + String.valueOf(aux);
				}
				result = Double.parseDouble(number);
				 return result;
			 }
			 

			 
	 }