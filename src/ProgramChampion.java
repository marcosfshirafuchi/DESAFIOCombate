import java.util.Scanner;

public class ProgramChampion {
    /*
        Programa DESAFIO: Combate desenvolvido por Marcos Ferreira Shirafuchi
        Data: 26/02/2024
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os dados do primeiro campeão:");
        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Vida inicial: ");
        int life = sc.nextInt();
        System.out.print("Ataque: ");
        int attack = sc.nextInt();
        System.out.print("Armadura: ");
        int armor = sc.nextInt();
        System.out.println();
        System.out.println("Digite os dados do segundo campeão:");
        System.out.print("Nome: ");
        String name2 = sc.next();
        sc.nextLine();
        System.out.print("Vida inicial: ");
        int life2 = sc.nextInt();
        System.out.print("Ataque: ");
        int attack2 = sc.nextInt();
        System.out.print("Armadura: ");
        int armor2 = sc.nextInt();
        Champion firstChampion = new Champion(name, life, attack, armor);
        Champion secondChampion = new Champion(name2, life2, attack2, armor2);
        System.out.println();
        System.out.print("Quantos turnos você deseja executar? ");
        int turn = sc.nextInt();
        for (int i = 1; i <= turn; i++) {
            firstChampion.takeDamage(secondChampion);
            secondChampion.takeDamage(firstChampion);
            System.out.println();
            System.out.printf("Resultado do turno %d:", i);
            System.out.println();
            if (firstChampion.getLife() <= 0 || secondChampion.getLife() <= 0) {
                System.out.println(firstChampion.status());
                System.out.println(secondChampion.status());
                break;
            } else {
                System.out.println(firstChampion.status());
                System.out.println(secondChampion.status());
            }
        }
        System.out.println();
        System.out.println("FIM DO COMBATE");
        sc.close();
    }
}
