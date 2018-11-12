package www.thomascilloni.xyz.icoot.models

import java.time.LocalDate

data class Rental(
    val id: String,
    val status: Int,
    val datePicked: LocalDate,
    val dateReturned: LocalDate?,
    val payed: Float,
    val userID: String,
    val carLicence: String,
    val pricePerDay: Float
) {
    fun getPrice(): Float {
        if (dateReturned != null) {
            return ((dateReturned.year - datePicked.year)*365 +
                    (dateReturned.dayOfYear - datePicked.dayOfYear)
                    )*pricePerDay
        } else {
            return (datePicked.until(LocalDate.now()).days)*pricePerDay
        }
    }
}