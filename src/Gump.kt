class Gump<T> (val life: RanBoxOfChocolates<T>) {
    var isRunning: Boolean = false
    fun runForrest() {
        isRunning = true
    }

    fun saysTheLineForrest(): String {
        val picked = life.pickOne()

        if (picked == null) {
            return "Life Sucks :'("
        }
        return "Life is like a box of chocolates \n${picked}"
    }
}