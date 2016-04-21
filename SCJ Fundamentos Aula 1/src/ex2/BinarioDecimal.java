package ex2;
public class BinarioDecimal {

    public String calculaBinario(int valor){
	 int quociente = calculaQuociente(valor);
	 int resto = calculaResto(valor);
	 StringBuilder resposta = new StringBuilder(String.valueOf(resto));
	 
	 while(quociente>0){
		 resto = calculaResto(quociente); 
		 quociente = calculaQuociente(quociente);
		 resposta = resposta.append(resto);
	 }
		return 	resposta.toString();
    }
	
	
	public int calculaQuociente(int valor){
		return valor/2;
	}
	
	public int calculaResto(int valor){
		return valor%2;
	
}
