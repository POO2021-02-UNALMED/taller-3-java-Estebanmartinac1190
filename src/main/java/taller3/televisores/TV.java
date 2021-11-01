package taller3.televisores;

public class TV {
	//ATRIBUTOS 
	
	private Marca marca;
	private int canal=1;
	private int precio=500;
	private boolean estado;
	private int volumen=1;
	private Control control;
	private static int numeroTV;
	
	//CONTRUCTOR
	
	public TV(Marca marca, boolean estado) {
		this.marca= marca;
		this.estado = estado;	
		TV.numeroTV++;
	}
	
	//METODOS GET(RETORNO)
	
	public Marca getMarca() {
		return marca;
	}
	
	public Control getControl() {
		return control;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public int getVolumen() {
		return volumen;
	}
	
	public int getCanal() {
		return canal;
	}
	
	public static int getNumeroTV() {
		return numeroTv;
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	
	//METODOS SET(CAMBIAR EL ESTADO DE LAS VARIABLES)
	
	public void setMarca(Marca marca ) {
		this.marca = marca;
	}
	
	public void setControl(Control control) {
		this.control = control;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public void setVolumen(int volumen) {
		if ((volumen>=0) && (volumen<=7) && estado ) {
			this.volumen=volumen;
		}
		else 
			return;
	}
	
	public void setCanal(int canal) {
		if ((canal>=1) && (canal<=120) && estado) {
			this.canal = canal;
		}
		else 
			return;
	}
	
	public static void setNumeroTV(int numeroTV) {
		TV.numeroTV = numeroTV;
	}
	
	
	//METODOS ADICIONALES 
	
	
	public void turnOn() {
		this.estado = true;
	}
	
	public void turnOff() {
		this.estado = false;
	}
	
	public void canalUp() {
		setCanal(getCanal()+1);
	}
	
	public void canalDown() {
		setCanal(getCanal()-1);
	}
	
	public void volumenUp() {
		setVolumen(getVolumen()+1);
	}
	
	public void volumenDown() {
		setVolumen(getVolumen()-1);
	}
