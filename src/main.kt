import java.io.*

class Reader(file: String?) {
    val reader: BufferedReader = when (file) {
        null -> BufferedReader(InputStreamReader(System.`in`))
        else -> BufferedReader(FileReader(file))
    }
}

fun solve(reader: Reader, out: BufferedWriter, type: String) {
    println("$type Solution:")

    for (line in reader.reader.readLines()) {
        println("$line:")

        if (type == "Sequential") {
            val solver = SolverSequential("0.0.0.0")
            for (char in line.split(' ')) {
                solver.getFirstAndLastIPsFor(char.toInt())
            }
        } else {
            val solver = SolverRecursive("0.0.0.0")
            for (char in line.split(' ')) {
                solver.getFirstAndLastIPsFor(char.toInt())
            }
        }

        println()
    }
    println("               ----- -----")
}

fun main() {
    solve(Reader("inputs/input.txt"), BufferedWriter(OutputStreamWriter(System.out)), "Recursive")
    solve(Reader("inputs/input.txt"), BufferedWriter(OutputStreamWriter(System.out)), "Sequential")
}