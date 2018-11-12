package www.thomascilloni.xyz.icoot.models

import java.time.LocalDate

data class User (
    val username: String,
    val password: String?,  // does not need to put the password in every time
    val name: String,
    val surname: String,
    val phone: Int,
    val email: String,
    val address: String,
    val male: Boolean,
    val dateOfBirth: LocalDate
)