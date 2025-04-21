public class DemoIf {
  public static void main(String[] args){

    int i1 = -2;
    if (i1 < 5) {
      System.out.println("Input is less than 5");
    } else if (i1 >= 5 && i1 <= 10) {
      System.out.println("Input is between 5 and 10");
    } else {
      System.out.println("Input is larger than 10");
    }

    // int i2 = 6;
    // int i3 = 6;  // i2 <=3, i2 > 3, i3 < 5, i3 >= 5
    for (int i16 = 0; i16 <= 10; i16++) {
      for (int i17 = 0; i17 <= 10; i17++) {
        if (i16 <= 3 || i17 >= 6) {
          System.out.println("1. i2 <= 3 || i3 >= 5" + " i16: " + i16 + " i17: " + i17 );
        } else if (i16 > 3 && i17 < 6) {
          System.out.println("2. i2 > 3 && i3 <5" + " i16: " + i16 + " i17: " + i17 );
        } else {
          System.out.println("3. out of range" + " i16: " + i16 + " i17: " + i17 );
        }
      }
    }

    int grade = 60;
    if (grade >= 90) {
      System.out.println("grade A");
    } else if (grade >= 80) {
      System.out.println("grade B"); 
    } else if (grade >= 70) {
      System.out.println("grade C");
    } else if (grade >= 60) {
      System.out.println("grade D");
    } else {
      System.out.println("Below Average");
    }

    int weekDay = 1;
    if (weekDay == 1) {
      System.out.println("Mon");
    } else if (weekDay == 2) {
      System.out.println("Tue");
    } else if (weekDay == 3) {
      System.out.println("Wed");
    } else if (weekDay == 4) {
      System.out.println("Thu");
    } else if (weekDay == 5) {
      System.out.println("Fri");
    } else if (weekDay == 6) {
      System.out.println("Sat");
    } else if (weekDay == 7) {
      System.out.println("Sun");
    } else {
      System.out.println("Please input a valid number");
    }

    double celsius = -12;
    if (celsius < 0.0) {
      System.out.println("This is freezing");
    } else if (celsius >= 0.0 && celsius <= 20.0) {
      System.out.println("This is cold");
    } else if (celsius >= 20.0 && celsius <= 30.0) {
      System.out.println("This is warm");
    } else {
      System.out.println("This is hot");
    }

    double num1 = 7.0;
    double num2 = 3.0;
    // double result = 0.0;
    char oper = '/';
    if (oper == '+') {
      // result = num1 + num2;
      System.out.println("This is an addition: " + num1 + num2);
    } else if (oper == '-') {
      // result = num1 - num2;
      System.out.println("This is a subtraction: " + (num1 - num2));
    } else if (oper == '*') {
      // result = num1 * num2;
      System.out.println("This is a multiplication: " + num1 * num2);
    } else if (oper == '/') {
      if (num2 == 0) {
        System.out.println("The denominator is zero");
      } else {
        // result = num1 / num2;
        System.out.println("This is the divsion: " + num1 / num2);
      }
    } else {
      System.out.println("Please input a valid operator");
    }

    int age = 13;
    if (age < 13) {
        System.out.println("you are a child");
    } else if (age >= 13 && age < 20) {
        System.out.println("you are a teenager");
    } else if (age >= 20 && age < 65) {
        System.out.println("you are a adult");
    } else {
        System.out.println("you are a senior");
    }

    String trafficLight = "red";
    if (trafficLight == "red") {
        System.out.println("Stop!");
    } else if (trafficLight == "green") {
        System.out.println("Caution");
    } else if (trafficLight == "yellow") {
        System.out.println("Go");
    } else {
        System.out.println("Invalid operator");
    }

    String trafficLightEqual = "red";
    if (trafficLightEqual.equals("red")) {
        System.out.println("Stop!");
    } else if (trafficLightEqual.equals("green")) {
        System.out.println("Caution");
    } else if (trafficLightEqual.equals("yellow")) {
        System.out.println("Go");
    } else {
        System.out.println("Invalid operator");
    }

    double withdrawal = 10.0;
    double balance = 100.0;
    if (withdrawal > balance) {
      System.out.println("Insufficient funds!");
    } else if (withdrawal <= 0.0) {
      System.out.println("Invalid amount!");
    } else {
      balance -= withdrawal;
      System.out.println("The remaining balance is " + balance);
    }
    
    int num5 = 80;
    if (num5 < 0 || num5 > 100) {
      System.out.println("This is out of range");
    } else if (num5 <= 50) {
      System.out.println("Number is in the lower part");
    } else {
      System.out.println("Number is in the upper part");
    }

    double SpendingAmount = 1000.00000001;
    double discount = 0.0;
    if (SpendingAmount > 1000) {
      discount = 0.8;
    } else if (SpendingAmount > 500) {
      discount = 0.9;
    } else {
      discount = 0.0;
    }
    System.out.println("Amount " + SpendingAmount + " has discount: " + discount);

    double height = 0.0;
    double weight = 0.0;
    double bmi = weight / (height * height);

    if (bmi < 18.5) {
      System.out.println("Underweight");
    } else if (bmi < 24.9) {
        System.out.println("Normal weight");
    } else if (bmi < 29.9) {
        System.out.println("Overweight");
    } else {
        System.out.println("Obesity");
    }

    String correctUserName = "user";
    String correctUserPass = "pass";
    String inputUserName = "user";
    String inputUserPass = "Pass";
    if (inputUserName.equals(correctUserName) && inputUserPass.equals(correctUserPass)) {
      System.out.println("Both username and userpass are correct");
    } else if (!inputUserName.equals(correctUserName) && !inputUserPass.equals(correctUserPass)) {
      System.out.println("Both username and userpass are not correct");
    } else if (!inputUserName.equals(correctUserName)) {
      System.out.println("username is not correct");
    } else {
      System.out.println("userpass is not correct");
    }



  }
}