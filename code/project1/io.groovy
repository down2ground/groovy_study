File inputFile = new File("data.txt")

println inputFile.isFile()       // true
println inputFile.isDirectory()  // false
println inputFile.length()  // 24

println inputFile.text
// Line 1
// Line 2
// Line 3

println inputFile.collect { it }[0..1] // [Line 1, Line 2]
println inputFile as String[] // [Line 1, Line 2, Line 3] // array
println inputFile.readLines() // [Line 1, Line 2, Line 3] // list
println inputFile.eachLine { print "$it|"} // Line 1|Line 2|Line 3|null
println inputFile.eachLine { line, i -> print "$i. $line|"}
// 1. Line 1|2. Line 2|3. Line 3|null

inputFile.withReader { reader ->
    int character
    while ((character = reader.read()) != 1) {
        String symbol = character as char
        if (symbol.isNumber()) break
        print symbol
    }
    println() // Line
}

File outputFile = new File("out.txt")
println outputFile.delete() // false // that's because the file does not exist yet
try (def reader = inputFile.newReader()) {
    outputFile.append(reader)
}
outputFile << "One more line"
println outputFile.text
// Line 1
// Line 2
// Line 3
// One more line

outputFile.withWriter { it.writeLine("written with writer") }
outputFile.append("appended line")
println outputFile.text
// written with writer
// appended line

byte[] data = inputFile.bytes
println data[0..8] // [76, 105, 110, 101, 32, 49, 13, 10, 76]
// 32 is a space; 13, 10 are `\r\n`

File parent = new File(new File(inputFile.absolutePath).parent)
println parent.name // project1
parent.listFiles {file -> file.isFile() && file.name.endsWith(".txt") }
        .each {file -> print "${file.name}, "}
println() // data.txt, data_types_numbers_out.txt, out.txt,




