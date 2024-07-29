import java.util.Scanner;
//Armut : 2,14 TL | Elma : 3,67 TL | Domates : 1,11 TL | Muz: 0,95 TL | Patlıcan : 5,00 TL
public class Main {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        double p_k_pear = 2.14, p_k_apple = 3.67, p_k_tomato = 1.11, p_k_banana = 0.95, p_k_eggplant = 5.0;
        double p_pear, p_apple, p_tomato, p_banana, p_eggplant, total_prize;
        double a_pear, a_apple, a_tomato, a_banana, a_eggplant;

        System.out.print("How many kilos (pear): ");
        a_pear = inp.nextDouble();
        System.out.print("How many kilos (apple): ");
        a_apple = inp.nextDouble();
        System.out.print("How many kilos (tomato): ");
        a_tomato = inp.nextDouble();
        System.out.print("How many kilos (banana): ");
        a_banana = inp.nextDouble();
        System.out.print("How many kilos (eggplant): ");
        a_eggplant = inp.nextDouble();

        p_pear = p_k_pear * a_pear;
        p_apple = p_k_apple * a_apple;
        p_tomato = p_k_tomato * a_tomato;
        p_banana = p_k_banana * a_banana;
        p_eggplant = p_k_eggplant * a_eggplant;
        total_prize = p_pear + p_apple + p_tomato + p_banana + p_eggplant;

        System.out.println("Total price: "+total_prize);

    }
}