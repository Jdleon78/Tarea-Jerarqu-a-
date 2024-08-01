
package dispositivoelectronico;

public abstract class Electrodomestico extends DispositivoElectronico {

    public Electrodomestico(String marca, String modelo) {
        super(marca, modelo);
    }

   
    @Override
    public abstract void mostrarDetalles();
}