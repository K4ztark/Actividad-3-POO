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
        saldo += cantidad;
        numero_consignaciones++;
    }

    public void retirar(float cantidad) {
        float nuevoSaldo = saldo - cantidad;
        if (nuevoSaldo >= 0) {
            saldo -= cantidad;
            numretiros = numretiros + 1;
        } else {
            System.out.println("La cantida a retirar excede el saldo actual");
        }
    }

    public void calcularinteres() {
        float tasamensual=tasaAnual/12;
        float interesmensual=saldo*tasamensual;
        saldo+=interesmensual;
    }

    public void extractoMensual() {
        saldo-=comisionMensual;
        calcularinteres();
    }

}
