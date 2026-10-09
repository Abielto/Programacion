import java.util.Arrays;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /*
        double[] numeros = new double[10];
        for (int i = 0; i < 10; i++)
        {
            IO.println("Introduce número " + (i + 1) + ":");
            numeros[i] = sc.nextDouble();
        }
        for (int i = 0; i < 10; i++)
        {
            IO.print(numeros[i] + " ");
        }

        //Ejercicio 2
        /*sc = new Scanner(System.in);
        int[] n = new int[10];
        int suma = 0;
        for (int i = 0; i < 10; i++)
        {
            IO.println("Introduce número " + (i + 1) + ":");
            n[i] = sc.nextInt();
        }
        for (int i = 0; i < n.length; i++)
        {
            suma = suma + n [i];
        }
        IO.println(suma);

         /*

        //Ejercicio3
        sc = new Scanner(System.in);
        double[] n1 = new double[10];
        for (int i1 = 0; i1 < n1.length; i1++)
        {
            IO.println("Introduce un número");
            n1[i1] = sc.nextDouble();
        }
        double maximo = n1[0];
        double minimo = n1[0];

        for (int i1 = 1; i1 < n1.length; i1 ++)
        {
            if (n1[i1] > maximo)
            {
                maximo = n1[i1];
            }
            if (n1[i1] < minimo)
            {
                minimo = n1[i1];
            }
        }
        IO.println("El mínimo es: " + minimo);
        IO.println("El máximo es: "  + maximo);
        */



    /*
        //Ejercicio4
        double[] n4 = new double[20];
        double negativos = n4[0];
        double positivos = n4[0];
        double sumaPos = 0;
        double sumaNeg = 0;
        sc = new Scanner(System.in);

        for (int i = 0; i < n4.length; i++)
        {
            IO.println("Introduce un número");
            n4[i] = sc.nextDouble();
            if (n4[i] < 0)
            {
                sumaNeg = sumaNeg + n4[i];
            }
            if (n4[i] >= 0)
            {
                sumaPos = sumaPos + n4[i];
            }
        }
        IO.println("Suma de negativos: " + sumaNeg);
        IO.println("Suma de positivos: " + sumaPos);
        */
        /*
        //Ejercicio5
        sc = new Scanner(System.in);
        int[] n = new int[20];
        int suma = 0;
        double media=0;
        for (int i = 0; i < 10; i++)
        {
            IO.println("Introduce número " + (i + 1) + ":");
            n[i] = sc.nextInt();
        }
        for (int i = 0; i < n.length; i++)
        {
            suma = suma + n [i];
            media = suma/n.length;
        }
        IO.println(suma);
        IO.println(media);
        */
        /*
        //Ejercicio6
        sc = new Scanner(System.in);
        int N = 0;
        int M = 0;
        IO.println("Introduce el tamaño que quieras que tenga el array");
        N = sc.nextInt();
        IO.println("Introduce lo que quieras que se escriba en el array");
        M = sc.nextInt();
        double [] tamanoArray = new double[N];

        Arrays.fill(tamanoArray, M);

        for (int i = 0; i < tamanoArray.length; i++)
        {
            IO.println(tamanoArray[i]);
        }
        */
        /*
        //Ejercicio 7
         sc = new Scanner(System.in);

        IO.println("Introduce P (Valor desde el que se parte):");
        int p = sc.nextInt();

        IO.println("Introduce Q (Valor al que se llega):");
        int q = sc.nextInt();

        int[] valores = new int[q - p +1];

        for (int i = 0; i < valores.length; i++)
        {
            valores[i] = p + i;
        }

        for (int i = 0; i < valores.length; i++)
        {
            IO.println(valores[i]);
        }
        */
        //Ejercicio8
        double aleatorio[Math.random();] = new double[100]:
    }
}
