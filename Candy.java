class Candy {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] candies = new int[n];

        // Initialize all candies with 1
        for (int i = 0; i < n; i++) {
            candies[i] = 1;
        }

        // First pass: left to right
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        // Second pass: right to left
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        // Sum up the candies
        int sum = 0;
        for (int candy : candies) {
            sum += candy;
        }

        return sum;
    }

    public static void main(String[] args) {
        // Test case
        Candy solution = new Candy();
        int[] ratings = {1, 0, 2};
        int result = solution.candy(ratings);
        System.out.println("Total candies needed: " + result);  // Expected output: 5
    }
}
