package produtojdbc;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import util.Conexao;

public class Principal {
	public static void main(String[] args) throws ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		/*
		Eletronico el1 = new Eletronico("El02", "TV Philips", 1800.48, "Philips", 6);
		if (el1.incluirEletronico()) {
			JOptionPane.showMessageDialog(null, "Produto Incluído com Sucesso");
		}
		
		System.out.println("Informe o produto para alterar");
		var vCodigo = sc.next();
		System.out.println("Informe o novo nome");		
		var vNome = sc.next();
		System.out.println("Informe o novo preço");		
		var vPreco = sc.nextDouble();
		System.out.println("Informe a nova marca");		
		var vMarca = sc.next();		
		System.out.println("Informe a nova garantia(meses)");		
		var vGarantia = sc.nextInt();		

		// alterando produto e eletronico
		Eletronico e2 = new Eletronico(vCodigo, vNome, vPreco, vMarca, vGarantia);
		if (e2.alterarEletronico()) {
			System.out.println("Alteracao efetuada com sucesso");
		} else {
			System.out.println("Problemas na alteracao. Verifique mensagens");
		}
		*/
		// listar todos os produtos
		Eletronico e1 = new Eletronico();
		List<Produto> listaProdutos =  new ArrayList<>();
		listaProdutos = e1.listarProdutos();
		for (Produto p : listaProdutos) {
			System.out.println("Código....: " + p.getCodigo());
			System.out.println("Nome......: " + p.getNome());
			System.out.println("Preço.....: " + p.getPreco());
			System.out.println("-----------------------------");
		}
		/*
		// consultar um produto especifico
		Produto p = new Produto();		
		System.out.print("Informe o produto para consultar : ");
		var pCodigo = sc.next();
		p = e1.consultarProduto(pCodigo);
		System.out.println("Código....: " + p.getCodigo());
		System.out.println("Nome......: " + p.getNome());
		System.out.println("Preço.....: " + p.getPreco());
		*/
		System.out.println("Informe um produto para excluir");
		var vCodigo = sc.next();
		Eletronico e2 = new Eletronico();
		e2.setCodigo(vCodigo);
		if (e2.excluirEletronico()) {
			System.out.println("Produto excluido com sucesso");
		} else {
			System.out.println("problemas na exclusao do produto");
		}
	}
}
