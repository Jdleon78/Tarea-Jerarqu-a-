
package dispositivoelectronico;

public abstract class DispositivoElectronico {
    private String marca;
    private String modelo;

    public DispositivoElectronico(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public abstract void mostrarDetalles();
}