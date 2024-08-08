func findMaxEl(array: [Int]) -> Int{
    var maxElement = array[0]
    for element in array {
        if element > maxElement {
            maxElement = element
        }
    }
    return maxElement
}

// Creating an array
let numbers = [23, 45, 12, 67, 34, 89, 10]

print("The maximum element in the array is:",(findMaxEl(array:numbers)))