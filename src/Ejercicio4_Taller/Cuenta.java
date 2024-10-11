package Ejercicio4_Taller;

public class Cuenta {

    /*
       Profesor, utilicé el modificador de acceso 'protected' para las siguientes variables,
       de manera que puedan ser accedidas directamente por las subclases. Esto es útil
       en un contexto de herencia, donde otras clases como CuentaAhorros podrían necesitar
       acceder a estos atributos para su funcionamiento interno, sin hacerlos públicos 
       y mantener un control sobre el acceso a los datos.
    */
    protected String titular; // Creé esta variable para almacenar el nombre del titular de la cuenta
    protected double saldo; // Creé esta variable para almacenar el saldo de la cuenta
    protected int transacciones; // Creé esta variable para contar el número de transacciones realizadas

    // Constructor que inicializa los atributos de la cuenta
    public Cuenta(String titular, double saldo) {
        this.titular = titular; // Asigné el nombre del titular
        this.saldo = saldo; // Asigné el saldo inicial de la cuenta
        this.transacciones = 0; // Inicialicé el contador de transacciones en 0
    }

    // Método para depositar dinero en la cuenta
    public void depositar(double cantidad) {
        saldo += cantidad; // Aumenté el saldo con la cantidad depositada
        transacciones++; // Incrementé el contador de transacciones
        System.out.println("Ingresar cantidad a consignar: $" + cantidad); // Imprimí la cantidad depositada
    }

    // Método para retirar dinero de la cuenta
    public void retirar(double cantidad) {
        /*
           Profesor, en este método verifiqué si hay suficiente saldo en la cuenta para realizar el retiro.
           Si el saldo es suficiente, resté la cantidad del saldo y aumenté el contador de transacciones.
           Si no hay suficiente saldo, mostré un mensaje de error.
        */
        if (saldo >= cantidad) {
            saldo -= cantidad; // Disminuí el saldo con la cantidad retirada
            transacciones++; // Incrementé el contador de transacciones
            System.out.println("Ingresar cantidad a retirar: $" + cantidad); // Imprimí la cantidad retirada
        } else {
            System.out.println("Saldo insuficiente para retirar."); // Mensaje de error si el saldo es insuficiente
        }
    }

    // Método que muestra el saldo actual de la cuenta
    public void mostrarSaldo() {
        System.out.printf("Saldo = $ %.3f\n", saldo); // Imprimí el saldo formateado a 3 decimales
    }

    // Método que devuelve el número de transacciones realizadas
    public int getTransacciones() {
        return transacciones; // Retorné el número de transacciones
    }
}