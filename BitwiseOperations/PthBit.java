package Lab;

import java.util.Scanner;

public class PthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int p = Integer.parseInt(sc.nextLine());
        int bitAtPositionP = n >> p; //местим P на брой пъти и бита на позиция П става последен

        bitAtPositionP = bitAtPositionP & 1; //намираме какъв е последния бит

        System.out.println(bitAtPositionP);

        //Формулата е: bitAtPositionP = (n >> p) & 1
    }
}
