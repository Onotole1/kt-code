package ru.netology

fun calculatePrice(
    itemCount: Int,
    itemPrice: Int = 100,
    discount: Int = 100,
    discountStart: Int = 1_000,
    userLevel: String = "normal"
): Int {
    val total = itemPrice * itemCount
    val discounted = if (total > discountStart) {
        total - discount
    } else {
        total
    }
    val level: Double = userLevelToDiscount(userLevel)
    return ((1 - level) * discounted).toInt()
}

fun userLevelToDiscount(level: String = "normal"): Double = when (level) {
    "gold" -> 0.1
    "silver" -> 0.05
    else -> 0.0
}



