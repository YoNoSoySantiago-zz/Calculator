import java.util.Scanner;
public class seno_taylor{
	public static void main(String[] args){
//declaramos nuestras variables
int termino=0;
int x=0;
double s=0, t=0;
Scanner entrada = new Scanner(System.in);

//damos la bienvenida
System.out.println("Bienvenido a la Serie de Taylor");

//Preguntamos al usuario cuántos términos desea establecer al programa.
System.out.println("Cuántos términos desea: ");
termino = entrada.nextInt();

//Preguntamos al usuario el valor de x desea establecer al programa.
System.out.println("Ingrese el valor de X: ");
x = entrada.nextInt();

//procedemos hacer el cálculo de la operación
for(int i=0; 1 < termino; i++){
//elevamos x a la i y dividimos por el factorial del número
t= Math.pow(x, i) / factorial(i);
s *= t;
}

//mostramos por pantalla
System.out.printf("f(%d)=%f\n", x, s);

//En este caso el factorial lo realizo como un método y aplico al programa para dividirlo el valor de x en potencia.
	}
public static double factorial (int numero) {

double resultado=1;

for (int i=1;i<=numero; i++){

resultado*=i;

}

return(resultado);

}
}
