public class Exam5 {
  public static void main(String[] args) {
    int num1 = 5;
    int num2 = 3;

    int addResult = addition(num1, num2);
    int subResult = subtraction(num1, num2);
    int mulResult = multiplication(num1, num2);
    int divResult = division(num1, num2);
    int remResult = remainder(num1, num2);

    System.out.println("足し算結果：" + addResult);
    System.out.println("引き算結果：" + subResult);
    System.out.println("掛け算結果：" + mulResult);
    System.out.println("割り算結果：" + divResult);
    System.out.println("剰余結果：" + remResult);
  }

  public static int addition(int num1, int num2){
    return num1 + num2;
  }

  public static int subtraction(int num1, int num2){
    return num1 - num2;
  }

  public static int multiplication(int num1, int num2){
    return num1 * num2;
  }

  public static int division(int num1, int num2){
    return num1 / num2;
  }

  public static int remainder(int num1, int num2){
    return num1 % num2;
  }
}
