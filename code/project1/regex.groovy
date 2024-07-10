
// Find operator `=~` returns a `Matcher` that resolves to a `boolean`
println ((boolean) (' two words ' =~ /\S+\s+\S+/)) // true

// Match operator `==~` returns a `boolean` and is stricter (implicitly adds `^` and `$`)
println (' two words ' ==~ /\S+\s+\S+/) // false

def pattern = ~/[^\s]+/
println pattern.getClass() // class java.util.regex.Pattern

def matcher = "it's a needle in the hay" =~ pattern

println matcher // java.util.regex.Matcher[pattern=[^\s]+ region=0,24 lastmatch=]

while (matcher.find()) {
    print "${matcher.group()}, "
}
println() // it, s, a, needle, in, the, hay,

matcher = "it's a needle in the hay" =~ /(needle).*(hay)/ // using groups

println matcher[0]    // [needle in the hay, needle, hay]
println matcher[0][1] // needle
println matcher[0][2] // hay

