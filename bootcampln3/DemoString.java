public class DemoString {
  public static void main(String[] args) {

    // ! Function7: isEmpty()
    String s1 = "";
    System.out.println(s1.isEmpty());

    if (s1.isEmpty()) {
      System.out.println("\"yes Enpty");
    } else {
      System.out.println("\"No empty");
    }

    System.out.println("?");

    String s2 = " ";
    boolean isEmptyS2 = s2.isEmpty();
    System.out.println("Is isEmptyS2 empty? " + isEmptyS2);

    String s3 = "   ";
    boolean isEmptyS3 = s3.isEmpty();
    System.out.println("Is isEmptyS3 empty? " + isEmptyS3);

    boolean isBlankS3 = s3.isBlank();
    System.out.println("Is isBlankS3 blank? " + isBlankS3);

    // ! Function 10: substring()
    // String s23 = "helloworld";
    // System.out.println(s23.substring(4,7));

    String s4 = "123456789";
    String s5 = s4.substring(0,4);
    String s6 = s4.substring(6);
    System.out.println("This s5 is " + s5);
    System.out.println("This s6 is " + s6);
    
    // ! Funtion 11: toLowerCase(), toUpperCase()
    // System.out.println(s22.toLowerCase());
    // System.out.println(s22.toUpperCase());
    String s7 = "this is an APPLE";
    System.out.println(s7.toUpperCase());
    System.out.println(s7.toLowerCase());

    // ! Function 9: replace()
    // String s22 = "hello";
    // System.out.println(s22.replace("e", "xx"));
    System.out.println(s7.replace('a','x'));
    System.out.println(s7.replace("a", "xx"));

    // ! Function 5: contains()
    // System.out.println(s12.contains("ll"));
    // System.out.println(s12.contains("lll"));
    boolean contains7 = s7.contains(" APPLE");
    System.out.println("This sentence contains s7? " + contains7);

    // ! Function6: startsWith(), endsWith()
    // System.out.println(s12.startsWith("Sa"));
    // System.out.println(s12.endsWith("Sa"));
    String s8 = "  This is a book.";
    Boolean startsWith =  s8.startsWith("  ");
    Boolean endsWith = s8.endsWith("k.");
    System.out.println("this is startswith: " + startsWith);
    System.out.println("this is endswith: " + endsWith);

    // ! trim
    String s9 = "this is \n these are  ";
    System.out.println(s9);
    String trim = s9.trim();
    System.out.println("This is a trim: " + trim);

    int i45 = s8.indexOf('i');
    System.out.println("This index of s8 is " + i45);
    int i46 = s8.lastIndexOf('i');
    System.out.println("This last index of s8 is " + i46);
    int i47 = s8.indexOf("is");
    System.out.println("This last index of s8 is " + i47);
    int i48 = s8.lastIndexOf("is");
    System.out.println("This last index of s8 is " + i48);

    String name1 = "VenturenixLAB, Java";
    System.out.println(name1.substring(2, 4));

    System.out.println(name1.replace("e", "*"));


  }
  
}
