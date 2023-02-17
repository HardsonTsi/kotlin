fun getPrice(price: Double, couponCode: String = "None") {
    var finalPrice: Double = price

    if (couponCode == "save15") {
        finalPrice = price * 0.85
    }

    println("The total price is $finalPrice")

}


fun main() {
    // invoke kotlin.getPrice() function
    getPrice(price = 48.0, couponCode = "save15")
    // or
    getPrice(48.0, "save15")

    // observe what happens when no argument for couponCode is given
    getPrice(price = 48.0)
    // or
    getPrice(48.0)

}