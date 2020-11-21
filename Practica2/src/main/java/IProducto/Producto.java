package IProducto;

import java.util.Scanner;

public class Producto implements Productos {

	private String NomproProducto, Categoria;
	private double Precio;

	Scanner leer = new Scanner(System.in);

	public Producto() {
		System.out.println("Aplicando Interface");
	}

	public String getNomproProducto() {
		return NomproProducto;
	}

	public void setNomproProducto(String nomproProducto) {
		NomproProducto = nomproProducto;
	}

	public String getCategoria() {
		return Categoria;
	}

	public void setCategoria(String categoria) {
		Categoria = categoria;
	}

	public double getPrecio() {
		return Precio;
	}

	public void setPrecio(double precio) {
		Precio = precio;
	}

	@Override
	public void Captura() {
		System.out.print("Ingrese el Nombre del Producto: ");
		NomproProducto = leer.nextLine();
		System.out.print("Ingrese la Categoria del Producto: ");
		Categoria = leer.nextLine();
		System.out.print("Ingrese el Precio del Producto: ");
		Precio = leer.nextDouble();
	}

	@Override
	public double CalcularEnvio() {
		return Precio + 2.00;
	}

	@Override
	public void Mostrar() {
		System.out.println("Nombre del Producto: " + NomproProducto);
		System.out.println("Categoria del Producto: " + Categoria);
		System.out.println("Precio del Producto: " + Precio);
		System.out.println("Costo por Envio: " + CalcularEnvio());
	}

}
