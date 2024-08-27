package test;

public class first {
   public static void main(String[] args) {
      String[] vehicles = { "Car", "Truck" };

      String statement = "I have 2 Car one is Baleeno Car and other Car is Farari Car but Truck one and Truck two is used for transportation.";

      int carCount = 0;
      int truckCount = 0;


      for (String vehicle : vehicles) {
         if (vehicle.equals(vehicles[0])) {
            carCount = countOccurrences(statement, vehicles[0]);
         } else if (vehicle.equals(vehicles[1])) {
            truckCount = countOccurrences(statement, vehicles[1]);
         }
      }

      System.out.println("Car occurred " + carCount + " times"+" and "+ "Truck occurred " + truckCount + " times");
   }

   public static int countOccurrences(String statement, String word) {
      int count = 0;
      int index = 0;
      while ((index = statement.indexOf(word, index)) != -1) {
         count++;
         index += word.length();
      }
      return count;
   }
}
