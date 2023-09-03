package com.company.learn;

public class Interesting {
    private static final String[] units = {"", "bir", "iki", "üç", "dörd", "beş", "altı", "yeddi", "səkkiz", "doqquz"};
    private static final String[] tens = {"", "on", "iyirmi", "otuz", "qırx", "əlli", "altmış", "yetmiş", "səksən", "doxsan"};

    public static String convertNumberToText(int number) {
      if (number == 0) {
        return "sıfır";
      }

      if (number < 0 || number > 999) {
        throw new IllegalArgumentException("Number is out of range");
      }

      String result = "";

      int hundreds = number / 100;
      int remainder = number % 100;
      int tensDigit = remainder / 10;
      int unitsDigit = remainder % 10;

      if (hundreds > 0) {
        if (hundreds == 1){
          result += " yüz ";
        }else result += units[hundreds] + " yüz ";
      }

      if (remainder > 0) {
        if (remainder < 10) {
          result += units[remainder];
        } else if (remainder == 10) {
          result += " on ";
        } else if (remainder < 20) {
          result += tens[tensDigit];
          if (unitsDigit > 0) {
            result += " " + units[unitsDigit];
          }
        }
      }

      return result.trim();
    }

    public static void main(String[] args) {
      int number = 18;
      String textRepresentation = convertNumberToText(number);
      System.out.println(number + " -> " + textRepresentation);
    }
  }
