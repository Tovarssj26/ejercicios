public class septimoejercicio {
    public static void main(String[] args) {
        double metros;
        double pies;
        double pulgadas;

        System.out.println("ingrese los metros");
        metros = Double.parseDouble(System.console().readLine());
        pies = metros * 3.28084;
        pulgadas = metros * 39.3701;
        System.out.println("los metros en pies son: " + pies);
        System.out.println("los metros en pulgadas son: " + pulgadas);
        

}}
