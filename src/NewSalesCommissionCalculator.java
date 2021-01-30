public class NewSalesCommissionCalculator {



//    public  void  getSalesDistribution(int[] salesAmount, int[] frequency) {
    public  int[]  getSalesDistribution(int[] salesAmount) {
        int[] frequency = new int[9];

        for (int i : salesAmount) {
            double salesPersonsSalary = (200 + (0.09 * i));

            int result = (int) (salesPersonsSalary / 100);
            switch (result) {
                case 2 -> ++frequency[0];
                case 3 -> ++frequency[1];
                case 4 -> ++frequency[2];
                case 5 -> ++frequency[3];
                case 6 -> ++frequency[4];
                case 7 -> ++frequency[5];
                case 8 -> ++frequency[6];
                case 9 -> ++frequency[7];
                default -> ++frequency[8];


            }
        }
        return frequency;
    }
}
