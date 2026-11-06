// Trần Vũ Thiên Tâm - 25810065
// Buoi 2 - Bai 06: Day so Fibonacci nho hon 100 (vong lap for, khong de quy)

fun main() {
    var numFiboPrevious = 0   // số Fibonacci thứ 0
    var numFiboCurrent = 1    // số Fibonacci thứ 1

    // Không biết trước có bao nhiêu số < 100, nên cho for chạy tối đa 100 lần
    // và thoát bằng break khi giá trị đạt từ 100 trở lên.
    for (index in 0 until 100) {
        if (numFiboPrevious >= 100) break

        println("Vị trí $index: $numFiboPrevious")

        val numFiboNext = numFiboPrevious + numFiboCurrent
        numFiboPrevious = numFiboCurrent
        numFiboCurrent = numFiboNext
    }
}
