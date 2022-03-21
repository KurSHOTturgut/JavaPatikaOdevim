import java.util.Scanner;
public class DortveBesinKuvvetleri {
    public static void main(String[] args) {
        int value;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        value = input.nextInt();
        System.out.println("4 ve 5'in kuvvetleri: ");
        for (int i = 0; i <= value; i+=20){
            System.out.println(i);
        }
    }
}