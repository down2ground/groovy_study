
assert "a"
assert !""
assert [1, 2]
assert ![]
assert 1
assert !0

String process(int n) {
    if (n > 0) return ""
    return "wrong argument"
}

assert process(0)
assert !process(1)