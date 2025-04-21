//import javax.swing.plaf.TreeUI;

public class DemoDataType {
  public static void main (String[] args) {
    System.out.println("HelloWorlds");
    
    // primitive data type
    // bealoon(1 bit)
    // byte(1 byte),short(2 bytes),int(4 bytes),long(8 bytes)
    // float(4 bytes),double(8 bytes)
    // char(2 bytes)

    boolean isMale = true;
    System.out.println("Male is " + isMale);
    isMale = false;
    System.out.println(isMale);

    byte num = 6;
    System.out.println(num);
    num = 127;  // byte overflow if >127
    System.out.println(num);

    short age = -32768;
    System.out.println(age);

    int length = 2147483647;
    System.out.println(length);

    long distance = 9223372036854775807l; // 9223372036854775808L;
    System.out.println(distance);
    distance = -9223372036854775808L;
    System.out.println(distance);

    float microChipDiameter = 10.25515112289f;
    System.out.println(microChipDiameter);

    double nanoChipDiameter = 10.25515112289d;
    System.out.println(nanoChipDiameter);

    char carPlatePrefix = 'A';
    System.out.println(carPlatePrefix);
    carPlatePrefix = 101;
    System.out.println(carPlatePrefix);

    String carPlate = "HCN 5678";
    System.out.println(carPlate);

    // weight1 = 0.26;

  }
}