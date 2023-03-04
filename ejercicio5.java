import java.util.*;
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el radio de un círculo para calcular el área y su circunferencia");
        System.out.println(areaCircunferencia(scanner.nextDouble()));
    }

    public static String areaCircunferencia(double r){
        double area = 2 * Math.PI * Math.pow(r,2);
        double circunferencia = 2 * Math.PI * r;
        return "El área del círculo es " + String.format("%.3f",area) +
                " y  la longitud de su circunferencia es " + String.format("%.3f",circunferencia) + "\n";
    }
}
