# Python Documentation

# Currency Converter

This Python script is a simple currency converter. It uses a predefined dictionary of exchange rates and a class-based approach to convert an amount from one currency to another.

## Class: CurrencyConverter

The `CurrencyConverter` class is the main class in this script. It contains a dictionary of exchange rates and a method for converting between currencies.

### Exchange Rates

The exchange rates are stored in a dictionary called `rates`. The keys in this dictionary are the currency codes (e.g., "USD", "EUR", "GBP", etc.), and the values are the exchange rates relative to 1 USD.

### Method: convert

The `convert` method takes three arguments: the amount to be converted, the currency to convert from, and the currency to convert to. It performs the conversion by dividing the amount by the exchange rate of the from-currency and then multiplying by the exchange rate of the to-currency.

## Function: main

The `main` function is the entry point of the script. It creates an instance of the `CurrencyConverter` class, prompts the user for input, performs the conversion, and prints the result.

### User Input

The user is prompted to enter the amount to be converted and the from- and to-currencies. The currency codes entered by the user are converted to uppercase to match the keys in the `rates` dictionary.

### Conversion and Output

The `convert` method of the `CurrencyConverter` instance is called with the user's input, and the result is printed in a formatted string.

## Libraries

This script does not import any libraries. It uses only built-in Python features.

## Usage

To use this script, simply run it in a Python environment. You will be prompted to enter the amount to be converted and the from- and to-currencies. The result of the conversion will be printed to the console.

---

# C# Documentation

# Currency Converter in C#

This is a simple console application written in C# that converts an amount from one currency to another.

## Script Description

The script prompts the user to input an amount, a base currency, and a target currency. It then converts the amount from the base currency to the target currency and displays the result.

## Code Breakdown

The script uses the following namespaces:

- `System`: This namespace contains fundamental classes and base classes that define commonly-used value and reference data types, events and event handlers, interfaces, attributes, and processing exceptions.
- `System.Collections.Generic`: This namespace contains interfaces and classes that define generic collections, which allow users to create strongly typed collections that provide better type safety and performance than non-generic strongly typed collections.

The script defines a `Dictionary` named `currencyRates` that stores currency codes as keys and their corresponding rates as values. The rates are relative to the US dollar (USD).

The script then prompts the user to enter an amount, a base currency, and a target currency. It reads these inputs using `Console.ReadLine()` and converts the amount and currency codes to the appropriate data types.

The script retrieves the rates for the base and target currencies from the `currencyRates` dictionary. It then calculates the converted amount by dividing the amount by the base rate and multiplying the result by the target rate.

Finally, the script displays the converted amount and the target currency code.

## Usage

To use the script, simply run it in a C# compatible environment. When prompted, enter the amount you want to convert, the code of the base currency, and the code of the target currency. The script will display the converted amount in the target currency.

---

# Java Documentation

# Currency Converter in Java

This repository contains a simple Java program that performs currency conversion. The program supports conversion between several popular currencies including Rupee, Dollar, Pound, Euro, Yen, and Ringgit.

## Program Description

The `CurrencyConverter` program prompts the user to select a currency they want to convert from, and then asks for the amount of money they want to convert. The program then calculates and displays the equivalent amount in all other supported currencies.

## Code Explanation

The program begins by importing the `java.util.Scanner` class, which is a part of the Java standard library. This class is used to read the user's input from the console.

```java
import java.util.Scanner;
```

The `main` method of the `CurrencyConverter` class is the entry point of the program. It first creates a `Scanner` object to read the user's input. It then declares several `double` variables to hold the amount of money to be converted and the conversion rates for each currency.

```java
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double amount, dollar, pound, code, euro, yen, ringgit, rupee;
```

The program then prompts the user to select a currency and enter an amount of money. It reads these values using the `Scanner` object.

```java
System.out.println("which currency You want to Convert ? ");
System.out.println("1:Ruppe \t2:Dollar \t3:Pound \n4:Euro \t5:Yen \t6:Ringgit ");
code = scanner.nextInt();

System.out.println("How much Money you want to convert ? ");
amount = scanner.nextFloat();
```

The program then uses a series of `if` statements to perform the appropriate currency conversion based on the user's selection. It calculates the equivalent amount in each other currency and displays the results.

```java
if (code == 1) {
    // Conversion from Rupee to other currencies
} else if (code == 2) {
    // Conversion from Dollar to other currencies
} // And so on for each currency
```

If the user enters an invalid selection, the program displays an error message.

```java
else {
    System.out.println("Invalid input");
}
```

The program ends after displaying the conversion results or the error message.

---
