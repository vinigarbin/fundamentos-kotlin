package aula_21_classe_singleton

object DatabaseUtil {
    val url: String = "jdbc:mysql://localhost:8080/mydb"
    private val user: String = "admin"
    private val password: String = "admin"

    fun connect() {
        println("Conectando ao database $url | $user | $password")
    }
}

data object DatabaseHelper {

}


fun main() {
    DatabaseUtil.connect()

    println(DatabaseUtil)
    println(DatabaseHelper)
}