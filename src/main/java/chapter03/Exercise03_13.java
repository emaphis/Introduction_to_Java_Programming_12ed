/*
 * Chapter 3
 * Section 3.8–3.16
 * Exercise 3.13
 */
package chapter03;

import java.util.Scanner;

/* Table 3.2 2009 U.S. Federal Personal Tax Rates
|-----------------------------------------------------------------------------------------------------------------
| Marginal |                     Married Filing Jointly or
| Tax Rate |         Single         Qualifying Widow(er)          Married Filing Separately     Head of Household
|-----------------------------------------------------------------------------------------------------------------
| 10%      |          $0–$8,350             $0–$16,700                       $0–$8,350                $0–$11,950
| 15%      |      $8,351–$33,950       $16,701–$67,900                   $8,351–$33,950          $11,951–$45,500
| 25%      |     $33,951–$82,250       $67,901–$137,050                 $33,951–$68,525          $45,501–$117,450
| 28%      |     $82,251–$171,550     $137,051–$208,850                 $68,526–$104,425        $117,451–$190,200
| 33%      |    $171,551–$372,950     $208,851–$372,950                $104,426–$186,475        $190,201–$372,950
| 35%      |        +372,951+             +372,951+                        +186,476+                +372,951+
----------------------------------------------------------------------------------------------------------------
*/

/**
 * The solution for computing taxes for single filers.
 *
 * @author emaph
 */
public class Exercise03_13 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter filing status
    System.out.print("(0-single filer, 1-married jointly or " +
        "qualifying widow(er), 2-married separately, 3-head of " +
        "household) Enter the filing status: ");

    int status = input.nextInt();

    // Prompt the user to enter taxable income
    System.out.print("Enter the taxable income: ");
    double income = input.nextDouble();

    // Compute tax
    double tax = 0;

    switch (status) {
      case 0:   // Compute tax for single filers
        if (income <= 8350)
          tax = income * 0.10;
        else if (income <= 33950)
          tax = 8350 * 0.10 + (income - 8350) * 0.15;
        else if (income <= 82250)
          tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
              (income - 33950) * 0.25;
        else if (income <= 171550)
          tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
              (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
        else if (income <= 372950)
          tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
              (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
              (income - 171550) * 0.33;
        else
          tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
              (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
              (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
        break;
      case 1:   // Compute tax for married file jointly or qualifying widow(er)
        break;
      case 2:   // Compute tax for married separately
        break;
      case 3:   // Compute tax for head of household
        break;
      default:
        System.out.println("Error: invalid status");
        System.exit(1);
    }

    // Display the result
    double result = (int)(tax * 100) / 100.0;
    System.out.println("Tax is " + result);
  }
}

/*
  (0-single filer, 1-married jointly or qualifying widow(er), 2-married separately, 3-head of household) Enter the filing status: 0
  Enter the taxable income: 400000
  Tax is 117683.5
*/
