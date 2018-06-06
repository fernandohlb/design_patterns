package composite;

public class Cliente {

	public static void main(String[] args) {
		
		ArquivoComponent minhaPasta = new ArquivoComponente("Minha Pasta Raiz");
		ArquivoComponent meuVideo = new ArquivoVideo("meu_video.avi");
		ArquivoComponent meuOutroVideo = new ArquivoVideo("seriesS01E01.mkv");
		
		try {
			
			meuVideo.adicionar(meuOutroVideo);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			minhaPasta.adicionar(meuVideo);
			minhaPasta.adicionar(meuOutroVideo);
			minhaPasta.printNomeDoArquivo();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			System.out.println("Pesquisando Arquivos...");
			minhaPasta.getArquivo(meuVideo.getNomeArquivo());
			
			System.out.println("Removendo Arquivos...");
			minhaPasta.remover(meuVideo.getNomeArquivo());
			minhaPasta.printNomeDoArquivo();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
