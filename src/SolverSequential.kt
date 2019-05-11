import Utils.Companion.getIPFromInt
import Utils.Companion.getIntFromIP
import Utils.Companion.twoPower

class SolverSequential(initialIP: String) {
    private var assigned = 0
    private var previousIP = initialIP

    fun getFirstAndLastIPsFor(newIPs: Int) {
        var i = 1
        while (twoPower(i) >= newIPs) i++

        assigned = twoPower(i)

        val endingIP = getIPFromInt(getIntFromIP(previousIP) + newIPs - 1)
        println("$previousIP(${getIntFromIP(previousIP)}) -> $endingIP(${getIntFromIP(endingIP)})")
        previousIP = getIPFromInt(getIntFromIP(endingIP) + 1)
    }
}