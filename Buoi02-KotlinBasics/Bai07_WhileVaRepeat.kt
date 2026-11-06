// Trần Vũ Thiên Tâm - 25810065
// Buoi 2 - Bai 07: Dem nguoc va lap co dinh

fun main() {
    // Đoạn 1: đếm ngược từ 10 về 1 bằng while
    var dem = 10
    while (dem >= 1) {
        println(dem)
        dem--
    }

    // Đoạn 2: in một dòng cố định 5 lần bằng repeat
    repeat(5) {
        println("Xin chào Kotlin!")
    }

    // So sánh: dùng while khi số lần lặp phụ thuộc vào điều kiện thay đổi trong lúc chạy;
    // dùng repeat khi đã biết chắc số lần lặp cố định và không cần biến đếm.
}
