fun main(){

    println("Enter the first number : ")
    var number1:Double = readLine()!!.toDouble()
    println("Enter the second number : ")
    var number2:Double = readLine()!!.toDouble()

    if(number1 == 0.0 || number2 == 0.0){
        println("Invalid Entry")
        return
    }

    println("Select the option");
    println("1.Add\n2.Subtract\n3.Multiply\n4.Divide\n5.Do All\n6.Do Nothing")
    var options:Int = readLine()!!.toInt()

    var addition:Double?
    var subtract:Double?
    var multiple:Double?
    var divide:Double?

    if(options==1){
        addition =  number1+number2;
        println("Addition Result : $addition")
    }else if(options==2){
        subtract = number1 - number2
        println("Subtraction  Result : $subtract")
    }else if(options==3){
        multiple = number1 * number2;
        println("Multiplication result : $multiple")
    }else if(options==4){
        divide = number1 /number2;
        println("Division result : $divide")
    }else if(options==5){
        addition =  number1+number2;
        println("Addition Result : $addition")
        subtract = number1 - number2
        println("Subtraction  Result : $subtract")
        multiple = number1 * number2;
        println("Multiplication result : $multiple")
        divide = number1 /number2;
        println("Division result : $divide")
    }else {
        println("Exit")
    }



}