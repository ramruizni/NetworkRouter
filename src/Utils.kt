import kotlin.math.pow

class Utils {
    companion object {

        val twoPower = { x: Int -> 2.toDouble().pow(x).toInt() }

        fun getIPFromInt(value: Int): String {
            return "${value / (256 * 256 * 256)}.${value / (256 * 256)}.${value / 256}.${(value % 256)}"
        }

        fun getIntFromIP(ip: String): Int {
            val values = ip.split('.').map { it.toInt() }
            return values[0] * 256 * 256 * 256 + values[1] * 256 * 256 + values[2] * 256 + values[3]
        }
    }
}