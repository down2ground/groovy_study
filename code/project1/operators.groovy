assert 3 + 5 == 8
def (int a, int b) = [7, 4]
assert a / b == 1.75 // normal division
assert a.intdiv(b) == 1 // integer division
assert 5 % 3 == 2   // modulo (remainder)
assert 3 ** 3 == 27 // power

int i = 3
assert "${i++}, ${i}" == "3, 4" // postfix increment
assert "${--i}, ${i}" == "3, 3" // prefix decrement

i **= 2 // assignment operators
assert i == 9

assert 1 == 1 || 5 >= 3
assert false && true || true       // && has precedence
assert !(false && (true || true))

// bitwise operators
assert (0b0011 & 0b0101) == 0b0001
assert (0b0011 ^ 0b0101) == 0b0110
assert (~0b01 & 0b11)  == 0b10 // bitwise negation (we need the mask 0b11 to cut the sign digit)

def result = i > 0 ? "OK" : "" // ternary operator
assert result // using the "Groovy truth" rules

def String greeting(String name) {
    return "Hello ${name ?: "stranger"}!" // Elvis operator ?:
}

assert greeting("Bob") == "Hello Bob!"
assert greeting("") == "Hello stranger!"









