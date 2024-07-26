fun main() {
    var firstname = "Vanessa"
    var lastname = "eMobilis"

    println(firstname)
    //Accessing an element in a string

    println(firstname[1])
    //Modifing a string
    println(lastname.uppercase())
    println(firstname.lowercase())

    //String concatenation -Joing strings
    println(firstname + lastname)
    println(firstname + " " + lastname)
    println(firstname.plus(lastname))

    //String Interpolation
    println("My firstname is" + firstname)
    println("My fristname is $firstname")
    var num1 = 67
    var num2 = 20
    println("The sum of $num1 and $num2 is" + (num1+num2))



}