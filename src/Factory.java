import transportes.Bicicleta;
import transportes.Camion;
import transportes.ITransporte;

public class Factory {
    public static final int CAMION = 1;
    public static final int BICICLETA = 2;
    public static Integer cp = null;
    public static Float dimensionX = null;
    public static Float dimensionY = null;
    public static Float dimensionZ = null;
    public static Float peso = null;
    /**
     * Devuelve producto del tipo de la Interface
     * @param type 1: consola, 2:ventana
     * @return producto segun el tipo
     */
    public static ITransporte getProducto(int type) {
        cp = PedirDatos.getInt("Teclee tu CP");
        dimensionX = PedirDatos.getFloat("Teclee a dimensionX");
        dimensionY = PedirDatos.getFloat("Teclee a dimensionY");
        dimensionZ = PedirDatos.getFloat("Teclee a dimensionZ");
        peso = PedirDatos.getFloat("Teclee o peso");
        switch (type) {
            // tipo consola
            case CAMION:
                return new Camion(cp, dimensionX, dimensionY, dimensionZ, peso);
            // tipo ventana
            case BICICLETA:
                return new Bicicleta(cp, dimensionX, dimensionY, dimensionZ, peso);
            // otro tipo
            default:
                return null;
        }
    }
}
