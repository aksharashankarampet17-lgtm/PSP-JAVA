import java.util.Scanner;

public class calEnergy {
    static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
        double totalEnergy = morningEnergy + eveningEnergy;
        return totalEnergy;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter morningEnergy");
        double morningEnergy = sc.nextDouble();
        System.out.println("Enter eveningEnergy");
        double eveningEnergy = sc.nextDouble();

        double totalEnergy = calculateTotalEnergy(morningEnergy, eveningEnergy);
        System.out.println("Total Energy Consumption: " + totalEnergy + " kWh");
    }
}