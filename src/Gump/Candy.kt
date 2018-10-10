package Gump

abstract class Candy(open val name: String) {
    var isOpen: Boolean = false
    fun open() {
        isOpen = true
    }
}