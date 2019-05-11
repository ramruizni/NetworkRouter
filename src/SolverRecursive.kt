import Utils.Companion.getIPFromInt
import Utils.Companion.getIntFromIP
import Utils.Companion.twoPower

class SolverRecursive(initialIP: String) {
    private var sum = getIntFromIP(initialIP)

    fun getFirstAndLastIPsFor(newIPs: Int) {
        var i = 0
        while (twoPower(i) <= newIPs) i++
        i--
        val remaining = newIPs - twoPower(i)
        print("${getIPFromInt(sum)}($sum) -> ")
        sum += twoPower(i)
        println("${getIPFromInt(sum)}(${sum - 1})")

        //println("$newIPs - ${twoPower(i)} = ${sum}")

        if (remaining > 0) {
            getFirstAndLastIPsFor(newIPs - twoPower(i))
        }
    }

}