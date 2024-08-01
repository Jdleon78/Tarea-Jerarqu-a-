
package dispositivoelectronico;

public class Desktop extends Computadora {

    public Desktop(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Desktop - Marca: " + getMarca() + ", Modelo: " + getModelo());
    }
}
