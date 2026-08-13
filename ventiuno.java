/*Un mayorista compra a un agricultor un lote de X naranjas a Bs. Y la docena. Después de vender
todas las naranjas a los detallistas, obtiene Bs. K. Calcular el porcentaje de ganancia obtenida en la
inversión. Pruebe su programa con los siguientes valores: X=48000, Y=6, K=42000 para obtener 75%
como resultado.*/
public class ventiuno {
public static void main(String[] args) {
    double cantidadNaranjas;
    double precioPorDocena;
    double totalCompra;
    double totalVenta;
    double ganancia;
    double porcentajeGanancia;

    System.out.println("Ingrese la cantidad de naranjas compradas:");
    cantidadNaranjas = Double.parseDouble(System.console().readLine());

    System.out.println("Ingrese el precio por docena (en Bolívares):");
    precioPorDocena = Double.parseDouble(System.console().readLine());

    System.out.println("Ingrese el total de venta obtenida (en Bolívares):");
    totalVenta = Double.parseDouble(System.console().readLine());

    totalCompra = (cantidadNaranjas / 12) * precioPorDocena;
    ganancia = totalVenta - totalCompra;
    porcentajeGanancia = (ganancia / totalCompra) * 100;

    System.out.println("El porcentaje de ganancia obtenida es: " + porcentajeGanancia + "%");    
}  


}
