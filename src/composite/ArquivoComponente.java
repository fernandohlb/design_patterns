package composite;

import java.util.ArrayList;

public class ArquivoComponente extends ArquivoComponent{

	ArrayList<ArquivoComponent> arquivos = new ArrayList<ArquivoComponent>();
	
	public ArquivoComponente(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}
	
	@Override
	public void printNomeDoArquivo() {
		System.out.println(this.nomeArquivo);
		for (ArquivoComponent arquivoComponent : arquivos) {
			arquivoComponent.printNomeDoArquivo();
		}
	}

	@Override
	public void adicionar(ArquivoComponent novoArquivo) throws Exception {
		arquivos.add(novoArquivo);
	}

	@Override
	public void remover(String nomeArquivo) throws Exception {
		for (ArquivoComponent arquivoComponent : arquivos) {
			if(arquivoComponent.getNomeArquivo().equals(nomeArquivo)) {
				this.arquivos.remove(arquivoComponent);
				return;
			}
		} 
		throw new Exception("nao existe este arquivo");
	}

	@Override
	public ArquivoComponent getArquivo(String nomeArquivo) throws Exception {
		
		for (ArquivoComponent arquivoComponent : arquivos) {
			if(arquivoComponent.getNomeArquivo().equals(nomeArquivo)) {
				return arquivoComponent;
			}
		}
		throw new Exception("nao existe este arquivo");
		
	}
	
	

}
