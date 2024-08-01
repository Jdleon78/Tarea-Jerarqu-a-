package dispositivoelectronico;

public class Refrigerador extends Electrodomestico {
    private int capacidadLitros;

    public Refrigerador(String marca, String modelo, int capacidadLitros) {
        super(marca, modelo);
        this.capacidadLitros = capacidadLitros;
    }

    public int getCapacidadLitros() {
        return capacidadLitros;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Refrigerador - Marca: " + getMarca() + ", Modelo: " + getModelo() +
                           ", Capacidad: " + capacidadLitros + " litros");
    }
}