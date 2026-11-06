// Trần Vũ Thiên Tâm - 25810065
// Buoi 2 - Bai 03: Tai khoan ngan hang don gian

fun main() {
    // val: SỐ DƯ BAN ĐẦU LÀ MỐC CỐ ĐỊNH ĐỂ ĐỐI CHIẾU, không bao giờ thay đổi
    val soduBanDau: Int = 5_000_000

    // var: SỐ DƯ HIỆN TẠI THAY ĐỔI SAU MỖI GIAO DỊCH nên phải dùng var
    var soduHienTai: Int = soduBanDau

    println("Số dư ban đầu: $soduBanDau đồng")

    // Giao dịch 1: gửi thêm 2 triệu
    soduHienTai += 2_000_000
    println("Sau khi gửi 2.000.000 đồng, số dư: $soduHienTai đồng")

    // Giao dịch 2: rút 1,5 triệu
    soduHienTai -= 1_500_000
    println("Sau khi rút 1.500.000 đồng, số dư: $soduHienTai đồng")

    // Đối chiếu với số dư ban đầu (biến val vẫn giữ nguyên)
    println("Số dư ban đầu (đối chiếu): $soduBanDau" + " đồng")
}
