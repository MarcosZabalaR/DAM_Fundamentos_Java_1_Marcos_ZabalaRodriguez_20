package es.MZabala;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido, por favor introduzca un número entre 0 y 99.");
        int x = sc.nextInt();
        int u=0,d=0;
        if (x < 0 || x > 99) {
            System.out.println("Número no válido.");
        } else {
            for (int i = 0; i < x; i++) {
                u++;
                if (u == 10) {
                    u = 0;
                    d++;
                }
            }
            if(u!=0) {
                switch (d) {
                    case 1:
                        switch (u) {
                            case 1:
                                System.out.println("Once");
                                break;
                            case 2:
                                System.out.println("Doce");
                                break;
                            case 3:
                                System.out.println("Trece");
                                break;
                            case 4:
                                System.out.println("Catorce");
                                break;
                            case 5:
                                System.out.println("Quince");
                                break;
                            default:
                                System.out.print("Dieci");
                                break;
                        }
                        break;
                    case 2:
                        System.out.print("Veinte y ");
                        break;
                    case 3:
                        System.out.print("Treinta y ");
                        break;
                    case 4:
                        System.out.print("Cuarenta y ");
                        break;
                    case 5:
                        System.out.print("Cicuenta y ");
                        break;
                    case 6:
                        System.out.print("Sesenta y ");
                        break;
                    case 7:
                        System.out.print("Setenta y ");
                        break;
                    case 8:
                        System.out.print("Ochenta y ");
                        break;
                    case 9:
                        System.out.print("Noventa y ");
                        break;
                }
                if (x >= 16 || x < 10) {
                    switch (u) {
                        case 1:
                            System.out.print("Uno");
                            break;
                        case 2:
                            System.out.print("Dos");
                            break;
                        case 3:
                            System.out.print("Tres");
                            break;
                        case 4:
                            System.out.print("Cuatro");
                            break;
                        case 5:
                            System.out.print("Cinco");
                            break;
                        case 6:
                            System.out.print("Seis");
                            break;
                        case 7:
                            System.out.print("Siete");
                            break;
                        case 8:
                            System.out.print("Ocho");
                            break;
                        case 9:
                            System.out.print("Nueve");
                            break;
                    }
                }
            }else{
                switch (d){
                    case 0:
                        System.out.println("Cero");
                        break;
                    case 1:
                        System.out.println("Diez");
                        break;
                    case 2:
                        System.out.println("Veinte");
                        break;
                    case 3:
                        System.out.println("Treinta");
                        break;
                    case 4:
                        System.out.println("Cuarenta");
                        break;
                    case 5:
                        System.out.println("Cicuenta");
                        break;
                    case 6:
                        System.out.println("Sesenta");
                        break;
                    case 7:
                        System.out.println("Setenta");
                        break;
                    case 8:
                        System.out.println("Ochenta");
                        break;
                    case 9:
                        System.out.println("Noventa");
                        break;
                }
            }
        }
    }
}
