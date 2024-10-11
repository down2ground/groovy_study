
class Box {
    private int content = 0
    Box(int content) { this.content = content }
    Box add(int value) { content += value; return this }
    void show() { println(content) }
}
static Box box(int content) { return new Box(content) }

box(5).add(3).add(2).show() // 10
box 5 add 3 add 2 show() // 10

def string = "1234567"
println string.substring(1, 4)
//print (string substring 1 4)


show = { println it }
square_root = { Math.sqrt(it) }

static def please(action) {
    [the: { what ->
        [of: { n -> action(what(n)) }]
    }]
}

please(show).the(square_root).of(121)
// 11.0

please show the square_root of 121
// 11.0



