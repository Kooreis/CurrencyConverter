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
    }
}