/*Un comerciante de computadores ofrece P precio por compra al contado ó 12 cuotas de T Bolívares
cada una. Desarrolle un programa para calcular y mostrar cuál es el porcentaje que se cobra por el
recargo en el pago del computador por cuotas.*/
public class ventidos {
    public static void main(String[] args) {
        double precioContado;
        double cuotaMensual;
        double totalCuotas;
        double recargo;
        double porcentajeRecargo;

        System.out.println("Ingrese el precio por compra al contado (Bolívares):");
        precioContado = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese el valor de cada cuota mensual (Bolívares):");
        cuotaMensual = Double.parseDouble(System.console().readLine());

        totalCuotas = cuotaMensual * 12; // Total a pagar en 12 cuotas
        recargo = totalCuotas - precioContado; // Recargo por pagar en cuotas
        porcentajeRecargo = (recargo / precioContado) * 100; // Porcentaje de recargo

        System.out.println("El porcentaje de recargo por pagar en cuotas es: " + porcentajeRecargo + "%");
    }
    
}
