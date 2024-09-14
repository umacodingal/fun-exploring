public class luckynumbers {
    

        // Method to calculate the sum of digits of a number
        public static int sumOfDigits(int number) {
            int sum = 0;
            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }
            return sum;
        }

        // Method to find and print lucky numbers up to a given limit
        public static void findLuckyNumbers(int limit, int targetSum) {
            System.out.println("Lucky numbers up to " + limit + " with sum of digits equal to " + targetSum + ":");
            for (int i = 1; i <= limit; i++) {
                if (sumOfDigits(i) == targetSum) {
                    System.out.println(i);
                }
            }
        }

        public static void main(String[] args) {
            int limit = 100; // Define the upper limit for lucky numbers
            int targetSum = 7; // Define the target sum of digits for a number to be considered lucky

            findLuckyNumbers(limit, targetSum);
        }
    }


