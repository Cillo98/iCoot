package www.thomascilloni.xyz.icoot.models

data class Car (
    val brand: String,
    val model: String,
    val year: String,
    val kilometers: Int,
    val color: String,
    val engineSize: Int,
    val licencePlate: String,
    val pricePerDay: Float
)