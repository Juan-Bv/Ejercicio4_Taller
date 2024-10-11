package Ejercicio4_Taller;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creé un objeto Scanner para leer la entrada del usuario

        System.out.println("Cuenta de ahorros"); // Imprimí un mensaje de inicio para la cuenta de ahorros
        System.out.print("Ingrese saldo inicial = $ "); // Pedí al usuario que ingrese el saldo inicial
        double saldoInicial = scanner.nextDouble(); // Leí el saldo inicial ingresado

        System.out.print("Ingrese tasa de interés = "); // Pedí al usuario que ingrese la tasa de interés
        double tasaInteres = scanner.nextDouble(); // Leí la tasa de interés ingresada

        // Creé el objeto CuentaAhorros con el saldo inicial y la tasa de interés proporcionados
        CuentaAhorros cuenta = new CuentaAhorros("Juan Barros", saldoInicial, tasaInteres);

        // Instrucciones para el usuario
        System.out.print("Ingresar cantidad a consignar: $"); // Pedí al usuario que ingrese una cantidad a depositar
        double cantidadDepositar = scanner.nextDouble(); // Leí la cantidad a depositar
        cuenta.depositar(cantidadDepositar); // Llamé al método para depositar la cantidad en la cuenta

        System.out.print("Ingresar cantidad a retirar: $"); // Pedí al usuario que ingrese una cantidad a retirar
        double cantidadRetirar = scanner.nextDouble(); // Leí la cantidad a retirar
        cuenta.retirar(cantidadRetirar); // Llamé al método para retirar la cantidad de la cuenta

        cuenta.aplicarInteres(); // Llamé al método para aplicar el interés a la cuenta
        cuenta.mostrarSaldo(); // Mostré el saldo y detalles de la cuenta de ahorros

        scanner.close(); // Cerré el scanner para evitar fugas de recursos
    }
}