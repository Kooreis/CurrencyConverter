```python
class CurrencyConverter:
    rates = {
        "USD": 1,
        "EUR": 0.85,
        "GBP": 0.75,
        "JPY": 110.15,
        "CNY": 6.45
    }

    def convert(self, amount, from_currency, to_currency):
        return (amount / self.rates[from_currency]) * self.rates[to_currency]

def main():
    converter = CurrencyConverter()

    amount = float(input("Enter the amount: "))
    from_currency = input("From Currency: ").upper()
    to_currency = input("To Currency: ").upper()

    result = converter.convert(amount, from_currency, to_currency)

    print(f"{amount} {from_currency} = {result} {to_currency}")

if __name__ == "__main__":
    main()
```