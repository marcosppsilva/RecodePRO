package principal;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente obj_cliente = new Cliente("Marcos Paulo", "13691493793", "935113477");
		Cliente obj_cliente2 = new Cliente("Patricia", "2457846986", "911454875");
		Vendedor vendedor01 = new Vendedor(1, "Gilmar", "9479985964");
		
		Pedido pedido = new Pedido();
		
		Pedido pedido2 = new Pedido(02, new Date(), obj_cliente2, vendedor01);
		
		
		pedido.setId(1);
		pedido.setCliente(obj_cliente);
		pedido.setData(new Date());
		pedido.setVendedor(vendedor01);
		
		System.out.println("Data Pedido: " + pedido.getData());
		System.out.println("ID Pedido: " + pedido.getId());
		System.out.println("Nome Cliente: " + pedido.getCliente().getNome());
		System.out.println("ID Vendedor: " + pedido.getVendedor().getId_vendedor());
		System.out.println("Vendedor: " + pedido.getVendedor().getNomeVendedor());
		
		System.out.println("====================================================");
		
		System.out.println("Data Pedido: " + pedido2.getData());
		System.out.println("ID Pedido: " + pedido2.getId());
		System.out.println("Nome Cliente: " + pedido2.getCliente().getNome());
		System.out.println("ID Vendedor: " + pedido2.getVendedor().getId_vendedor());
		System.out.println("Vendedor: " + pedido2.getVendedor().getNomeVendedor());
		
	}

}
