public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        String PaintName = "Desert";
        int PaintCoveragePerCanSqrMeter = 10;
        double wall1LengthInMm = 4;
        double wall1HeightInMm = 6;
        double wall1AreaInSqrMeter = wall1HeightInMm * wall1LengthInMm;
        float tinsNeeded = (float)(wall1AreaInSqrMeter / PaintCoveragePerCanSqrMeter);
            if (wall1AreaInSqrMeter%PaintCoveragePerCanSqrMeter!=0)
            {
                tinsNeeded++;
            }
            System.out.println(Math.ceil(tinsNeeded));

         double pricePerCan = 9.2;
         double totalPricePerCan = tinsNeeded * pricePerCan;
            System.out.println("The total price per can is " + totalPricePerCan + " and the amount of tins that will be needed is " + tinsNeeded);




    }


}
