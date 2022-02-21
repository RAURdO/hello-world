import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner see = new Scanner(System.in);
		String aluno = see.nextLine();
		System.out.println("obs: escreva as respostas em letra maiúscula");
		System.out.println("1* quais os tipos de variaveis que recebem numericos em java?");
		System.out.println("A* String,float,int");
		System.out.println("B* double,String,boolean");
		System.out.println("C* double,float,int");
		System.out.println("D* String,private,void");
		System.out.println("E* int,boolean,float");
		String resposta1 = see.nextLine();
		int acertos = 0;
		if(resposta1.toUpperCase().equals ("C")) {
			acertos++;
		}
        System.out.println("2* observe o codigo abaixo:");
        System.out.println("public class App {\r\n"
        		+ "    public static void main(String[] args) throws Exception {\r\n"
        		+ "        System.out.println(\"Hello, World!\")\r\n"
        		+ "        System.out.println(\"Escola de Jovens Programdores\");\r\n"
        		+ "    }\r\n"
        		+ "}");
        System.out.println("qual sera a saida do codigo?");
        System.out.println("A* escola de jovens progamadores");
        System.out.println("B* hello world");
        System.out.println("C* hello world e escola de jovens progamadores");
        System.out.println("D* erro");
        System.out.println("E* null");
        String resposta2 = see.nextLine();
        if(resposta2.toUpperCase().equals ("D")) {
			acertos++;
		}
        System.out.println(acertos);
	}
}