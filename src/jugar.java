import java.util.Scanner;

public class jugar {
    private Scanner entrada =new Scanner(System.in);
    private boolean juegoActivo =true;

    public void jugarJuego()
    {
        String nombre = obtenerNombreJugador();

        while (juegoActivo)
        {
            int intentos = 0;
            int al = obtenerNumeroAleatorio ();

            System.out.printf("%s, he escogido un número entre 1 y 100, adivínalo\n", nombre);

            int num;

            do
            {
                num = entrada.nextInt();

                mensaje(num, al);

                intentos++;
            } while (num != al);

            System.out.printf("Hasn ganado, intentos %d", intentos, "\n");

            juegoActivo = jugarNuevamente ();
        }
    }

    private int obtenerNumeroAleatorio ()
    {
        return (int) Math.round(Math.random() * 100);
    }

    private String obtenerNombreJugador()
    {
        System.out.println("Hola, 'cual es tu nombre?");
        String nombre = entrada.next();
        System.out.printf("Bienvenido %s, vamos a iniciar\n", nombre);
        return nombre;
    }

    private int escogerNumero ()
    {
        System.out.println("Escoge un número");
        return entrada.nextInt();
    }

    private void mensaje (int num, int al)
    {
        if (num < al)
        {
            System.out.println("Muy bajo, adivina otra vez");
        }
        else if (num > al)
        {
            System.out.println("Muy alto, adivina otra vez");
        }
    }

    public boolean jugarNuevamente()
    {
        System.out.println("\n¿Jugar nuevamente?\n1. Si\n 2. No");
        int respuesta = entrada.nextInt();
        if (respuesta==1)
        {
            System.out.println("Genial, juguemos otra vez");
            return true;
        }
        else
        {
            System.out.println("Fin del juego, gracias por participar");
            return false;
        }
    }
}
