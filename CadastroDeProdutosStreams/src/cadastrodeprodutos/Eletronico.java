package cadastrodeprodutos;

public class Eletronico extends Produto {
	private String marca;
	private int    garantia_meses;
	
	public Eletronico(String codigo, String nome, double preco, String marca, int garantia_meses) {
		super(codigo, nome, preco);
		this.marca          = marca;
		this.garantia_meses = garantia_meses;
	}
	
	public void exibir_informacoes() {
		super.exibir_informacoes();
		System.out.println("Marca.........: " + this.marca);
		System.out.println("Garantia......: " + this.garantia_meses);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getGarantia_meses() {
		return garantia_meses;
	}

	public void setGarantia_meses(int garantia_meses) {
		this.garantia_meses = garantia_meses;
	}

	
}
