package Iterator;


public class IteratorMatrizDeCanais implements IteratorInterface{

	protected Canal[] matriz;
	protected int contador;
	
	public IteratorMatrizDeCanais(Canal[] matriz) {
		this.matriz = matriz;
	}
	
	@Override
	public void first() {
		contador = 0;
		
	}

	@Override
	public void next() {
		contador++;
		
	}

	@Override
	public boolean isDone() {
		return contador == matriz.length;
	}

	@Override
	public Canal currentItem() {
		if(isDone()){
			contador = matriz.length-1;
		} else if(contador < 0){
			contador=0;
		}
		
		return matriz[contador];
	}

}
