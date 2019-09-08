public class Operation2{
		 /**
		  <p> des: <p> recibe dos numeros en formato decimal, este metodo permite sumar dos numeros y devolver su resultado
		  @Param num1, este parametro representa un numero 
		  @Param num2, este parametro representa un nemero 
		  @return este metodo retorna la suma de los parametros
		 */
		 public static double suma(double num1,double num2){
				 
			 double result = 0;
			 result = num1 + num2;
			 return result;
		 }
		 /**
		  <p> des: <p> recibe dos numeros en formato decimal, este metodo permite restar dos numeros y devolver su resultado
		  @Param num1, este parametro representa un numero 
		  @Param num2, este parametro representa un nemero 
		  @return este metodo retorna la resta de los parametros
		  */ 
		 public static double resta(double num1,double num2){
			 double result;
			 result = num1 - num2;
			 return result;
		 }
		 /**
		  <p> des: <p> recibe dos numeros en formato decimal, este metodo permite multiplicar dos numeros y devolver su resultado
		  @Param num1, este parametro representa un numero 
		  @Param num2, este parametro representa un nemero 
		  @return este metodo retorna la multiplicacion de los parametros
		  */
		 public static double multiplicacion(double num1,double num2){
			 double result;
			 result = num1 * num2;
			 return result;
		 }
		 /**
		  <p> des: <p> recibe dos numeros en formato decimal, este metodo permite dividir dos numeros y devolver su resultado
		  @Param num1, este parametro representa un numero 
		  @Param num2, este parametro representa un nemero 
		  @return este metodo retorna la division de los parametros
		  */
		 public static double division(double num1,double num2){
			 double result;
			 result = num1 / num2;
			 return result;
		 }
		 /**
		  <p> des: <p> recibe dos numeros en formato decimal, este metodo permite encontrar el modulo(residuo) de dos numeros.
		  @Param num1, este parametro representa un numero 
		  @Param num2, este parametro representa un nemero
		  @return este metodo retorna el modulo de la division entre el parametro 1 el parametro 2
		  
		  */
		 public static double modulo(double num1,double num2){
			 double result;
			 result = num1 % num2;
			 return result;
		 }
		 /**
		  <p> des: <p> recibe dos numeros en formato decimal, este metodo permite econtrar el logaritmo de cualquier base de un numero utilizando 
		  el metodo logBase10 para hacerlo
		  @Param num1, este parametro representa un numero entero  al cual se le sacara el logaritmo
		  @Param base, este parametro representa un nemero entero que representa la base del logaritmo  
		  @return este metodo retorna un numero entero que representa el logaritmo entero de  base N de un numero
		  */
		  
		 public static double logBaseN(int num1, int base){
			 double result;
				 String numero = "";
				 int aux = 0;
				 
				for(int i = 1; num1 >= base; i++){
				num1 /= base;
				aux = i;
				}
				numero = String.valueOf(aux) + ".";
				for(int i = 0;i <= 5;i++){
					num1 = (short)potenciaN(num1,base);
					if(num1 < base){
						aux = 0;
					}
					for(int j = 1; num1 >= base; j++){
						num1 = num1/base;
						aux = j;
					}
					numero = numero + String.valueOf(aux);
				}
				result = Double.parseDouble(numero);
				 return result;
			 }
		 
		
		
		/**
		 <p> des: <p> Recibe dos numeros, este metodo permite sacar la raiz N del primer cualquier numero utilizando la igualdad de la potenciacion
		 @Param num1, este parametro representa un numero decimal al cual se le sacara la raiz
		 @Param n, este parametro representa un numero entero positivo el cual sera la raiz del  parametro num1
		 @return este metodo retorna un numero decimal que representa 
		 */
		 public static double raizN(double num1, int n){
			 double result;
			 result = Math.pow(num1,((double)1/n));
			 return result;
		 }
		 /**
		 <p> des: <p> Recibe dos numeros uno decimal y otro entero, este metodo permite sacar cualquier potencia entera positiva de un numero
		 @Param num1, este parametro representa un numero decimal el cual se le sacara la potencia 
		 @Param n, este parametro representa un numero entero positivo al cual sera elevado el parametro num1
		 @return este numero devuelve la potencia decimal del parametro num1 elvado al parametro n
		 */
		 public static double potenciaN(double num1, int n){
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