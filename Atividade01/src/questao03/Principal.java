package questao03;

public class Principal {

	public static void main(String[] args) {
		char[] gabarito = new char[5];
		gabarito[0] = 'a';
		gabarito[1] = 'c';
		gabarito[2] = 'b';
		gabarito[3] = 'a';
		gabarito[4] = 'e';
		
		CorrecaoGabarito correcao = new CorrecaoGabarito(gabarito);
		
		
		char[] respostas = new char[5]; //2 acertos
		respostas[0]= 'a';
		respostas[1]= 'b';
		respostas[2]= 'c';
		respostas[3]= 'd';
		respostas[4]= 'e';
		
		correcao.avaliarRespostas(respostas);
		
		char[] respostas2 = new char[5]; //0 acertos
		respostas2[0]= 'e';
		respostas2[1]= 'd';
		respostas2[2]= 'c';
		respostas2[3]= 'b';
		respostas2[4]= 'a';
		
		correcao.avaliarRespostas(respostas2);

		
		char[] respostas3 = new char[5];  //5 acertos
		respostas3[0] = 'a';
		respostas3[1] = 'c';
		respostas3[2] = 'b';
		respostas3[3] = 'a';
		respostas3[4] = 'e';
		
		correcao.avaliarRespostas(respostas3);

	}

}
