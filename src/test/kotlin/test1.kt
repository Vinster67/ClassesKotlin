// Разрешение использовать короткое имя аннотации org.junit.jupiter.api.Test
import org.junit.jupiter.api.Test
// Разрешение использовать короткое имя для функции org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Tag

class Tests {
    @Test
    @Tag("Example")
    fun testSqr() {
        assertEquals(0, sqr(0))  // Проверить, что квадрат нуля это 0
        assertEquals(4, sqr(2))  // Проверить, что квадрат двух это 4
        assertEquals(9, sqr(-3)) // Проверить, что квадрат -3 это 9
    }

    @Test
    @Tag("quadraticRootNumber")
    fun quadraticRootNumber() {
        assertEquals(1, quadraticRootNumber(1.0, 2.0, 1.0))
        assertEquals(2, quadraticRootNumber(1.0, 3.0, 2.0))
        assertEquals(0, quadraticRootNumber(1.0, 4.0, 10.0))
    }

    @Test
    @Tag("isPrime")
    fun isPrime() {
        assertFalse(isPrime(1))
        assertTrue(isPrime(2))
        assertTrue(isPrime(5))
        assertTrue(isPrime(11))
        assertFalse(isPrime(4))
        assertFalse(isPrime(9))
        assertFalse(isPrime(15))
        var count = 0
        for (n in 2..7919) {
            if (isPrime(n)) {
                count++
            }
        }
        assertEquals(1000, count)
        count = 0
        for (n in 2..1000000) {
            if (isPrime(n)) {
                count++
            }
        }
        assertEquals(78498, count)
    }

    @Test
    @Tag("Revert")
    fun revert() {
        assertEquals(87431, revert(13478))
        assertEquals(0, revert(0))
        assertEquals(3, revert(3))
        assertEquals(111, revert(111))
        assertEquals(17571, revert(17571))
        assertEquals(123456789, revert(987654321))
    }
}