fun main(){

    println("Enter number one : ")
    var num1 = readLine()!!.toInt()
    println("Enter number two : ")
    var num2 = readLine()!!.toInt()

    println("Number 1 is $num1 Number 2 is $num2")

    var temp = num1
    num1 = num2
    num2 = temp


    println("After Swap\nNumber 1 is $num1 and Number 2 is $num2");

    /* Swap Numbers without variable */

    println("Swap Numbers without variable")

    println("Enter the number 1")
    var n1 = readLine()!!.toInt()

    println("Enter the number 2")
    var n2 = readLine()!!.toInt()

    n1 = n1+n2
    n2 = n1-n2
    n1 = n1-n2

    println("After Swapping  number 1 is $n1 and number 2 is $n2")

}

