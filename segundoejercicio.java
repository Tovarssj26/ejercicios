public class segundoejercicio {
    public static void main(String[] args) {

        int mensualidad;
        int resultado;
    System.out.println("ingrese la mensualidad");
    mensualidad = Integer.parseInt(System.console().readLine());
    resultado = mensualidad * 2/100;
    System.out.println("el 2 de la mensualidad es: " + resultado);

    }
}
