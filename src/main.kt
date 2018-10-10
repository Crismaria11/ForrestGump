fun main(args: Array<String>) {
    val boxOfChocolate = RanBoxOfChocolates<Chocolate>(arrayListOf<Chocolate> {
    Chocolate("Hershey"),
    Chocolate("Musketeers"),
    Chocolate("M&M's")
    Chocolate(Snickers")
    });
    val ForrestGump = Gump<Chocolate>(boxOfChocolate);
    println(ForrestGump.sayTheLineForrest())
    println(ForrestGump.sayTheLineForrest())
}