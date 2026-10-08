import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
        sc = new Scanner(System.in);
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
    }
}
