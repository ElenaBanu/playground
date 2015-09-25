import com.epo.functional.objects.Rational

val x = new Rational(1,2)
//val y = new Rational(5, 0)
val oneHalf = new Rational(1, 2)
val twoThirds = new Rational(2, 3)
oneHalf + twoThirds
oneHalf lessThan twoThirds
oneHalf max twoThirds
val y = new Rational(2,3)
val z = new Rational(66, 42)
oneHalf * twoThirds
x + x * y
(x + x) * y
twoThirds * 3
implicit def intToRational(x: Int) = new Rational(x)
3 * x
