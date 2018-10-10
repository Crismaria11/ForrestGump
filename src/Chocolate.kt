class Chocolate {
    open class Chocolate (val name: String) : Candy(name) {
        override fun toString(): String {
            return """
            name ${name}
        """.trimIndent()
        }
    }
}