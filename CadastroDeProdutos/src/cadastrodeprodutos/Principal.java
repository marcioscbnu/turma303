package cadastrodeprodutos;

public class Principal {
	public static void main(String[] args) {
		// declaracao do Scanner para entrada de dados
		Scanner sc = new Scanner(System.in);
		
		// declaracao de variaveis
		int opcaoMenu, opcaoProduto;
		
		// variaveis de Produto
		String codigo;  
		String nome;    
		double preco;   
 
		// variaveis de Eletronico
		String marca;          
		int    garantia_meses; 
		
		// variaveis de Roupa
		
		// variaveis de Alimento
		
		
		// declaracao dos arraylist's
		ArrayList<Eletronico> arrele = new ArrayList<>();
		ArrayList<Roupa>      arrrou = new ArrayList<>();
		ArrayList<Alimento>   arrali = new ArrayList<>();
		
		// laço de repetição que mantem o programa no ar até o usuário informar 9 = fim
		do {
			// entrada de dados
			montarMenu();
			System.out.println("Informe a sua opcao : ");
			opcaoMenu = sc.nextInt();
			
			if (opcaoMenu == 9) {
				System.out.println("Obrigado por utilizar o nosso programa");
				break;
			} else {
				System.out.println("1 -Eletronico 2 - Roupa 3 - Alimento");
			}
			opcaoProduto = sc.nextInt();
			
			// testa opcao e começa a ativar as operações conforme o produto escolhido
			switch (opcaoMenu) {
				case 1: { // inclusao de produtos
							if (opcaoProduto == 1) { // usuario escolheu incluir Eletronico
								System.out.print("Codigo : ");
								codigo = sc.next();
								System.out.print("\nNome.: ");
								nome   = sc.next();
								System.out.print("\nPreco: ");
								preco  = sc.nextDouble();
								
								System.out.print("\nMarca: ");
								marca = sc.next();
								System.out.print("\nGarantia: ");
								garantia_meses = sc.nextInt();
								// instanciando a classe para enviar os dados para a classe e 
								// em seguida armazenar no arraylist
								Eletronico e1 = new Eletronico(codigo, nome, preco, marca, garantia_meses);
								arrele.add(e1);
								break;								
							} else if (opcaoProduto == 2) { // usuario escolheu incluir Roupa
								   }else {// usuario escolheu incluir Alimento
									   
								   }

					    }
				case 2: { // alteracao de produtos
							if (opcaoProduto == 1) { // alterar eletronico
								System.out.println("Informe o código do produto");
								codigo = sc.next();
								boolean encontrado = false;
		                        if (produtoEncontrado.isPresent()) {		
								for (int i = 0; i < arrele.size(); i++) {
								    if (arrele.get(i).getCodigo().equals(codigo)) { 
								        System.out.println("Achei o código na posição " + i);
								        encontrado = true;
								        // pega os dados da ocorrência do arraylist
								        nome           = arrele.get(i).getNome();
								        preco          = arrele.get(i).getPreco();
								        marca          = arrele.get(i).getMarca();
								        garantia_meses = arrele.get(i).getGarantia_meses();
								        
								        // entrada de dados para alterar valores no araylist
								        System.out.print("\nNome.: ");
										nome   = sc.next();
										System.out.print("\nPreco: ");
										preco  = sc.nextDouble();
										
										System.out.print("\nMarca: ");
										marca = sc.next();
										System.out.print("\nGarantia: ");
										garantia_meses = sc.nextInt();
								        Eletronico e1 = new Eletronico(codigo, nome, preco, marca, garantia_meses);
								        arrele.set(i, e1);
								        break;
								    }
								}

								if (!encontrado) {
								    System.out.println("Código não encontrado.");
								}
							}
							
							break;
			    }
				case 3: { // exclusao de produtos
						if (opcaoProduto == 1) { // excluir eletronico
							System.out.println("Informe o código do produto");
							codigo = sc.next();
							boolean encontrado = false;
							for (int i = 0; i < arrele.size(); i++) {
							    if (arrele.get(i).getCodigo().equals(codigo)) { 
							        arrele.remove(i);
							        encontrado = true;
							        break;
							    }
							}

							if (!encontrado) {
							    System.out.println("Código não encontrado.");
							}
						}
						break;
				}
				case 4: { // listar produtos
							for (Eletronico ele : arrele) {
								ele.exibir_informacoes();
							}
							break;
			    }
			}
			
		} while (opcaoMenu != 9);
		sc.close();
	}
	
	public static void montarMenu(){
		System.out.println("********* MENU *************");
		System.out.println("*                          *");
		System.out.println("* 1 - Incluir 2 - Alterar  *");
		System.out.println("*                          *");
		System.out.println("* 3 - Excluir 4 - Listar   *");
		System.out.println("*          9 - Fim         *");
		System.out.println("****************************");
	}
	
}
