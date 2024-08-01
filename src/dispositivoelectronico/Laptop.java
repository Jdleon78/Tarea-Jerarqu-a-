
package dispositivoelectronico;
public class Laptop extends Computadora {

    public Laptop(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Laptop - Marca: " + getMarca() + ", Modelo: " + getModelo());
    }
}