
def nCopies = { int n, String str -> str * n }
def twice = nCopies.curry(2) // left currying
println twice("go ") // go go

def hi = nCopies.rcurry('hi ') // right currying
println hi(2) // hi hi

def volume = { double l, double w, double h -> l * w * h }
def area = volume.ncurry(1, 1d)
println volume(2, 1, 3) // 6.0
println area(2, 3) // 6.0




