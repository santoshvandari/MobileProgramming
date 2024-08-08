func factorial(num: Int) -> Int {
    var fact = 1
    for i in 1...num {
        fact *= i
    }
    return fact
}

print("Enter a Number: ")
var num=Int(readLine()!)!
print("Factorial:",(factorial(num:num)))

