// Trần Vũ Thiên Tâm - 25810065
// Buoi 2 - Bai 02: Gioi thieu ban than

fun main() {
    val hoTen = "Trần Vũ Thiên Tâm"
    val namSinh = 2004
    val namHienTai = 2026
    val tuoi = namHienTai - namSinh

    // Dùng string template ($ và ${...}), không dùng phép cộng chuỗi
    println("Xin chào, tôi là $hoTen, sinh năm $namSinh, năm nay tôi $tuoi tuổi.")
    println("Năm sinh $namSinh và năm hiện tại $namHienTai, nên tuổi = ${namHienTai - namSinh}.")
}
