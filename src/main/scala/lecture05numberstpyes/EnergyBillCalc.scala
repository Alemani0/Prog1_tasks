// Konvertierung zu BigDecimal für genaue Dezimalberechnung
val hundred: BigDecimal = BigDecimal(100)
val consumptionBd: BigDecimal = BigDecimal(consumptionKwh)
val priceBd: BigDecimal = BigDecimal(pricePerKwh.toString)
val standingBd: BigDecimal = BigDecimal(standingChargePerMonth.toString)  // Grundgebühr pro Monat
val taxRateBd: BigDecimal = BigDecimal(taxRate.toString)
val monthsBd: BigDecimal = BigDecimal(months)

// Berechnung der Kosten
val energyNet: BigDecimal = consumptionBd * priceBd              // Stromkosten netto
val standingNet: BigDecimal = monthsBd * standingBd             // Grundgebühr netto
val subtotalNet: BigDecimal = energyNet + standingNet           // Summe netto
val taxAmount: BigDecimal = subtotalNet * taxRateBd             // MwSt.-Betrag
val totalGross: BigDecimal = subtotalNet + taxAmount            // Gesamtsumme brutto

// Durchschnittlicher Verbrauch pro Monat
val averageKwhPerMonth: Double = consumptionKwh.toDouble / months

// Konvertiert einen BigDecimal-Betrag zu Cent-Wert (ganze Zahl)
def toCents(amount: BigDecimal): BigInt =
  (amount * hundred).setScale(0, BigDecimal.RoundingMode.HALF_UP).toBigInt

// Formatiert einen Betrag als Geldwert mit € Symbol (Deutsche Formatierung)
def money(amount: BigDecimal): String =
  String.format(java.util.Locale.GERMANY, "%8.2f €", amount.bigDecimal)