package chap03.section04

import java.util.concurrent.locks.ReentrantLock

var sharable = 1

fun main() {
    val reLock = ReentrantLock()

    lock(reLock, {cirticalFunc()})
    lock(reLock) {cirticalFunc()}
    lock(reLock, ::cirticalFunc)

    println(sharable)
}

fun cirticalFunc() {
    sharable += 1
}

fun <T> lock(reLock: ReentrantLock, body: () -> T): T {
    reLock.lock()
    try {
        return body()
    } finally {
        reLock.unlock()
    }
}