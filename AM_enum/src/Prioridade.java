
public enum Prioridade {
	MIN(1),NORMAL(9),MAX(5);
	
	private int valor;
	Prioridade(int valor){
		this.valor = valor;
	}

	public int getValor() {
		return this.valor;
	}
}
