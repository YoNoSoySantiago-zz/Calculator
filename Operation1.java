public class Operation1{
		 // sucesion de Tylor
		 /**
		 <p> des:<p> recibe un numero decimal, este metodo permite calcular el seno de un numero utilizando la sucesion de Tylor 
	     <p> pre: <p> Los metodos potenciaN y factorial ya deben funcionar con cualquier numero real
		 @Param num1, numero decimal en formato Haxadecimal al cual se le sacara el seno correspondiente
		 @return este metodo retorna un numero decimal que representa al seno del parametro num1
		 */
		 public static double seno(double num1){
			 double result = 0;
			 for(int i = 0;i < 5; i++){
				 result += (Operation2.potenciaN(num1,(2*i + 1)))/factorial(2*i + 1);
			 }
			 return result;
		 }
		 // identidad Trygonometrica
		 /**
		 <p> des <p> Recibe un numero decimal en formato hexadecimal, este metodo permite encontrar el coseno de un numero
		 @Param num1 este parametro representa un numero decimal
		 @return este metodo retorna un numero decimal que representa el valor del coseno de un numero
		 */
		 public static double coseno(double num1){
		 double result;
			 num1 = 1 - (seno(num1)*seno(num1));
				 
				 result = raiz(num1);
				 return result;	 
			 }
			 public static double tangente(double num1){
				 double result;
				 result = seno(num1)/coseno(num1);
				 return result;
			 }
			 //formula de Newton
			 public static double raiz(double num1){
				 double result;
				 result = 1;
				 for(int i = 0;i < 25;i++){
					 result=result-((result*result-num1)/(2*result));
				 }
				 return result;
			 }// no entender
			 public static double base10(double num1){
				 double result = 0;
				return result;
			 }
			 public static double factorial(int num1){
				 double result = 1;
				 while ( num1!=0) {
                     result=result*num1;
                     num1--;
					 }
				return result;
			 } 
			 public static double logBase10(double num1){
				 double result;
				 String numero = "";
				 while(num1 >= 10){
					 num1 = num1/10;
				 }
				 numero = String.valueOf(num1) +",";
				 for(int i = 0;i < 5; i++){
					 while(num1 >= 10){
						 num1 = num1/10;
					 }
					 numero = numero + String.valueOf(num1);
					 num1 = (int) Operation2.potenciaN(num1,10);
				 }
				 result = Integer.parseInt(numero);
				 return result;
			 }
			 public static double[] memoria(double num1,double memoria[]) {
				 double aux1,aux2;
				 double result[] = memoria;
				 aux1 = result[0];
				 result[0] = num1;
				 for(int i = 1; i < result.length; i++) {
					 aux2 = result[i];
					 result[i] = aux1;
					 aux1 = aux2;
				 }
				 return result;
				 
			 }
			 
			 
	 }