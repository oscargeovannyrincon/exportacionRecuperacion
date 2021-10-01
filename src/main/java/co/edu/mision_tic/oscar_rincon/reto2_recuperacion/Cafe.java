package co.edu.mision_tic.oscar_rincon.reto2_recuperacion;

public class Cafe {
    // valores por defecto
    protected Character CALIDAD_C_BASE = 'F';
    protected Double PRECIO_BASE = 100.0;
    protected Integer PESO_BASE = 5;
    protected Double precioBase;
    protected Integer peso;
    protected Character calidadC;
    protected String tipoCafe;

    // constructor vacio
    public Cafe() {
        this.precioBase = PRECIO_BASE;
        this.peso = PESO_BASE;
        this.calidadC = CALIDAD_C_BASE;
        this.tipoCafe = "cafe";
    }

    public Cafe(Double precioBase, Integer peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.calidadC = CALIDAD_C_BASE;
        this.tipoCafe = "cafe";
    }

    public Cafe(Double precioBase, Integer peso, Character calidadC) {
        this.precioBase = precioBase;
        this.peso = peso;
        comprobarCalidadC(calidadC);
        this.tipoCafe = "cafe";
    }

    public void comprobarCalidadC(Character calidadC) {
        if (calidadC >= 'A' && calidadC <= 'F') {
            this.calidadC = calidadC;
        } else {
            this.calidadC = CALIDAD_C_BASE;
        }

    }

    public Double calcularPrecio() {
        // codigo
        Double adicion = 0.0;
        if (this.calidadC == 'A') {
            adicion *= 10;
        } else if (this.calidadC == 'B') {
            adicion += 8;
        } else if (this.calidadC == 'C') {
            adicion += 6;
        } else if (this.calidadC == 'D') {
            adicion += 5;
        } else if (this.calidadC == 'E') {
            adicion += 3;
        } else
            adicion += 1;

        if (this.peso >= 0 && this.peso < 19) {
            adicion += 10;

        } else if (this.peso > 19 && this.peso < 49) {
            adicion += 50;
        } else if (this.peso > 49 && this.peso < 80) {
            adicion += 80;
        } else if (this.peso > 79) {
            adicion += 100;
        }

        return precioBase + adicion;

    }

}
