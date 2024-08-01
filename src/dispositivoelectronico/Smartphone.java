
package dispositivoelectronico;
public class Smartphone extends DispositivoMovil {

    public Smartphone(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Smartphone - Marca: " + getMarca() + ", Modelo: " + getModelo());
    }
}