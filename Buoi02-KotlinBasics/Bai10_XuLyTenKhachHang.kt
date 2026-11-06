// Trần Vũ Thiên Tâm - 25810065
// Buoi 2 - Bai 10: Xu ly ten khach hang co the rong (null safety)

fun motaKhachHang(tenKhachHang: String?) {
    // 1. Safe call (?.): nếu customerName null thì cả biểu thức trả về null, không bị lỗi
    val dodaiTen: Int? = tenKhachHang?.length
    println("Độ dài tên (safe call): $dodaiTen")

    // 2. Toán tử Elvis (?:): dùng giá trị mặc định khi bên trái là null
    val tenHienThi: String = tenKhachHang ?: "Khách vãng lai"
    println("Tên hiển thị (Elvis): $tenHienThi")

    // Kết hợp safe call và Elvis: độ dài = 0 nếu tên null
    val dodaiTenAnToan: Int = tenKhachHang?.length ?: 0
    println("Độ dài an toàn: $dodaiTenAnToan")
}

fun main() {
    println("--- Khách có tên ---")
    motaKhachHang("Trần Thị B")

    println("--- Khách không có tên (null) ---")
    motaKhachHang(null)

    // 3. Toán tử !! (ép kiểu non-null)
    println("--- Minh hoạ toán tử !! ---")
    val tenDaBiet: String? = "Lê Văn C"
    println("Độ dài (dùng !!): ${tenDaBiet!!.length}")

    // Cảnh báo: !! báo cho compiler "tôi chắc chắn biến này không null". Nếu biến thực sự
    // là null thì chương trình ném NullPointerException và bị crash khi đang chạy.
    // Vì vậy chỉ dùng !! khi chắc chắn tuyệt đối biến không rỗng; còn lại nên dùng ?. hoặc ?:
    val tenDeTrong: String? = null
    try {
        println(tenDeTrong!!.length)
    } catch (e: NullPointerException) {
        println("Lỗi khi dùng !! với biến null: NullPointerException")
    }
}
