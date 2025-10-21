import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Zadanie 1
       double stopnieCelcjusza, stopnieFahrenheita;
       Scanner scanner = new Scanner(System.in);
       System.out.println("Podaj liczbę stopni w celcjuszach");
       stopnieCelcjusza = scanner.nextDouble();
      stopnieFahrenheita = 1.8 * stopnieCelcjusza + 32;
     System.out.println("stopnie Fahrenheita: " + stopnieFahrenheita);
Zadanie 2
a = int(input("Podaj pierwszą liczbę: "))
b = int(input("Podaj drugą liczbę: "))
c = int(input("Podaj trzecią liczbę: "))

najwieksza = max(a, b, c)
najmniejsza = min(a, b, c)

print(f"Największa liczba to: {najwieksza}")
print(f"Najmniejsza liczba to: {najmniejsza}")

Zadanie 3
waga = float(input("Podaj wagę (kg): "))
wzrost = float(input("Podaj wzrost (m): "))

bmi = waga / (wzrost ** 2)
print(f"Twoje BMI wynosi: {bmi:.2f}")

if bmi < 18.5:
    print("Niedowaga")
elif bmi <= 24.9:
    print("Waga prawidłowa")
else:
    print("Nadwaga")

Zadanie 4
dochod = float(input("Podaj dochód (PLN): "))

if dochod <= 85528:
    podatek = 0.18 * dochod - 556.02
else:
    podatek = 14839.02 + 0.32 * (dochod - 85528)

if podatek < 0:
    podatek = 0

print(f"Należny podatek: {podatek:.2f} PLN")

Zadanie 5
cena = float(input("Podaj cenę towaru (100 - 10000 PLN): "))
rata = int(input("Podaj liczbę rat (6 - 48): "))

if cena < 100 or cena > 10000 or rata < 6 or rata > 48:
    print("Błędne dane wejściowe.")
else:
    if 6 <= rata <= 12:
        oprocentowanie = 0.025
    elif 13 <= rata <= 24:
        oprocentowanie = 0.05
    else:
        oprocentowanie = 0.10

    cena_koncowa = cena * (1 + oprocentowanie)
    rata_miesieczna = cena_koncowa / rata

    print(f"Oprocentowanie: {oprocentowanie * 100:.1f}%")
    print(f"Cena końcowa: {cena_koncowa:.2f} PLN")
    print(f"Wysokość jednej raty: {rata_miesieczna:.2f} PLN")

        }
    }
}