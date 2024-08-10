// 16. Write a swift program to create an array and find maximum element.
func maxEl(numbers: [Int]) -> Int{
    var max = numbers[0];
    for el in numbers {
        if el > max {
            max = el;
        }
    }
    return max;
}

// Creating an array
let numbers = [23, 45, 12, 67, 34, 89, 10];

print("The Maximum Number in the array is:",(maxEl(numbers:numbers)));