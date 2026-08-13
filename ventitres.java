/*Suponga que a partir de una Tonelada de maíz una planta productora obtiene M kilogramos de
harina y N litros de aceite. La planta vende cada bulto de 24 paquetes de un kilogramo de harina en
Bs. B1 y cada caja de 15 envases de aceite en Bs. B2. Suponiendo que la planta vende todo lo que
produce, calcular el ingreso total por la venta de cada tonelada de maíz, sabiendo además que cada
kilogramo de harina y cada litro de aceite que restan del embalaje se venden al detal a los precios de
Bs. B3 y Bs. B4 respectivamente. Pruebe su algoritmo o programa con los sig. Valores: M=452,
N=197, B1=132, B2= 180, B3= 7,50 y B4= 14,50. Respuesta: 4895*/
public class ventitres {
public static void main(String[] args) {
    double M = 452; // Kilogramos de harina obtenidos por tonelada de maíz
    double N = 197; // Litros de aceite obtenidos por tonelada de maíz
    double B1 = 132; // Precio por bulto de harina (24 paquetes)
    double B2 = 180; // Precio por caja de aceite (15 envases)
    double B3 = 7.50; // Precio al detal por kilogramo de harina
    double B4 = 14.50; // Precio al detal por litro de aceite

    // Calcular el ingreso total por la venta de cada tonelada de maíz
    double ingresoHarina = (M / 24) * B1 + (M % 24) * B3; // Ingreso por harina
    double ingresoAceite = (N / 15) * B2 + (N % 15) * B4; // Ingreso por aceite

    double ingresoTotal = ingresoHarina + ingresoAceite;

    System.out.println("Ingreso total por la venta de cada tonelada de maíz: " + ingresoTotal + " Bolívares");    
}
}