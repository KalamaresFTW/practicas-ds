package ejercicio3;

/**
 * @author pablo.aragunde (Pablo Aragunde Canabal)
 * @author p.costa (Pablo Costa Oubiña)
 */
public class CambioSimple implements Cambio {

    @Override
    public Monedero calcularCambio(Monedero m, int gasto) {
        Monedero cambio = new Monedero();
        Moneda moneda;
        m.ordenar();
        for (int i = 0; i < m.contarMonedas(); i++) {
            moneda = m.obtenerMoneda(i);
            if (gasto > 0) {
                gasto = gasto - moneda.getValor();
            } else {
                cambio.insertarMoneda(moneda);
            }
        }
        return cambio;
    }
}
