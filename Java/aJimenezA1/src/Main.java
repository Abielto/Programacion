import java.util.Scanner;

public class Main
{


    void main() {

        /*
            Ejercicio 1: Escribe un programa que dé los “Buenos Dias”.
         */

        System.out.println("Buenos Días");

         /*
            Ejercicio 2: Escribe un programa que calcule y muestre el área de un cuadrado de lado igual a 5.
         */

        int lado = 5;
        int area = lado * lado;
        System.out.println("El area es: " + area);
            /*
              Ejercicio 3: Escribe un programa que calcule el área de un cuadrado
               cuyo lado se introduce por teclado.
            */
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce el lado");
        int lado2 = scan.nextInt();
        int area2 = lado2 * lado2;
        System.out.println("el área es: " + area2);

            /*
              Ejercicio 4: Escribe un programa que lea dos números, calcule y muestre el valor de sus suma, resta,
                           producto y división. .
            */
        scan = new Scanner(System.in);
        System.out.println("Dime el primer número");
        int numero1 = scan.nextInt();
        System.out.println("Dime el segundo número");
        int numero2 = scan.nextInt();
        System.out.println("La suma es: " + (numero1 + numero2));
        System.out.println("La resta es: " + (numero1 - numero2));
        System.out.println("La multiplicacion es: " + (numero1 * numero2));
        System.out.println("La division es: " + (numero1 / numero2));

            /*
              Ejercicio 5: Escribe un programa que toma como dato de entrada un número que corresponde a la
               longitud de un radio y nos escribe la longitud de la circunferencia, el área del círculo y el
               volumen de la esfera que corresponden con dicho radio.
            */

        scan = new Scanner(System.in);
        System.out.println("Introduce radio");
        int radio = scan.nextInt();
        System.out.println("La longitud es: " + (2 * Math.PI * radio));
        System.out.println("El área es es: " + (Math.PI * Math.pow(radio, 2)));
        System.out.println("El volumen es: " + (4 / 3.0) * Math.PI * Math.pow(radio, 3));


            /*
              Ejercicio 6. Escribe un programa que dado el precio de un artículo y el precio de venta real nos
              muestre el porcentaje de descuento realizado.
            */

        scan = new Scanner(System.in);
        System.out.println("Introduce el precio original");
        double precioOrigen = scan.nextInt();
        System.out.println("Introduce el precio final");
        double precioFinal = scan.nextInt();
        System.out.println("El porcentaje de descuento es: " + ((precioOrigen - precioFinal) / precioOrigen) * 100 + "%");

             /*
              Ejercicio 7. Escribe un programa que lea un valor correspondiente a una distancia en millas marinas
              y escriba la distancia en metros. Sabiendo que una milla marina equivale a 1.852 metros.
            */

        scan = new Scanner(System.in);
        System.out.println("Introduce millas");
        double millas = scan.nextDouble();
        System.out.println("son " + millas * 1852 + " metros");

            /*
              Ejercicio 8. Escribe un programa que lee dos números y los visualiza en orden ascendente.
            */

        scan = new Scanner(System.in);
        System.out.println("Introduce numero1");
        int numero11 = scan.nextInt();
        System.out.println("Introduce numero2");
        int numero22 = scan.nextInt();

        System.out.println("El numero mas peque es " + Math.min(numero11, numero22) + ", el numero mayor es " + Math.max(numero11, numero22));

            /*
              Ejercicio 9.  Escribe un programa que lee dos números y nos dice cuál es el mayor o si son iguales.
            */

        scan = new Scanner(System.in);
        System.out.println("introduce numero1");
        int primernumero = scan.nextInt();
        System.out.println("introduce numero2");
        int segundonumero = scan.nextInt();
        System.out.println("el número mayor es el número1" + (primernumero>segundonumero));
        System.out.println("Los números son iguales" + (primernumero==segundonumero));

            /*
             Ejercicio 10. Escribe un programa que lea tres números distintos y nos diga cuál es el mayor.
            */

        scan = new Scanner(System.in);
        System.out.println("introduce numero1");
        int numero111 = scan.nextInt();
        System.out.println("introduce numero2");
        int numero211 = scan.nextInt();
        System.out.println("interoduce numero3");
        int numero311 = scan.nextInt();
        Math.max(numero111, Math.max(numero211, numero311));
        System.out.println("Los números son iguales" + (primernumero==segundonumero));
        



            /*
             Ejercicio 11: Escribe un programa que lee dos números, calcula y muestra el valor de su suma, resta,
               producto y división. (Ten en cuenta la división por cero).
            */
    }

}
