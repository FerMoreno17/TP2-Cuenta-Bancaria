package ar.edu.unlam.basica2.tp2;

public class Cuenta {
	private double cantidad;
	private String titular;
	
	public Cuenta (){
		this.cantidad=100;
		this.titular="Carlos";
	}
	public Cuenta (double cantidad, String titular){
		this.cantidad=cantidad;
		this.titular=titular;
	}
	
	 public void setNombre(String titular, double cantidad){
		  this.titular=titular;
		  this.cantidad=cantidad;
	 }
	 public String getNombre(){
		 return titular;
	 }
	 public double getSaldo(){
		return cantidad;
	 }
	 
	 public void ingresar(double cantidad){
		if(cantidad>0){
			this.cantidad+=cantidad;
		}	
	 }
	 public void retirar(double cantidad){
		 if(cantidad<this.cantidad){
			 this.cantidad-=cantidad;
			 if(this.cantidad<0){
				 this.cantidad=0;
			 }
		 }
	 }
}
