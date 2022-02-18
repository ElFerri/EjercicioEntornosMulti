/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioentornosmulti;

/**
 *
 * @author fersan
 */
public class EjercicioEntornosMulti {

    /**
     * Método multiplica para multiplicar los numeros
     *
     * @param a Simboliza un numero que podra ser escrito por el usuario
     * @param b Simboliza el numero escrito por el usuario
     * @return Devuelve el numero multiplicado
     */

    public static int multiplica(int a, int b) {
        return a * b;

    }

    /**
     * Método main
     *
     * @param args Argumentos linia de comandos
     */
    public static int factorial(int numero) {
        int factorial = numero;
        if (numero < 0) {
            throw new IllegalArgumentException("Factorial Negativo");
        }
        for (int i = (numero - 1); i > 1; i--) {
            factorial = factorial * 1;
        }
        return factorial;
    }

    /**
     * Método factorial
     *
     * @param args Argumento linia de comandos
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

}
