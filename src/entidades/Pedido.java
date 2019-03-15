package entidades;

import java.util.Date;

import entidades.enums.StatusPedido;

public class Pedido {
	
	int id;
	Date data;
	StatusPedido status;
	
	public Pedido(){
		
	}
	public Pedido(int id, Date data, StatusPedido status) {
		this.id = id;
		this.data = data;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public StatusPedido getStatus() {
		return status;
	}
	public void setStatus(StatusPedido status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Pedido [id=" + id + ", data=" + data + ", status=" + status + "]";
	}
	
	
	

}
