// Formatierte Tabellen-Ausgabe der Stromabrechnung
def billTable: String =
    // Formatierter MwSt.-Label mit Prozentsatz, linksbündig in 18 Zeichen
    val taxLabel = f"VAT (${(taxRate * 100).toInt}%%)".padTo(18, ' ')

    // Leere Felder für Spalten ohne Wert (Platzhalter)
    val blankQty = "        "      // 8 Leerzeichen
    val blankAmount = "          "  // 10 Leerzeichen

    // Formatierte Input-Werte mit fester Breite (rechtsbündig)
    val consumptionText = f"$consumptionKwh%8d"
    val monthsText = f"$months%8d"
    val averageText = String.format(java.util.Locale.US, "%8.1f", averageKwhPerMonth)

    // ASCII-Tabelle mit allen Kostenpositionen
    s"""|+--------------------+----------+----------+----------+
    || Item               | Quantity | Unit     | Amount   |
    |+--------------------+----------+----------+----------+
    || Energy (net)       | $consumptionText | kWh      | ${money(energyNet)} |
    || Standing (net)     | $monthsText | months   | ${money(standingNet)} |
    || Subtotal (net)     | $blankQty | | ${money(subtotalNet)} |
    || $taxLabel | $blankQty | | ${money(taxAmount)} |
    || Avg. consumption   | $averageText | kWh/mo   | $blankAmount |
    |+--------------------+----------+----------+----------+
    || Total (gross)      | $blankQty | | ${money(totalGross)} |
    |+--------------------+----------+----------+----------+""".stripMargin