package co.edu.mision_tic.oscar_rincon.reto2_recuperacion;

public class CafeNacional extends Cafe {
    private Boolean TOSTADO=false;
    private Boolean tostado;
	
    public CafeNacional() {
		this.precioBase = PRECIO_BASE;
        this.peso = PESO_BASE;
        this.calidadC = CALIDAD_C_BASE;
		this.tostado=TOSTADO;
		this.tipoCafe="nacional";
	}

	public CafeNacional(Double precioBase, Integer peso) {
		super(precioBase, peso);
		this.tostado=TOSTADO;
		this.tipoCafe="nacional";
	}

	public CafeNacional(Double precioBase, Integer peso, Character calidadC, Boolean tostado) {
		super(precioBase, peso, calidadC);
		this.tostado = tostado;
		this.tipoCafe="nacional";
	}

	@Override
	public Double calcularPrecio() {
		// TODO Auto-generated method stub
		Double adicion=0.0;
		if (this.tostado==true) {
			adicion+=50;
		}
		return super.calcularPrecio()+adicion;
	}
	
    

    
}
