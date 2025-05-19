package Inmuebles;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Prueba {
    public static void main(String[] args) {
        ApartamentoFamiliar apto1 = new ApartamentoFamiliar(103067, 120,
                "Avenida Santander 45-45", 3, 2, 200000);
        System.out.println("Datos apartamento:");
        apto1.calcularprecioventa(apto1.valor_area);
        apto1.imprimir();

        System.out.println("Datos apartamento:");
        Apartaestudio aptestudio1 = new Apartaestudio(
                12354, 50, "Avenida Caracas 30-15", 1, 1
        );
        aptestudio1.calcularprecioventa(aptestudio1.valor_area);
        aptestudio1.imprimir();
    }
}