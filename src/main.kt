fun main() {
    campus()

    nameAge("Brenda", 21)

    myString("I love Kotlin")

    myIdentity("Brenda")
}

//Given a string “akirachix”. Write a function that prints out a string
//composed of the first, third and fourth characters of the string.
fun campus() {
    var x = "akirachix"
    var char1 = x[0]
    var char3 = x[2]
    var char4 = x[3]
    println("$char1$char3$char4")
}

//Write a function that takes in 2 parameters, name and age and returns a
//String with this structure “Hi, my name is x and I am y years old.” Where x and
//y are the provided name and age respectively.

fun nameAge(name: String, age:Int): String {
    var stmt = "Hi, my name is $name and I am $age years old."
    println(stmt)
    return(stmt)
}

//Write a function that takes in a String and returns its length.

fun myString(x:String):Int {
    var txt = x.length
    println(txt)
    return txt
}

//Write a function that takes in a name and prints out “That’s me!” when your name is passed to it,
//otherwise it prints out “I don’t know who that is”

fun myIdentity(name: String) {
    var result3 = if (name == "Brenda") "That’s me!" else "I don’t know who that is"
    println(result3)
}
