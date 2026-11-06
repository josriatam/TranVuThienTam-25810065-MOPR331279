// Trần Vũ Thiên Tâm - 25810065
// Buoi 2 - Bai 04: Phan loai chi so khoi co the (if else if)

fun main() {
    val cannangKg: Double = 82.4   // cân nặng (kg)
    val chieucaoM: Double = 1.74    // chiều cao (m)

    val bmi: Double = cannangKg / (chieucaoM * chieucaoM)

    // Dùng if / else if nhiều nhánh (không dùng when)
    val category: String
    if (bmi < 18.5) {
        category = "Gầy"
    } else if (bmi < 25.0) {
        category = "Bình thường"
    } else if (bmi < 30.0) {
        category = "Thừa cân"
    } else {
        category = "Béo phì"
    }

    println("Cân nặng: $cannangKg kg, chiều cao: $chieucaoM m")
    println("Chỉ số BMI: ${"%.2f".format(bmi)}")
    println("Phân loại: $category")
}
