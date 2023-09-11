package funcionario;

public class FuncionarioTeste {
	public static void main(String[] args) {
		Funcionario employee1 = new Funcionario("John","M", 26, "Web Designer", 2000);
		Funcionario employee2 = new Funcionario("Hanna","F",  30, "Software Engineering", 3000);
		
		employee1.view();
		employee2.view();
	}
}
