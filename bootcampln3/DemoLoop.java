public class DemoLoop {
  public static void main(String[] args) {
    System.out.println("test OK!");

    for (int i1 = 0; i1 < 10; i1++){
      System.out.println(i1); // 0,1,2,3,4,5,6,7,8,9
    }

    for (int i2 = 10; i2 > 0; i2-=2){
      System.out.println(i2); // 10,8,6,4,2
    }

    int i3 = 0;
    for (int i4 = 1; i4 <= 10; i4++) {
      i3 += i4; // 1+2+3+4+5+6+7+8+9+10
    }
    System.out.println(i3);

    int i5 = 0;
    for (int i6 = 1; i6 <= 10; i6+=2) {
      i5 += i6; // 1+3+5+7+9
    }
    System.out.println(i5);

    int i7 = 0;
    for (int i8 = 10; i8 >=0; i8-=2) {
      i7 -= i8; // 10,8,6,4,2
    }
    System.out.println(i7);

    int num1 = 0;
    for (int i9 = 0; i9 < 10; i9++) {
      num1 += 1; // 0,1,2,3,4,5,6,7,8,9
    }
    System.out.println(num1);

    int num2 = 0;
    int num3 = 0;
    for (int i10 = 0; i10 <= 20; i10++) {
      if (i10 % 2 == 0) { // 0,2,4,6,8,10,12,14,16,18,20
        num2 += 1; 
      } else if (i10 % 2 != 0) { // 1,3,5,7,9,11,13,15,17,19
        num3 += 1;
      }
    }
    System.out.println("There are " + num2 + " even no.s within 20\n" + "There are " + num3 + " odd no.s within 20");

    int num4 = 0;
    for (int i11 = 0; i11 <= 10; i11++) {
      if (i11 % 2 == 0) {
        continue;
      } // 1,3,5,7,9
      num4 += 1;
      System.out.print(i11 + ",");
    }
    System.out.println();
    System.out.println("There is " + num4 + " odd no.s within 10");

    for (int i12 = 1; i12 <= 3; i12++) {
      for (int i13 = 1; i13 <= 3; i13++) {
        if (i12 == 2 && i13 != 1) {
          continue;
        }
        System.out.println("i12:" + i12 + " i13:" + i13);
      }
    }

    outerloop: for (int i14 = 0; i14 <= 10; i14++) {
      for (int i15 = 0; i15 <= 10; i15++) {
        if (i15 == 3) {
          break; 
        } else if (i14 == 5) {
          break outerloop;
        }
        System.out.println("i14: " + i14 + " i15: " + i15);
      }
    }

    int i19 = 0;
    for (int i18 = 1; i18 <= 20; i18++) {
      i19 += i18;
      // System.out.print(i18 + ",");
    }
    System.out.println(i19);

    int multiplier = 2;
    for (int i20 = 1; i20 <= 10; i20++) {
      System.out.println(multiplier + "*" + i20 + ": " + multiplier*i20);
    }

    String s1 = "reserve";
    String reverved = "";
    for (int i20 = s1.length() - 1; i20 >= 0 ; i20--) {
        // System.out.println(i20);
        reverved += s1.charAt(i20);
    }
    System.out.print(reverved);

    for (int i21 = 0; i21 <= 20; i21++) {
      if(i21 % 2 != 0) {
          continue;
      }
      System.out.println(i21);
    }

    // 0 1 1 2 3 5 8 13 21
    //              
    // 0 + 1 -> 1   
    // 1 + 1 -> 2   
    // 1 + 2 -> 3   
    // 2 + 3 -> 5   
    // 3 + 5 -> 8   
    // 5 + 8 -> 13   
    int i23 = 0;
    int i24 = 1;
    int next = 1;

    for (int i22 = 1; i22 <= 5; i22++) {
        next = i23 + i24;
        i23 = i24;
        i24 = next;
        System.out.println("i23: " + i23 + " i24: " + i24);
        System.out.println(next);
    }

    int rows = 5;
    for (int i = 1; i <= rows; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    int i26 = 0;
    int i27 = 0;
    for (int i25 = 0; i25 <= 10; i25++) {
      if (i25 % 2 == 0) {
          i26 += i25;
          System.out.print(" Even number is: " + i25 + "\n");
      } else {
          i27 += i25;
          System.out.print("Odd number is: " + i25);
      }
    }
    System.out.println("Sum of odd number is " + i27);
    System.out.println("Sum of even number is " + i26);

    int i30 = 4;
    for (int i = 1; i <= i30; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    int i28 = 152;
    int i31 = 0;
    for (; i28 != 0; i28 /= 10) {
        i31 += i28 % 10;
    }
    System.out.println(i31);

    for (int i32 = 1; i32 <= 10; i32++) {
      if (i32 == 5) {
          System.out.println("Breaking the loop at " + i32);
          break; // Exit the loop when i is 5
      }
      System.out.println(i32);
    }

  for (int i33 = 1; i33 <= 5; i33++) {
    for (int j = 1; j <= 5; j++) {
        if (i33 * j > 10) {
            System.out.println("Breaking at i33 = " + i33 + ", j = " + j);
            break; // Break out of the inner loop
        }
        System.out.println("i33 = " + i33 + ", j = " + j);
      }
    }

    for (int i32 = 0; i32 <= 10; i32++) {
      if(i32 == 7 || i32 == 9) {
        continue;
      }
      System.out.println(i32);
    }

    int i35 = 0;
    for (int i34 = 0; i34 <= 20; i34++) {
      if (i34 % 2 != 0) {
        continue;
      }
      i35 += i34;
      System.out.print(i34 + ",");

      if (i35 > 50) {
        break;
      }

    }
    System.out.println(i35);


    for (int i36 = 10; i36 >= 0; i36--) {
      if (i36 == 5) {
          System.out.println("Stopping countdown at 5.");
          break; // Break the loop when i is 5
      }
      System.out.println(i36);
  }

  for (int i36 = 0; i36 <= 30; i36++) {
    if (i36 != 0 && i36 % 7 == 0) {
        System.out.println("This number can be divided by 7: " + i36);
        break;
    }
  }

  for (int i37 = 0; i37 <= 30; i37++) {
    if (i37 % 2 == 0) {
      continue;
    }
    System.out.print(i37 + " ");
  }


  for (int i38 = 0; i38 <= 10; i38++) {
    for (int i39 = 0; i39 <= 10; i39++) {
      if (i38 + i39 == 10) {
        break;
      }
      System.out.println("1st no. is " + i38 + " and 2nd no. is " + i39);
    }
  }

  for (int i40 = 0; i40 <= 5; i40++) {
    for (int i41 = 0; i41 <= i40; i41++) {
        System.out.print("+");
        // System.out.println(i40 + " " + i41);
    }
    System.out.println();
  }

  int i43 = 1;
  for (int i42 = 1; i42 <= 20; i42 ++) {
    i43 *= i42;
    if (i43 > 100) {
      break;
    }
    System.out.println("the value of i43 is " + i43);
  }

  for (int i44 = 0; i44 <= 30; i44++) {
    if (i44 > 10 && i44 < 20) {
      continue;
    }
    System.out.println("the value of i44 is " + i44);
  }

  String s5 = "AbcAcsfAdvd";
  int i50 = 0;
  for (int i49 = 0; i49 <= s5.length() -1 ; i49++) {
    if (s5.charAt(i49) != 'A') {
        continue;
    }
    i50 += 1;
  }
  System.out.println("The value of i50: " + i50);

  int i51 = 0;
  for (int i49 = 0; i49 <= s5.length() -1 ; i49++) {
    if (s5.charAt(i49) == 'A') {
        if (i51 == 3) {
          break;
        }
    }
    i51 += 1;
  }
  System.out.println("The value of i51: " + i51);

  }  
}
