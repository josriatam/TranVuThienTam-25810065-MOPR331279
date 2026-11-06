// Trần Vũ Thiên Tâm - 25810065
// Buoi 2 - Bai 01: Tinh tien mua hang

fun main() {
    val soLuongsp: Int = 3            // số lượng sản phẩm (số nguyên)
    val donGia: Double = 25000.0      // đơn giá (số thực), đơn vị: đồng
    val thueVAT: Double = 0.08       // thuế 8%

    // Bắt buộc ép kiểu số lượng sang Double trước khi nhân với đơn giá
    val tienHang: Double = soLuongsp.toDouble() * donGia
    val thue: Double = tienHang * thueVAT
    val tongTien: Double = tienHang + thue

    println("Số lượng: $soLuongsp sản phẩm")
    println("Đơn giá: ${"%.0f".format(donGia)} VND")
    println("Tiền hàng: ${"%.0f".format(tienHang)} VND")
    println("Thuế 8%: ${"%.0f".format(thue)} VND")
    println("Tổng tiền phải trả: ${"%.0f".format(tongTien)} VND")
}
