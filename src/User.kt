class User() {
    var username = ""
    var password = ""

    var coba = "coba masih default"

    val getCoba get() = coba.toUpperCase()
    var setCoba:String=""
        set(value) {
        coba=value
    }


    fun login(username: String, password: String) {
        if (username.equals("admin", true) && password.equals("admin1234", true)) {
            println("welcome admin")
        } else {
            println("username & password salah")
        }
    }
}

fun main(args: Array<String>) {
    val user1 = User()
    user1.username = "admin"
    user1.password = "admin1234"
    println(user1.coba)
    user1.setCoba = "test coba"
    println(user1.coba+" dan getCoba to upper "+ user1.getCoba)



    user1.login(user1.username, user1.password)
}