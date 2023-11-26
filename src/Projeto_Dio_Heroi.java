import java.util.Scanner;

public class Projeto_Dio_Heroi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual seu nome?");
        String user = input.next();
        System.out.println("Qual seu nível de XP?");
        int xp = input.nextInt();

        String classe = null;

        if (xp <1000){
            classe  = "Ferro";
        } else if (xp >= 1000 && xp <=2000) {
            classe  = "Bronze";
        } else if (xp >=2001 && xp<= 5000) {
            classe = "prata";
        } else if (xp >= 5001 && xp <= 7000) {
            classe = "ouro";
        } else if (xp >= 7001 && xp <= 8000) {
            classe ="Platina";
        } else if (xp >= 8001 && xp <= 9000) {
            classe ="Ascendente";
        } else if (xp >= 9001 && xp <= 10000) {
            classe ="Imortal";
        }else if (xp >= 10001) {
            classe ="Ascendente";
        }
        System.out.printf("O Herói de nome %s está no nível %s\n",user,classe);
    }
}
