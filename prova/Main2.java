
import java.util.Scanner;
public class Main2 {
	public static void main(String[] args) {
	    Scanner see = new Scanner(System.in);
		String aluno = see.nextLine();
		System.out.println("1* Quais os tipos de variaveis que recebem numericos em java?");
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
        System.out.println("2* Observe o codigo abaixo:");
        System.out.println("public class App {\r\n"
        		+ "    public static void main(String[] args) throws Exception {\r\n"
        		+ "        System.out.println(\"Hello, World!\")\r\n"
        		+ "        System.out.println(\"Escola de Jovens Programdores\");\r\n"
        		+ "    }\r\n"
        		+ "}");
        System.out.println("Qual sera a saida do codigo?");
        System.out.println("A* Escola de Jovens Progamadores");
        System.out.println("B* Hello world");
        System.out.println("C* Hello world e Escola de Jovens Progamadores");
        System.out.println("D* erro");
        System.out.println("E* null");
        String resposta2 = see.nextLine();
        if(resposta2.toUpperCase().equals ("D")) {
			acertos++;
		}
        System.out.println("3* Qual das opções abaixo leva a portabilidade e segurança do java?");
        System.out.println("A* Bytecode é executado pelo jvm");
        System.out.println("B* O applet faz o codigo java seguro e portavel");
        System.out.println("C* O manuseio de exeções");
        System.out.println("D* A dinamica de vinculamento entre objetos");
        String resposta3 = see.nextLine();
        if(resposta3.toUpperCase().equals ("A")) {
			acertos++;
		}
        System.out.println("4* Qual das ceguintes opções não é um função java?");
        System.out.println("A* Dinamica");
        System.out.println("B* Architetura neutra");
        System.out.println("C* Uso de ponteiros");
        System.out.println("D* Orientação de objetos");
        String resposta4 = see.nextLine();
        if(resposta4.toUpperCase().equals ("C")) {
			acertos++;
		}
        System.out.println("5* Qual das seguintes opções é valido para declara o char?");
        System.out.println("A* char ch = 'utea'");
        System.out.println("B* char ca = 'tea'");
        System.out.println("C* char cr = 'u0223'");
        System.out.println("D* char cc = 'itea'");
        System.out.println("E*");
        String resposta5 = see.nextLine();
        if(resposta5.toUpperCase().equals ("A")) {
			acertos++;
		}
        System.out.println("6* O \u0021 artigo refere-se a");
        System.out.println("A* Sequencia de escape unicode");
        System.out.println("B* Octal escape");
        System.out.println("C* Hexadecimal");
        System.out.println("D* Line feed");
        String resposta6 = see.nextLine();
        if(resposta6.toUpperCase().equals ("A")) {
			acertos++;
		}
        System.out.println("7* _ é costuma achar e concertar bugs no progama java");
        System.out.println("A* JVM");
        System.out.println("B* JRE");
        System.out.println("C* JDK");
        System.out.println("D* JDB");
        String resposta7 = see.nextLine();
        if(resposta7.toUpperCase().equals ("D")) {
			acertos++;
		}
        System.out.println("8* NO java EE7, há tecnoogia padrão de gerenciamento do ciclo de vida de compoentes atrelados a escopos bem definidos. Essa tecnologia é:");
        System.out.println("A* EJB");
        System.out.println("B* JPA");
        System.out.println("C* JTA");
        System.out.println("D* CDI");
        System.out.println("E* JSF");
        String resposta8 = see.nextLine();
        if(resposta8.toUpperCase().equals ("D")) {
			acertos++;
		}
        System.out.println("9* Um progamador java deseja construir um sistema, utilizando um padrão de projeto J2EE, no qual seja possível dividir o sistema em um modeo de dados, um conjunto de visões associadas e um conjunto de controladores sobre esses dados. \n Para esse caso, o padrão é o:");
        System.out.println("A* Data Access Object");
        System.out.println("B* Data Transfer Object");
        System.out.println("C* Model-View-Controller");
        System.out.println("D* Session façade");
        String resposta9 = see.nextLine();
        if(resposta9.toUpperCase().equals ("C")) {
			acertos++;
		}
        System.out.println("10* Assinale a opção que corresponde a um sevidor de aplicação J2EE.");
        System.out.println("A* WebSphere");
        System.out.println("B* Eclipse");
        System.out.println("C* JavaVMware");
        System.out.println("D* www2EE");
        String resposta10 = see.nextLine();
        if(resposta10.toUpperCase().equals ("A")) {
			acertos++;
		}
        System.out.println(aluno);
        System.out.println("nota "acertos);
        if(acertos >= 7) {
        	System.out.println("você passou");
        } else {
        	System.out.println("reprovado");
        }
        see.close();
	}
}
