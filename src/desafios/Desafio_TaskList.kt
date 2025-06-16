package desafios

import java.util.Date
import kotlin.random.Random


sealed class Result(val y: Int) {
    data class Success(val data: String) : Result(20)
    data class Error(val exception: Exception) : Result(21)

}

fun handleResult(result: Result) {
    println(
        when (result) {
            is Result.Error -> "Houve um erro! ${result.exception.message}"
            is Result.Success -> "Sucesso! ${result.data}"
        }
    )
}


data class Task(
    val id: Int, val title: String, val description: String, val isCompleted: Boolean, val createdAt: Date
) {
    companion object {
        private const val LIMIT = 10000000

        fun generateKey(): Int {
            return Random.nextInt(LIMIT)
        }
    }
}

class TaskManager {
    private val list = mutableListOf<Task>()

    fun insert(task: Task) {
        require(task.title != "") { "O Titulo deve ser informado" }

        list.add(task)



        handleResult(Result.Success("Tarefa adicionada com sucesso! ID: ${task.id}"))
    }

    fun list() {
        for ((id, title, description, isCompleted) in list) {
            println("($title, $isCompleted)")
        }
    }

    fun getById(id: Int): Task? {
        return list.find { it.id == id }
    }

    fun updateIsCompleted(id: Int, isCompleted: Boolean): Boolean {
        val item = this.getById(id)

        requireNotNull(item) { "Tarefa não encontrada" }

        if (list.removeIf { it.id == id }) {
            val newItem = Task(item.id, item.title, item.description, isCompleted, item.createdAt)

            list.add(newItem)



            handleResult(Result.Success("Status da tarefa ID ${id} atualizado para ${isCompleted}"))
            return true
        }

        return false
    }

    fun delete(id: Int): Boolean {
        val item = this.getById(id)

        requireNotNull(item) { "Tarefa não encontrada" }

        if (list.removeIf { it.id == id }) {
            handleResult(Result.Success("Tarefa com ID ${id} removida com sucesso"))

            return true
        }

        handleResult(Result.Error(IllegalArgumentException("Tarefa de ID ${id} não deletado")))
        return false
    }

    fun getPendings(): List<Task> {
        return list.filter { !it.isCompleted }
    }

    fun getCompleted(): List<String> {
        return list.filter { it.isCompleted }.map { it.convertTaskToString() }
    }


}

fun Task?.convertTaskToString(): String {
    return "ID: ${this?.id} | Título: ${this?.title} | Concluído: ${this?.isCompleted} | Criado em: ${this?.createdAt}"
}


fun main() {
    val taskManager = TaskManager()


    val task01 = Task(Task.generateKey(), "Comprar pão", "Deve ir comprar pão a noite", false, Date())
    taskManager.insert(task01)

    val task02 = Task(Task.generateKey(), "Estudar Kotlin", "Deve estudar durante o dia", false, Date())
    taskManager.insert(task02)

    val task03 = Task(Task.generateKey(), "Fazer exercicios", "Deve ir comprar pão a noite", false, Date())
    taskManager.insert(task03)

    taskManager.list()

    taskManager.updateIsCompleted(task01.id, true)
    println(taskManager.getCompleted())

    taskManager.delete(task02.id)
}