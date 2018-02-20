package ejercicio3;

/**
 * @author pablo.aragunde (Pablo Aragunde Canabal)
 * @author p.costa (Pablo Costa Oubiña)
 */
public class CambioDeposito implements Cambio {

    private static Monedero seleccionarMonedas(int cantidad) {
        Monedero cambio = new Monedero();
        Moneda[] maux = Moneda.values();
        loop:
        while (cantidad > 0) {
            Moneda m;
            for (int i = 0; i < Moneda.values().length; i++) {
                m = maux[i];
                if (cantidad % m.getValor() == 0) {
                    cambio.insertarMoneda(m);
                    cantidad -= m.getValor();
                    continue loop;
                }
            }
        }
        return cambio;
    }

    @Override
    public Monedero calcularCambio(Monedero m, int gasto) {
        int cambio = m.valorMonedero() - gasto;
        return seleccionarMonedas(cambio);
    }

}
