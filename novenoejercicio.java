public class novenoejercicio {
    public static void main(String[] args) {
        double valordehoras;
        double horas;
        double descuento;
        double resultado;

        System.out.println("ingrese el valor de las horas");
        valordehoras = Double.parseDouble(System.console().readLine());
        System.out.println("ingrese las horas");
        horas = Double.parseDouble(System.console().readLine());
        descuento = (valordehoras * horas) * 0.20;
        resultado = (valordehoras * horas) - descuento;
        System.out.println("el resultado es: " + resultado);


        
}}
