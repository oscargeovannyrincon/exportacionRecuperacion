package co.edu.mision_tic.oscar_rincon.reto2_recuperacion;

public class CafeExportacion extends Cafe {
    private Integer CIF_BASE = 20;
    private Boolean VERDE = false;
    private Integer cif;
    private Boolean verde;

    public CafeExportacion() {
        this.precioBase = PRECIO_BASE;
        this.peso = PESO_BASE;
        this.calidadC = CALIDAD_C_BASE;
        this.cif = CIF_BASE;
        this.verde = VERDE;
        this.tipoCafe = "exportacion";
    }

    public CafeExportacion(Double precioBase, Integer peso) {
        super(precioBase, peso);
        this.calidadC = CALIDAD_C_BASE;
        this.cif = CIF_BASE;
        this.verde = VERDE;
        this.tipoCafe = "exportacion";
    }

    public CafeExportacion(Double precioBase, Integer peso, Character calidadC, Integer cif, Boolean verde) {
        super(precioBase, peso, calidadC);
        this.cif = cif;
        this.verde = verde;
        this.tipoCafe = "exportacion";
    }

    @Override
    public Double calcularPrecio() {
        // TODO Auto-generated method stub
        Double adicion = 0d;
        if (verde == true) {
            adicion += 50;
        }
        if (cif > 40) {
            adicion += this.precioBase * 0.3;
        }
        return super.calcularPrecio() + adicion;
    }

}
