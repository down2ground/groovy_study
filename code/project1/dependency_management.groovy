
@Grab('org.apache.commons:commons-collections4:4.5.0-M2')
import org.apache.commons.collections4.iterators.PermutationIterator

PermutationIterator<Integer> permutationIterator = new PermutationIterator<>([1, 2, 3])

while (permutationIterator.hasNext()) {
    println(permutationIterator.next())
}

// [1, 2, 3]
// [1, 3, 2]
// [3, 1, 2]
// [3, 2, 1]
// [2, 3, 1]
// [2, 1, 3]



