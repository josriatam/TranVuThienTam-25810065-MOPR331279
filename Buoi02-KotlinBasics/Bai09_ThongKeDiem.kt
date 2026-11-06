// Trần Vũ Thiên Tâm - 25810065
// Buoi 2 - Bai 09: Thong ke diem bang mang

fun main() {
    val cacDiem = arrayOf(8.5, 7.0, 9.0, 6.5, 5.0, 7.5, 8.0, 4.5, 9.5, 6.0)

    var tongDiem = 0.0
    var diemCaoNhat = cacDiem[0]
    var diemThapNhat = cacDiem[0]

    // Tự viết vòng lặp so sánh từng phần tử (không dùng max / min có sẵn)
    for (diem in cacDiem) {
        tongDiem += diem
        if (diem > diemCaoNhat) {
            diemCaoNhat = diem
        }
        if (diem < diemThapNhat) {
            diemThapNhat = diem
        }
    }

    val diemTB = tongDiem / cacDiem.size

    println("Điểm trung bình cả lớp: ${"%.2f".format(diemTB)}")
    println("Điểm cao nhất: $diemCaoNhat")
    println("Điểm thấp nhất: $diemThapNhat")
}
