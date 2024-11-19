package tienda1;

import java.util.List;

public class ClienteT1 {
	private Integer codigo;
	private String nombre;
	private List<ItemProducto> factura;
	
	public ClienteT1(Integer codigo, String nombre, List<ItemProducto> factura) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.factura = factura;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<ItemProducto> getFactura() {
		return factura;
	}

	public void setFactura(List<ItemProducto> factura) {
		this.factura = factura;
	}

	@Override
	public String toString() {
		return String.format("Cliente codigo: %s, nombre: %s, factura: %s", codigo, nombre, factura);
	}
		
}