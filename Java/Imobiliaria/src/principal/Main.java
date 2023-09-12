package principal;

import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int valor1, valor2, contapar;
		
		valor1 = 2;
		valor2 = 5;
		contapar = 0;
		
		for(int i = valor2; i >= valor1; i--) {
			if(i % 2 == 0) {
				contapar++;
			}
		}
		System.out.println(contapar);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Calendar calendario = Calendar.getInstance();
		calendario.set(2028, Calendar.SEPTEMBER, 10);
		Date vencimento01 = calendario.getTime();
		calendario.set(2026, Calendar.FEBRUARY, 12);
		Date vencimento02 = calendario.getTime();
		calendario.set(2025, Calendar.SEPTEMBER, 20);
		Date vencimento03 = calendario.getTime();
		
		calendario.set(2028, Calendar.SEPTEMBER, 11);
		Date saida01 = calendario.getTime();
		calendario.set(2026, Calendar.FEBRUARY, 13);
		Date saida02 = calendario.getTime();
		calendario.set(2025, Calendar.SEPTEMBER, 21);
		Date saida03 = calendario.getTime();
		
		
		Cliente cliente01 = new Cliente(01, "Marcos Paulo Pinto da Silva", "PF", "Rua Joao Mayrink, 151", "99887-9158", "mppkurt@gmail.com");
		Cliente cliente02 = new Cliente(02, "Ramon Avelar de Jesus", "PF", "Travessa circular, 15", "97847-1528", "ramonuber@gmail.com");
		Cliente cliente03 = new Cliente(03, "Escola de Condução Merces", "PJ", "Rua Patriotas, 24", "2197-2364", "conducaomerces@gmail.com");
		
		Imovel imovel01 = new Imovel(01, 250000, "Aluguel", "Rua de Cima, 43", "João Mário");
		Imovel imovel02 = new Imovel(02, 180000, "Aluguel", "Rua de Baixo, 18", "Júlio Verne");
		Imovel imovel03 = new Imovel(03, 145000, "Aluguel", "Rua da Estação, 145", "Vasco da Gama");
		
		Contrato contrato01 = new Contrato(1, cliente03, imovel01, "Imóvel", "Sim", "Grupo Direção Livre", 1450, 80, vencimento01, new Date(), saida01);
		Contrato contrato02 = new Contrato(2, cliente01, imovel03, "Dinheiro", "Sim", "Fabiano Pinto da Silva", 780, 40, vencimento02, new Date(), saida02);
		Contrato contrato03 = new Contrato(3, cliente02, imovel02, "Dinheiro", "Não", "Paulo Largado", 750, 30, vencimento03, new Date(), saida03);
		
		System.out.println("================================================");
		System.out.println("Nº Contrato: " + contrato01.getCodigo_contrato());
		System.out.println("Cliente: " + contrato01.getCliente().getNome_cliente());
		System.out.println("Endereço Imovóvel: " + contrato01.getImovel().getEndereco_imv());
		System.out.println("Valor Aluguel R$" + contrato01.getValorAluguel());
		System.out.println("Valor Taxa Adm R$" + contrato01.getTaxaAdm());
		System.out.println("Início de Contrato: " + contrato01.getDataEntrada());
		System.out.println("Vencimento: " + contrato01.getData_vencimento());
		System.out.println("================================================");
		
		System.out.println("================================================");
		System.out.println("Nº Contrato: " + contrato02.getCodigo_contrato());
		System.out.println("Cliente: " + contrato02.getCliente().getNome_cliente());
		System.out.println("Endereço Imovóvel: " + contrato02.getImovel().getEndereco_imv());
		System.out.println("Valor Aluguel R$" + contrato02.getValorAluguel());
		System.out.println("Valor Taxa Adm R$" + contrato02.getTaxaAdm());
		System.out.println("Início de Contrato: " + contrato02.getDataEntrada());
		System.out.println("Vencimento: " + contrato02.getData_vencimento());
		System.out.println("================================================");
		
		System.out.println("================================================");
		System.out.println("Nº Contrato: " + contrato03.getCodigo_contrato());
		System.out.println("Cliente: " + contrato03.getCliente().getNome_cliente());
		System.out.println("Endereço Imovóvel: " + contrato03.getImovel().getEndereco_imv());
		System.out.println("Valor Aluguel R$" + contrato03.getValorAluguel());
		System.out.println("Valor Taxa Adm R$" + contrato03.getTaxaAdm());
		System.out.println("Início de Contrato: " + contrato03.getDataEntrada());
		System.out.println("Vencimento: " + contrato03.getData_vencimento());
		System.out.println("================================================");
		
*/
	}

}
