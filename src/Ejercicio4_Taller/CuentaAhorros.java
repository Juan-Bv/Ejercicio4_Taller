package Ejercicio4_Taller;

public class CuentaAhorros extends Cuenta {
    private double tasaInteres; // Creé esta variable para almacenar la tasa de interés de la cuenta
    private double comisionMensual; // Creé esta variable para almacenar la comisión mensual

    // Constructor que inicializa los atributos de la cuenta de ahorros
    public CuentaAhorros(String titular, double saldo, double tasaInteres) {
        super(titular, saldo); // Llamé al constructor de la clase padre para inicializar los atributos heredados
        this.tasaInteres = tasaInteres; // Asigné la tasa de interés
        this.comisionMensual = 0.0; // Inicialicé la comisión mensual en 0
    }

    // Método que aplica la tasa de interés al saldo
    public void aplicarInteres() {
        /*
           Profesor, en este método calculé el interés multiplicando el saldo por la tasa de interés.
           Luego, aumenté el saldo con el interés calculado y mostré la tasa de interés aplicada.
        */
        double interes = saldo * tasaInteres; // Calculé el interés
        saldo += interes; // Aumenté el saldo con el interés
        System.out.printf("Tasa de interés = %.2f\n", tasaInteres); // Imprimí la tasa de interés aplicada
    }

    // Método que muestra el saldo y otros atributos de la cuenta de ahorros
    @Override
    public void mostrarSaldo() {
        /*
           Profesor, en este método llamé al método mostrarSaldo de la clase padre para imprimir el saldo.
           Luego, mostré la comisión mensual y el número de transacciones realizadas.
        */
        super.mostrarSaldo(); // Llamé al método de la clase padre para mostrar el saldo
        System.out.println("Comisión mensual = $ " + comisionMensual); // Imprimí la comisión mensual
        System.out.println("Número de transacciones = " + transacciones); // Imprimí el número de transacciones
    }
}