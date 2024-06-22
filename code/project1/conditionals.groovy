
def n = 17
if (n > 0)
    println 'positive'
else if (n == 0)
    println 'zero'
else {
    print 'unfortunately '
    println 'negative'
}
// positive

String result
switch (n) {
    case 0:
        result = "zero"
        break
    case {n > 0}:              // not like in Java
        result = "positive"
        break
    case {n < 0}:
        result = "negative"
        break
    default:
        result = "invalid"
}
println result // positive
