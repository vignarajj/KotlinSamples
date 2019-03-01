fun main(){

    //Ask for user name
    print("Enter the name : ")
    val name:String = readLine()!!.toString()

    //Ask for age
    print("Enter the age : ")
    val age:Int = readLine()!!.toInt()
    print("Enter the amount : ")
    val amount:Double = readLine()!!.toDouble()

    println("User Details")
    println("--------------")
    println("Name :  $name")
    println("Age : $age")
    println("Amount : $amount")

}