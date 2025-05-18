public class CuentaCorriente extends Cuenta{
    float sobregiro;
    public CuentaCorriente(float saldo, float tasa) {
        super(saldo, tasa);
        sobregiro=0;
    }
    public void retirar(float cantidad){
        float result=saldo-cantidad;
        if(result<0){
            sobregiro-=cantidad;
            saldo=0;
        }
        else{
            super.retirar(cantidad);
        }
    }
    public void consignar(float cantidad){
        float residuo=sobregiro-cantidad;
        if(sobregiro>0){
            if(residuo>0){
                sobregiro=0;
                saldo=residuo;
            }
            else{
                sobregiro-=residuo;
                saldo=0;
            }
        }else{
            super.consignar(cantidad);
        }

    }
    public void extractoMensual(){
        super.extractoMensual();
    }

    public void imprimir() {
        System.out.println("Saldo = $" + saldo);
        System.out.println("Cargo mensual = $" + comisionMensual);
        System.out.println("Número de transacciones =" + (numero_consignaciones + numretiros));
        System.out.println("Valor de sobregiro = $" + (numero_consignaciones + numretiros));
        System.out.println();
    }
}

