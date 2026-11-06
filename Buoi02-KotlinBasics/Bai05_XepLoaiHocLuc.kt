// Trần Vũ Thiên Tâm - 25810065
// Buoi 2 - Bai 05: Xep loai hoc luc (when + range)

fun main() {
    val diemTB: Double = 7.8   // điểm trung bình, thang điểm 10

    // Dùng when kết hợp range (không dùng if else)
    val hocluc: String = when (diemTB) {
        in 8.5..10.0 -> "Xuất sắc"
        in 7.0..<8.5 -> "Giỏi"
        in 5.5..<7.0 -> "Khá"
        in 4.0..<5.5 -> "Trung bình"
        in 0.0..<4.0 -> "Yếu"
        else -> "Điểm không hợp lệ"
    }

    println("Điểm trung bình: $diemTB")
    println("Xếp loại: $hocluc")

    // So sánh với Bài 04: when + range gọn và dễ đọc hơn chuỗi if / else if,
    // vì mỗi nhánh nêu rõ khoảng giá trị (range) của nó.
}
