package aplicacao;

import java.util.Date;

import entidades.Pedido;
import entidades.enums.StatusPedido;

public class Programa {

	public static void main(String[] args) {
		
	Pedido pedido = new Pedido(01, new Date(), StatusPedido.AGUARDANDO_PAGAMENTO);
	
	System.out.print(pedido);

	}

}
