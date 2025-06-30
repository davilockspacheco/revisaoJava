import javax.swing.JOptionPane;

public class escola {

	public static void main(String[] args) {
		//Menu
		int menu = 0;
		
		while(menu != 4){
			menu = Integer.parseInt(JOptionPane.showInputDialog("MENU \n1 - Cadastrar Alunos "
					+ "\n2 - Calcular Mensalidade \n3 - Mostrar Informa��es \n4 - Sair"));
			
			if(menu == 1){
				acoes.cadastrar();
			} else if(menu == 2){
				acoes.calcularMensalidade();
			} else if(menu == 3){
				acoes.mostrarInformacoes();
			} else if(menu == 4){
				break;
			} else {
				JOptionPane.showMessageDialog(null, "Op��o Inv�lida.");
			}
		}

	}

}
