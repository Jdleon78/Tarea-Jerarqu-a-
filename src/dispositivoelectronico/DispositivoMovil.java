
package dispositivoelectronico;

public abstract class DispositivoMovil extends DispositivoElectronico {

    public DispositivoMovil(String marca, String modelo) {
        super(marca, modelo);
    }

    
    @Override
    public abstract void mostrarDetalles();
}