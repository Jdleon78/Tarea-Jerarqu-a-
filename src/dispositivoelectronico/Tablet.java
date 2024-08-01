
package dispositivoelectronico;

public class Tablet extends DispositivoMovil {

    public Tablet(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Tablet - Marca: " + getMarca() + ", Modelo: " + getModelo());
    }
}