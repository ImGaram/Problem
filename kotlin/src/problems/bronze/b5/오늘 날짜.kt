import java.text.SimpleDateFormat
import java.util.Date

fun main() {
    val time = System.currentTimeMillis()
    val date = Date(time)
    val dateFormat = SimpleDateFormat("yyyy-MM-dd")

    println(dateFormat.format(date))
}