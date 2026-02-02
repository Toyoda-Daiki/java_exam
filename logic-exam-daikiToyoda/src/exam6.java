public class exam6 {
  public static void main(String[] args) {
    int[] numbers = new int[3];
    for (int i = 0; i < 3; i++){
      int num ;
      boolean num2;
      do {
        num = (int)(Math.random() * 10);
        num2 = false;
        for (int j = 0; j < i; j++){
          if (numbers[j] == num){
            num2 = true;
            break;
          }
        }
      } while (num2);
      numbers[i] = num;
    }
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        for (int k = 0; k < 3; k++) {
          if (i != j && j != k && k != i) {
            System.out.println("" + numbers[i] + numbers[j] + numbers[k]);
          }
        }
      }
  }
}
