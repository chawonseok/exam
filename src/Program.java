import javaprj.ui.NewExamConsole;
import ui.ExamConsole;
import ui.ExamConsoleListener;
public class Program {

	public static void main(String[] args) {
		ExamConsole console = new NewExamConsole();
	
		
		EXIT: 	while (true) {
			int menu = ExamConsole.inputMenu();
			switch (menu) {
			case 1:
				console.input();
				break;
			case 2:
				console.print();
				break;
			case 3:
				break EXIT;
			}

		}

	}

}
