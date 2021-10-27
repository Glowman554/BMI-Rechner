# Pseudo code

## Einseitige Auswahl

```java
WENN BMI < 18.5
	gewichtsklasse <- "Untergewicht"
ENDE WENN
```

### Java:

```java
String gewichtsklasse = "";

if (bmi < 18.5)
{
	gewichtsklasse = "Untergewicht";
}
```

## Zweiseitige Auswahl

```java
WEN pGewicht negativ
	gewicht <- -pGewicht
SONST
	gewicht <- pGewicht
ENDE WENN

```

#### Java:

```java
if (pGewicht < 0)
{
	gewicht = -pGewicht;
}
else
{
	gewicht = pGewicht;
}
```

## Datenkapselung

Fehleingaben werden durch methoden abgefangen und gegebenenfalls korrigiert.

## Erläuterungen zum queltext
