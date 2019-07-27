import io.reactivex.rxkotlin.toObservable

fun main() {
    val arr = listOf(1, 2, 3, 4, 5, 6)
    arr.toObservable()
        .map { i -> i * 3 }
        .filter {i -> i % 2 == 0}
        .subscribe {v -> println(v)}

}
