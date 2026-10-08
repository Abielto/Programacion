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

        for (int i = 1; i <=200; i++ )
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
        double nota = nota1.nextInt();

        if (nota <=3)
        {
            System.out.println("Muy deficiente");
        }
        else if (nota <5)
        {
            System.out.println("Insuficiente");
        }
        else if (nota <=5 && nota <6 )
        {
            System.out.println("Suficiente");
        }
        else if (nota <=6 && nota < 7 )
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

         sc = new Scanner(System.in);


        int contador = 0;
        for (int i  = 1; i <= 10; i++ )
        {
            System.out.println("Introduce número no nulo " + i + ":");
            int numero = sc.nextInt();
            if (numero < 0)
            {
                contador++;
            }
            if (numero == 0)
            {
                IO.print("No se permiten números nulos ");
                break;

            }
        }

            if (contador <0)
            {
                System.out.println("Se han detectado números negativos");
            }else
            {

                System.out.println("No se han detectado números negativos");
            }






            /*Ejercicio 11. Realiza un programa que lea 10 números no nulos y luego muestre un mensaje
            indicando cuántos son positivos y cuantos negativos.*/


    sc = new Scanner(System.in);
        int positivos1 = 0;
        int negativos1 = 0;

        for (int i1  = 1; i1 <= 10; i1++ )
        {
            System.out.println("Introduce número " + i1+ ":");
            int numero1 = sc.nextInt();

            if (numero1 < 0)
            {
                negativos1++;
            }else {
                positivos1++;
            }
        }
        System.out.println("Positivos: " + positivos1);
        System.out.println("Negativos: " + negativos1);

        /*Ejercicio12.  Realiza un programa que lea una secuencia de números no nulos hasta que se introduzca
        un 0, y luego muestre si ha leído algún número negativo, cuantos positivos y cuantos
        negativos*/

        int positivos2 = 0;
        int negativos2 = 0;
        int contador2 = 0;
        int numero2 = 0;

        System.out.println("Introduce los números que quieras. Introduce 0 para terminar");

        do
        {
            numero2 = sc.nextInt();
            if (numero2 > 0)
            {
                positivos2++;
            } if(numero2 < 0) {
                negativos2++;
                contador2++;
        }
        } while (numero2 != 0);
        System.out.println("Positivos: " + positivos2);
        System.out.println("Negativos: " + negativos2);
        if (contador2 > 0)
        {
            System.out.println("Se han detectado números negativos");
        }else {

            System.out.println("No se han detectado números negativos");
        }
        /*Ejercicio13. Realiza un programa que calcule y escriba la suma y el producto de los 10 primeros
            números naturales.*/

        double suma = 0;
        double producto =1;
        for (int i = 1; i <= 10; i++ )
        {
            suma = suma + i;
            producto = producto * i;
        }
        System.out.println("Suma: " + suma);
        System.out.println("Producto: " + producto);

        /*Ejercicio14.. Escribe un programa que calcula el salario neto semanal de un trabajador en función del
        número de horas trabajadas y la tasa de impuestos de acuerdo a las siguientes hipótesis:.*/

        sc = new Scanner(System.in);

        System.out.println("Introduce tu nombre");
        String nombre = sc.next();

        System.out.println("Introduce tus horas trabajadas");
        int horasTrabajadas = Math.abs(sc.nextInt());

        System.out.println("Introduce la tarifa por hora");
        int tarifa = sc.nextInt();

        double salarioBruto;

        if (horasTrabajadas >= 35)
        {
            salarioBruto = (horasTrabajadas *tarifa);
        }else {

           salarioBruto = (35 * tarifa) +  ((horasTrabajadas - 35) * tarifa * 1.5);
        }

        double impuestos;
        if (salarioBruto <=500)
        {
            impuestos = 0;
        }else if (salarioBruto <= 900) {
            impuestos = (salarioBruto -500) * 0.25;
        }else{
            impuestos = (400 * 0.25) + (salarioBruto - 900) * 0.45 ;
        }
        double salarioNeto = salarioBruto - impuestos;
        System.out.println("Nombre: " + nombre);
        System.out.println("Impuestos: " + impuestos);
        System.out.println("Salario Bruto: " + salarioBruto);
        System.out.println("Salario Neto: " + salarioNeto);

    }
}
