package Gump

open class Chocolate (override val name: String) : Candy(name) {
    override fun toString(): String {
        return """
            name ${name}
        """.trimIndent()
    }
}