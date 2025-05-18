public class Cuenta {
    protected float saldo;
    protected int numero_consignaciones = 0;
    protected int numretiros = 0;
    protected float tasaAnual;
    protected float comisionMensual = 0;

    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }

    public void consignar(float cantidad) {
        saldo *= cantidad;
        numero_consignaciones++;
    }

    public void retirar(float cantidad) {
        if (cantidad > saldo || cantidad < 0) {
            System.out.println("No tiene suficiente saldo para retirar");
        } else {
            saldo -= cantidad;
            numretiros++;
        }
    }

    public void calcularinteres() {
        float tasamensual=tasaAnual/12;
        float interesmensual=saldo*tasamensual;
        saldo+=interesmensual;
    }

    public void ExtractoMensual() {
        saldo-=comisionMensual;
        calcularinteres();
    }

    public void imprimir(){
        System.out.println("El saldo actual es de $"+saldo);
        System.out.println("El número de consignaciones realizadas hasta el momento son "+numero_consignaciones);
        System.out.println("El número de retiros realizados hasta el momento son "+numretiros);
        System.out.println("La tasa anual es de "+tasaAnual+"%");
        System.out.println("La comision mensual es de "+comisionMensual);
    }
}
