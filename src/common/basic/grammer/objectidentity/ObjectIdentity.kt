package common.basic.grammer.objectidentity

fun main () {

}

class Product (val name : String, val price : Int) {
    override fun equals(other: Any?): Boolean {

        if (other is Product) {
            return other.name == name && other.price == price
        }

        return false;
    }
}