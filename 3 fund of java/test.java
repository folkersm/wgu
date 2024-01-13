public class LabProgram {
   public static void main(String[] args) {
      String word = "";
      for (int i = 0; i < 5; i++) {
            word = "";
            for (int j = 0; j < 5; j++) {
               if (i==2||j==0||j==4) {
                     word+="H";
                  }
               else {
                     word+=" ";
                  } 
            }
            System.out.println(word);
         }
      
   }
}