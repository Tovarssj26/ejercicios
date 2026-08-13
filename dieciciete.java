/*Dados como datos el precio final pagado por un producto y su precio de venta al público (PVP), se
requiere que calcule y muestre el porcentaje de descuento que le ha sido aplicado.*/
public class dieciciete {
    public static void main(String[] args) {
        double precioFinal = 80.0; // Precio final pagado por el producto
        double pvp = 100.0; // Precio de venta al público

        double descuento = pvp - precioFinal;
        double porcentajeDescuento = (descuento / pvp) * 100;

        System.out.println("Porcentaje de descuento aplicado: " + porcentajeDescuento + "%");
        
    }
}
