/*En un hospital rural existen tres áreas: Ginecología, Pediatría y Traumatología. El presupuesto anual
del hospital se reparte conforme a la siguiente tabla:
Área Porcentaje del presupuesto
Ginecología 40%
Traumatología 30%
Pediatría 30%

Obtener la cantidad de dinero que recibirá cada área, para cualquier monto presupuestado.*/
public class diecinueve {
 public static void main(String[] args) {
     double presupuestoAnual = 1000000.0; // Monto presupuestado del hospital
     double porcentajeGinecologia = 0.40; // Porcentaje para Ginecología
     double porcentajeTraumatologia = 0.30; // Porcentaje para Traumatología
     double porcentajePediatria = 0.30; // Porcentaje para Pediatría

     double montoGinecologia = presupuestoAnual * porcentajeGinecologia; // Monto para Ginecología
     double montoTraumatologia = presupuestoAnual * porcentajeTraumatologia; // Monto para Traumatología
     double montoPediatria = presupuestoAnual * porcentajePediatria; // Monto para Pediatría

     System.out.println("Monto asignado a Ginecología: " + montoGinecologia + " Bolívares");
     System.out.println("Monto asignado a Traumatología: " + montoTraumatologia + " Bolívares");
     System.out.println("Monto asignado a Pediatría: " + montoPediatria + " Bolívares");
 }   
}
