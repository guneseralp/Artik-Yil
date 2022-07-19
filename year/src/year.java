import java.util.Scanner;

public class year {
    public static void main(String[] args) {
        boolean artikYil = false;
        int year;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Year: ");
        year = input.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0){
                    artikYil = true;
                }else{
                    artikYil = false;
                }
            }else {
                artikYil = true;
            }
        } else{
            artikYil = false;
        }

        if (artikYil){
            System.out.println(year + " yılı bir artık yıldır !");
        }else{
            System.out.println(year + " yılı bir artık yıl değildir !");
        }
    }
}
