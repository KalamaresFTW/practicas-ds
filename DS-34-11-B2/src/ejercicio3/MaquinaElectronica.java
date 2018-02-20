package ejercicio3;

/**
 * @author pablo.aragunde (Pablo Aragunde Canabal)
 * @author p.costa (Pablo Costa Oubiña)
 */
public class MaquinaElectronica {

    private Monedero monedas;
    private Cambio cambio;
    private Producto producto;

    public MaquinaElectronica(Monedero monedas, Cambio cambio, Producto producto) {
        this.monedas = monedas;
        this.cambio = cambio;
        this.producto = producto;
    }

    public Monedero comprar() {
        int gasto = producto.getValor();
        Monedero vuelta = cambio.calcularCambio(monedas, gasto);
        monedas.vaciarMonedero();
        return vuelta;
    }

    public Monedero cancelar() {
        Monedero aux = monedas;
        monedas = new Monedero();
        return aux;
    }

//<editor-fold defaultstate="collapsed" desc="getters/setters">
    public Monedero getMonedas() {
        return monedas;
    }

    public void setMonedas(Monedero monedas) {
        this.monedas = monedas;
    }

    public Cambio getCambio() {
        return cambio;
    }

    public void setCambio(Cambio cambio) {
        this.cambio = cambio;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
//</editor-fold>

}
