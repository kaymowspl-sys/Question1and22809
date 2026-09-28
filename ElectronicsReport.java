


/**
 *
 * @ST10510570.
 */
// Question 1 

//Electronics Report 
    public static void main(String[] args) {
        
        // 1:  1D arrays
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        String[] consoles = {"PS5", "XBOX", "SWITCH"};

        // 2: 2D array for sales data
        int[][] sales = {
            // Cape Town
            {1000, 2000, 3000}, 
            
             // Port Elizabeth
            {2000, 3000, 4000},
            
            // Pretoria
            {1500, 1100, 1200} 
        };

        // Variables to find city with most sales
        int maxSales = 0;
        String cityWithMostSales = "";
        int[] totalSalesPerCity = new int[cities.length];

        // --- REPORT ---
        System.out.println("----------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("----------------------");
        System.out.printf("\n", "", consoles[0], consoles[1], consoles[2]);
        System.out.println("-----------------------");

        // Display sales for  city
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("\n",cities[i], sales[i][0], sales[i][1], sales[i][2]);

            // Calculate total for  city
            int cityTotal = 0;
            for (int j = 0; j < sales[i].length; j++) {
                cityTotal += sales[i][j];
            }
            totalSalesPerCity[i] = cityTotal;

            // Check for max sales
            if (cityTotal > maxSales) {
                maxSales = cityTotal;
                cityWithMostSales = cities[i];
            }
        }
            //Total for cities
        System.out.println("-------------------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < cities.length; i++) {
            System.out.printf("\n", cities[i], totalSalesPerCity[i]);
        }

        System.out.println();
        System.out.println("CITY WITH THE MOST SALES: " + cityWithMostSales);
        System.out.println("-------------------------------------------------------------");
    }



