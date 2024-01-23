package module4;

import java.util.ArrayList;
import java.util.Scanner;

public class Choice1 {
    public static void main(String[] args) {
        ArrayList<String> daysOfWeek = new ArrayList<>();
        ArrayList<Double> temperatures = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 7; i++) {
            System.out.print("Please enter a day of the week: ");
            String day = scanner.nextLine();
            daysOfWeek.add(day);

            System.out.print("Please enter the tempeture for " + day + ": ");
            double temperature = scanner.nextDouble();
            temperatures.add(temperature);

            scanner.nextLine();
        }

        System.out.println("\nTemperature for each day:");
        for (int i = 0; i < 7; i++) {
            System.out.println(daysOfWeek.get(i) + ": " + temperatures.get(i) + " degrees");
        }

        System.out.print("\nEnter the word 'week' to display the average: ");
        String userInput = scanner.nextLine();
        if ("week".equalsIgnoreCase(userInput)) {
            double weeklyAverage = calculateWeeklyAverage(temperatures);
            System.out.println("Temperature average is: " + weeklyAverage + " degrees");
        }

        scanner.close();
    }

    private static double calculateWeeklyAverage(ArrayList<Double> temperatures) {
        double sum = 0;
        for (double temperature : temperatures) {
            sum += temperature;
        }
        return sum / temperatures.size();
    }
}
