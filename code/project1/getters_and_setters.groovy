class Animal {
    String name   // must be declared with no access modifier
    float weight
}

def animal = new Animal()
animal.setName("cat")
animal.setWeight(12.7)

println animal.getName()    // cat
println animal.getWeight()  // 12.7
