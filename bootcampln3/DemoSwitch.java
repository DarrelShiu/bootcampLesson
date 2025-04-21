public class DemoSwitch {
  public static void main(String[] args){

    int numericGrade = 20;
    char letterGrade = ' ';

    switch (numericGrade) {
        case 90: {
            letterGrade = 'A';
        }
        case 80: {
            letterGrade = 'B';
        }
        case 70: {
            letterGrade = 'C';
        }
        case 60: {
            letterGrade = 'D';
        }
        case 50: {
            letterGrade = 'E';
        }
        default: {
            letterGrade = 'F';
        }
    }

    System.out.println("letterGrade: " + letterGrade); // letterGrade = ?

    int x = 2;
    for (int i = 0; i < 10; i++) {
      System.out.print(x + " ");
      x *= 2;
    }

    for (int i = 1; i <= 10; i++) {
      if (i % 2 == 0) {
          continue; // Skip even numbers
      }
      // .. code
      System.out.println(i);

    }

    String menu = "A";
    String starter = "salad";

    for (int i = 1; i < 4; i++) {
      switch (i) {
        case (1): {
          menu = "A";
          break;
        }
        case (2): {
          menu = "B";
          break;
        }
        case (3): {
          menu = "C";
          break;
        }
      }
      System.out.println("step1: " + i);
      
      switch (menu) {
        case ("A"): {
          starter = "starterA";
          break;
        }
        case ("B"):{
          starter = "starterB";
          break;
        }
        default:
          System.out.println("none");
      }
      System.out.println(starter);
    }

    String weekday = "Sunday";
    String s1 = "caseAbc";
    switch (weekday) {
      case "Monday": {
        s1 = "case1";
        break;
      }
      case "Tuesday": {
        s1 = "case2";
        break;
      }
      case "Sunday": {
        s1 = "case3";
        break;
      }
      default:
      System.out.println("no matched");
    }
    System.out.println(s1);

    int gradeEng = 70;
    switch (gradeEng) {
      case 60: {
        System.out.println("grade D");
        break;
      }
      case 80: {
        System.out.println("grade B");
        break;
      }
      case 70: {
        System.out.println("grade C");
        break;
      }
      case 90: {
        System.out.println("grade A");
        break;
      }
    }

    double num6 = 8.0;
    double num7 = 7.0;
    char oper = '^';
    switch (oper) {
      case '+': {
        System.out.println("This is an addition: " + (num6 + num7));
        break;
      }
      case '-': {
        System.out.println("This is a subtraction: " + (num6 - num7));
        break;
      }
      case '*': {
        System.out.println("This is a multiplication: " + (num6 * num7));
        break;
      }
      case '/': {
        if (num7 == 0.0) {
          System.out.println("Denominator is zero");
          break;
        } else {
          System.out.println("This is a division: " + (num6 / num7));
          break;
        }
      }
      default: {
        System.out.println("Invalid operator");
      }
    }

    String animal = "cow";
    switch(animal) {
      case "dog": 
        System.out.println("Bark");
        break;
      case "cat":
        System.out.println("Meow");
        break;
      case "cow":
        System.out.println("Moo");
        break;
      default:
        System.out.println("unknown");
    }

    int month = 12;
    switch (month) {
      case 1: case 2: case 3:
        System.out.println("Spring");
        break;
      case 4: case 5: case 6:
        System.out.println("Summer");
        break;
      case 7: case 8: case 9:
        System.out.println("Autumn");
        break;
      case 10: case 11: case 12:
        System.out.println("Winter");
        break;
      default:
        System.out.println("Invalid");
    }

    double amount = 100.0;
    String currency = "YEN";
    switch(currency) {
      case "GBP":
        amount *= 0.85;
        break;
      case "EURO":
        amount *= 0.75;
        break;
      case "YEN":
        amount *= 110;
        break;
      default:
        System.out.println("no such choice");;
    }
    System.out.println("you chose " + currency + " and the amount is " + amount);


  }
}
