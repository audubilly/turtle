public class NewSalesCommissionCalculatorMain {


    public static void main(String[] args) {

    NewSalesCommissionCalculator newSalesCommissionCalculator = new NewSalesCommissionCalculator();

    int [] result = newSalesCommissionCalculator.getSalesDistribution(new int[]{3000,3500,4500,4400,9000,4300,9000});
       for(int count = 2 ; count < result.length ; count++){
           System.out.println(count + "00" + "-" +count + "99" + " " + result[count]);

           for(int stars = 0 ; stars < result[count]; stars++){
               System.out.print("*");
           }
           System.out.println();

      }
    }
}
