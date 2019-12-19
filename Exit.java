public class Exit{
       
   public static void main(String[] args){
      
      double[] grand = {Poslaju.grand(), Samedaydelivery.grand(), PrepaidBEnvelope.grand(),PosEkspres.grand()};
      double grandTotal = 0;
      String format1 = "%-30s%-10s\n",
      format2 = "%-30s%-10.2f\n";
      
      /*Receipt*/
      System.out.printf("%30s\n","Receipt");
      System.out.printf(format1, "List of Delivery","Price (RM)");
      System.out.printf(format2, "Next-Day Delivery",grand[0]);
      System.out.printf(format2, "Same-Day Delivery",grand[1]);
      System.out.printf(format2, "Prepaid Box & Envelope",grand[2]);
      System.out.printf(format2, "Pos Ekspres", grand[3]);
      
      /*Calculate Grand Total of all delivery*/
      for(int i = 0; i < grand.length; i++){
         grandTotal += grand[i];
      } 
      System.out.printf(format2,"\nTotal Charge", grandTotal);     
      System.out.println("\nThank You, Bye");
   }
   

  }
  