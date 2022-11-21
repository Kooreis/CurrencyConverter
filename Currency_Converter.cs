```CSharp
using System;
using System.Collections.Generic;

class Program
{
    static void Main(string[] args)
    {
        Dictionary<string, decimal> currencyRates = new Dictionary<string, decimal>()
        {
            {"USD", 1.00m},
            {"EUR", 0.85m},
            {"GBP", 0.75m},
            {"JPY", 110.15m},
            {"AUD", 1.35m}
        };

        Console.WriteLine("Enter the amount:");
        string amountInput = Console.ReadLine();
        decimal amount = decimal.Parse(amountInput);

        Console.WriteLine("Enter the base currency:");
        string baseCurrency = Console.ReadLine().ToUpper();

        Console.WriteLine("Enter the target currency:");
        string targetCurrency = Console.ReadLine().ToUpper();

        decimal baseRate = currencyRates[baseCurrency];
        decimal targetRate = currencyRates[targetCurrency];

        decimal convertedAmount = (amount / baseRate) * targetRate;

        Console.WriteLine($"{amount} {baseCurrency} is equivalent to {convertedAmount} {targetCurrency}");
    }
}
```