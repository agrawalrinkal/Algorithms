

public class ReverseString {
  public static void main(String args[]) {
    String str = "Rinkal";
    System.out.println(str);

    method3(str);
  }

  public static void method1(String st) {
    char[] charStr = st.toCharArray();
    st = "";
    for (int i = charStr.length - 1; i >= 0; i--)  st += charStr[i];
    System.out.println(st);
  }

  public static void method2(String st) {
    StringBuilder builder = new StringBuilder(st);
    System.out.println(builder.reverse());
  }

  public static void method3(String st) {
    System.out.println(new StringBuilder(st).reverse().toString());
  }


}
