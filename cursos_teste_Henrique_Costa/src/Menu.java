import java.util.Scanner;

public class Menu {
    public int MenuPrincipal() {
        int escolha = 0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("++++++++++++++++++++++++++");
            System.out.println("1. About Formandos");
            System.out.println("2. About Cursos");
            System.out.println("3. About Inscrições");
            System.out.println("4. About Disciplinas");
            System.out.println();
            System.out.println("9. Quit");
            System.out.println("++++++++++++++++++++++++++");
            System.out.print("Choose an Option: ");
            escolha = sc.nextInt();
        }while(escolha != 1 && escolha != 2 && escolha != 3 && escolha != 4 &&escolha != 9);
        return escolha;
    }
    public int MenuSecundário(String tipo) {
        int escolha = 0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("++++++++++++++++++++++++++");
            System.out.println("1. New " + tipo);
            System.out.println("2. Modify a " + tipo);
            System.out.println("3. Delete a " + tipo);
            System.out.println("4. List all " + tipo);
            System.out.println();
            System.out.println("9. Quit");
            System.out.println("++++++++++++++++++++++++++");
            System.out.print("Choose an Option: ");
            escolha = sc.nextInt();
        }while(escolha != 1 && escolha != 2 && escolha != 3 && escolha != 4 && escolha != 9);
        return escolha;
    }
}