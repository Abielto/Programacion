import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        /*Ejercicio1. Escribe un programa que pide la edad por teclado y nos muestra el mensaje de “Eres
        mayor de edad” solo si lo somos.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce edad, entre 0 y 120");
        int edad1 = sc.nextInt();


        if (edad1 < 0 || edad1 > 120)
        {
            System.out.println("Fuera de rango, introduce una edad válida");
        }

        else if (edad1>=18)
        {
            System.out.println("Eres mayor de edad");

        }

        /*Ejercicio2. Escribe un programa que pide la edad por teclado y nos muestra el mensaje de “Eres
        mayor de edad” solo si lo somos.*/

        Scanner ej2= new Scanner(System.in);
        System.out.println("Introduce edad, entre 0 y 120");
        int edad2 = sc.nextInt();


         if (edad2 < 0 || edad2 > 120)
        {
            System.out.println("Fuera de rango, introduce una edad válida");
        }

         else if (edad2>=18)
         {
             System.out.println("Eres mayor de edad");
         }

        else
        {
            System.out.println("Eres menor de edad");
        }

        /*Ejercicio3. Realiza un programa que muestre por pantalla los 20 primeros números naturales (1, 2,
           3... 20)...*/

        for (int i = 0; i <=20; i++ )
        {
           System.out.println(i);
        }

        /*Ejercicio4. Realiza un programa que muestre los números pares comprendidos entre el 1 y el 200.
        Para ello utiliza un contador y suma de 2 en 2.*/

        for (int i = 0; i <=200; i = i+2 )
        {
            System.out.println(i);
        }

         /*Ejercicio5. Realiza un programa que muestre los números pares comprendidos entre el 1 y el 200.
          Esta vez utiliza un contador sumando de 1 en 1. */

        for (int i = 0; i <=200; i++ )
        {

            if (i % 2 == 0)
            {
                System.out.println(i);
            }
        }

        /*Ejercicio6. Realiza un programa que muestre los números desde el 1 hasta un número N que se
        introducirá por teclado.*/

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Introduce un número");
        int num = sc2.nextInt();
        for (int i = 0; i <= num; i++ )
        {
            System.out.println(i);
        }

        /*Ejercicio7. Escribe un programa que lea una calificación numérica entre 0 y 10 y la transforma en
        calificación alfabética, escribiendo el resultado.*/

        Scanner nota1 = new Scanner(System.in);
        System.out.println("¿Qúe nota has sacado?");
        int nota = nota1.nextInt();

        if (nota <=3)
        {
            System.out.println("Muy deficiente");
        }
        else if (nota <5)
        {
            System.out.println("Insuficiente");
        }
        else if (nota ==5)
        {
            System.out.println("Suficiente");
        }
        else if (nota ==6)
        {
            System.out.println("Bien");
        }
        else if (nota <9)
        {
            System.out.println("Notable");
        }
        else if (nota <=10)
        {
            System.out.println("Sobresaliente");
        }
        else
        {
         System.out.println("Esa nota no es válida, se evalúa del 1 al 10");
        }

        /*Ejercicio8. Realiza un programa que lea un número positivo N y calcule y visualice su factorial*/

        Scanner factorial = new Scanner(System.in);
        System.out.println("Introduce NÚMERO");
        int n = factorial.nextInt();

        if (n < 0)
        {
            System.out.println("Ese número no es válido");
        } else{
            double factorial1 = 1;
            for (int i = 1; i <= n; i++ )
            {
                factorial1 = factorial1 * i;
            }
            System.out.println("Factorial: " + factorial1);
        }

        /*Ejercicio9. Escribe un programa que recibe como datos de entrada una hora expresada en horas,
        minutos y segundos que nos calcula y escribe la hora, minutos y segundos que serán,
        transcurrido un segundo.*/

        Scanner horas1 = new Scanner(System.in);

        System.out.println("Introduce hora");
        int hora = horas1.nextInt();

        System.out.println("Introduce minuto");
        int minuto = horas1.nextInt();

        System.out.println("Introduce segundo");
        int segundo = horas1.nextInt();

        segundo++;

        if (hora <0 || hora >24 || minuto <0 || minuto>59 || segundo < 0 || segundo > 59)
        {
            System.out.println("Hora no válida");
        }

        if (segundo == 60)
        {
            segundo = 0;
            minuto++;
        }
        if (minuto == 60)
        {
            minuto = 0;
            hora++;
        }
        if (hora == 24)
        {
            hora = 0;
        }

        System.out.println("La hora dentro de un segundo será: " +  hora + ":" + minuto + ":" + segundo );

        /*Ejercicio10. Realiza un programa que lea 10 números no nulos y luego muestre un mensaje de si ha
        leído algún número negativo o no.*/

        Scanner negativos = new Scanner(System.in);



    }
}
