public class CuentaAhorros extends Cuenta {
    private boolean activa;
    public CuentaAhorros(float saldo,float tasa) {
        super(saldo,tasa);
        if (saldo<10000){
            activa=false;
        }
        else{
            activa=true;
        }
    }
}
