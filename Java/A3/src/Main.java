import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {

        /*Ejercicio1.  Realiza un programa que dada una cantidad de euros que el usuario introduce por
        teclado (múltiplo de 5 €) mostrará los billetes de cada tipo que serán necesarios para
        alcanzar dicha cantidad (utilizando billetes de 500, 200, 100, 50, 20, 10 y 5). Hay que
        indicar el mínimo de billetes posible. Por ejemplo, si el usuario introduce 145 el
        programa indicará que será necesario 1 billete de 100 €, 2 billetes de 20 € y 1 billete de
        5 € (no será válido por ejemplo 29 billetes de 5, que aunque sume 145 € no es el mínimo
        número de billetes posible).*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce x euros");
        int cantidad = sc.nextInt();
        int billetes500 = 0;
        int billetes200 = 0;
        int billetes100 = 0;
        int billetes50 = 0;
        int billetes20 = 0;
        int billetes10 = 0;
        int billetes5 = 0;


        if (cantidad >=500)
        {
        billetes500 = cantidad / 500;
        cantidad = cantidad % 500;
        }
        if (cantidad >=200)
        {
            billetes200 = cantidad / 200;
            cantidad = cantidad % 200;
        }
        if (cantidad >=100)
        {
            billetes100 = cantidad / 100;
            cantidad = cantidad % 100;
        }
        if (cantidad >=50)
        {
            billetes50 = cantidad / 50;
            cantidad = cantidad % 50;
        }

        if (cantidad >=20)
        {
        billetes20 = cantidad / 20;
        cantidad = cantidad % 20;
        }
        if (cantidad >=10)
        {
            billetes10 = cantidad / 10;
            cantidad = cantidad % 10;
        }
        if (cantidad >=5)
        {
            billetes5 = cantidad / 5;
            cantidad = cantidad % 5;
        }
        System.out.println("Para la cantidad establecida hacen falta estos billetes:");
        System.out.println("Billetes de 500: " + billetes500 + " Billetes de 200: " + billetes200 + " Billetes de 100: " + billetes100 + " Billetes de 50: " + billetes50 + " Billetes de 20: " + billetes20 + " Billetes de 10: " + billetes10 + " Billetes de 5: " + billetes5);
        System.out.println("Sobran: " + cantidad + "€");

        /*Ejercicio2*/
        sc = new Scanner(System.in);

        System.out.println("Introduce número 1");
        System.out.println("Introduce número 2");
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        int opcion;
        do
        {
            System.out.println("Elige una opción: 1: Sumar, 2: Restar, 3: Multiplicar 4: Dividir, 5: Salir");

            switch  (opcion = sc.nextInt())
                {
                    case 1: System.out.println(numero1 + numero2);
                    break;
                    case 2: System.out.println(numero1 - numero2);
                    break;
                    case 3: System.out.println(numero1 * numero2);
                    break;
                    case 4:
                        if (numero2 ==0)
                        {
                            System.out.println("No puedes dividir entre 0 ");
                        }else {
                            System.out.println(numero1 / numero2);
                        }
                    break;
                    case 5: /*cortar*/
                    break;
                    default: System.out.println("Esa opción no es correcta");
                    break;

                }
        }while (opcion != 5);
    }
}

