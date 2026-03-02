package q2;

/**
 * Q2. 文字列を逆転させなさい。確認する文字列はどんなものでも構いません。
 *
 * <pre>
 * (例)
 * "abcde" => "edcba"
 * "酔いしれ占う仲良いあの娘" => " この愛よ叶うなら嬉しいよ"
 * </pre>
 *
 * メソッドreverseを作成しなさい。
 *
 * @author d.toyoda
 */
public class Reverse {

  public static String reverse(String rev) {
    return new StringBuilder(rev).reverse().toString();
  }

  public static void main(String[] args) {
    String reversed = reverse("よいしれうらなうなかよいあのこ");
    System.out.println(reversed);
  }

}
