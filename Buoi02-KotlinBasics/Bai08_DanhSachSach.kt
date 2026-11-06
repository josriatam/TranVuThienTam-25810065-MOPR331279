// Trần Vũ Thiên Tâm - 25810065
// Buoi 2 - Bai 08: Quan ly danh sach sach

fun main() {
    val sach = mutableListOf(
        "Lão Hạc",
        "Dế Mèn phiêu lưu ký",
        "Tắt đèn",
        "Số đỏ",
        "Truyện Kiều"
    )

    println("Danh sách ban đầu: $sach")

    // Thêm hai cuốn sách mới
    sach.add("Chí Phèo")
    sach.add("Nhật ký trong tù")

    // Xoá một cuốn theo tên
    sach.remove("Tắt đèn")

    // Sắp xếp theo thứ tự chữ cái bằng hàm có sẵn của Kotlin
    sach.sort()

    println("Danh sách sau khi thêm, xoá, sắp xếp: $sach")
}
