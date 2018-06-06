package composite;

public abstract class ArquivoComponent {
	
	String nomeArquivo;
	
	public void printNomeDoArquivo(){
		System.out.println(this.nomeArquivo);
	}
	
	public String getNomeArquivo() {
		return nomeArquivo;
	}
	
	public void adicionar(ArquivoComponent novoArquivo) throws Exception {
		throw new Exception("nao pode inserir arquivos em " + this.nomeArquivo + " - nao e uma pasta");
	}
	
	public void remover(String nomeArquivo) throws Exception {
		throw new Exception("nao pode remover arquivos em " + nomeArquivo + " - nao e uma pasta");
	}
	
	public ArquivoComponent getArquivo(String nomeArquivo) throws Exception {
		throw new Exception("nao pode pesquisar arquivos em " + this.nomeArquivo + " - nao e uma pasta");
	}

}
