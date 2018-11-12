package www.thomascilloni.xyz.icoot.models

import java.time.LocalDate

data class Reservation (
    val id: String,
    val status: Int,
    val dateCreated: LocalDate,
    val dateLastOperation: LocalDate,    // to keep track of when the last operation was performed
    val userID: String,
    val carLicence: String?,
    val carModel: Array<String>?
) {
    fun getCar(): String? {
        if (carLicence != null) {
            return carLicence
        }
        else {
            return carModel.toString()
        }
    }
}