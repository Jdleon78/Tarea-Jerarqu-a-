
package dispositivoelectronico;
public abstract class Computadora extends DispositivoElectronico {

    public Computadora(String marca, String modelo) {
        super(marca, modelo);
    }

    
    @Override
    public abstract void mostrarDetalles();
}
