import transportes.ITransporte;

public class Main {

    static ITransporte obxT;//es objeto, despues se iguala con un new NombreClase
    public static void main(String[] args) {
        Float coste = null;
        String tipo = null;
        Integer nTipo = null;

        int numero = PedirDatos.getInt("Como quieres que te lo entregen:\n1->Camion\n2->Bicicleta");
        switch (numero){
            case 1:
                obxT = Factory.getProducto(1);
                coste = obxT.costeTotal(Factory.cp);
                nTipo = obxT.tipoEmbalaje(Factory.dimensionX,Factory.dimensionY,Factory.dimensionZ,Factory.peso);
                break;
            case 2:
                obxT = Factory.getProducto(2);
                coste = obxT.costeTotal(Factory.cp);
                nTipo = obxT.tipoEmbalaje(Factory.dimensionX,Factory.dimensionY,Factory.dimensionZ,Factory.peso);
                break;
        }
        if(nTipo==null && coste==null){
            System.out.println("Opcion incorrecta, saliendo del programa");
        }
        else {
            if (nTipo == 0) {
                tipo = "palet";
            }
            else if (nTipo == 1) {
                tipo = "caja de madera";
            }
            else {
                tipo = "caja de carton";
            }
            System.out.println("Coste de envio: " + coste + " tipo de embalaje: " + tipo);
        }

    }
}
