package co.edu.mision_tic.oscar_rincon.reto2_recuperacion;

public class PrecioTotal {
    private Double totalCafe = 0d;
    private Double totalCafeNacional = 0d;
    private Double totalCafeExportacion = 0d;

    // constructor
    public PrecioTotal(Cafe[] pListaCafe) {
        for (int i = 0; i < pListaCafe.length; i++) {
            totalCafe += pListaCafe[i].calcularPrecio();
            if (pListaCafe[i].tipoCafe.equals("nacional")) {
                totalCafeNacional += pListaCafe[i].calcularPrecio();
            } else if (pListaCafe[i].tipoCafe.equals("exportacion")) {
                totalCafeExportacion += pListaCafe[i].calcularPrecio();
            }
        }
    }

    public void mostrarTotales() {
        // Código
        System.out.println("La suma del precio del café es de " + totalCafe);
        System.out.println("La suma del precio del café tipo nacional es de " + totalCafeNacional);
        System.out.print("La suma del precio del café tipo exportación es de " + totalCafeExportacion);
    }

}
