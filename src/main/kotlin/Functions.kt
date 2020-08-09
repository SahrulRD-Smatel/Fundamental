fun main() {
    val user = setUser("Zethya", "Traveling with a girlfriend", 17)
    println(user)

}

fun setUser(name: String, hobby: String, age: Int) = "My name is $name, I like $hobby, and I'm 17 years old"