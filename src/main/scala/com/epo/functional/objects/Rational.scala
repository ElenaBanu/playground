package com.epo.functional.objects

/**
 * Created by ebanu on 9/25/2015.
 */
class Rational(n: Int, d: Int) {
  require(d != 0)
  private val g = gcd(n.abs, d.abs)
  val numer: Int = n / g
  val denom: Int = d / g

  /**
   * In Scala, every auxiliary constructor must invoke another constructor of
   * the same class as its first action.
   *
   * The net effect of this rule is that every constructor invocation
   * in Scala will end up eventually calling the primary constructor of the
   * class. The primary constructor is thus the single point of entry of a class.
   */
  def this(n: Int) = this(n, 1) // auxiliary constructor

  def +(that: Rational): Rational =
    new Rational(numer * that.denom + that.numer * denom, denom * that.denom)

  def +(i: Int): Rational = new Rational(numer + i * denom, denom)

  def -(that: Rational): Rational =
    new Rational(numer * that.denom - that.numer * denom, denom * that.denom)

  def -(i: Int): Rational = new Rational(numer - i * denom, denom)

  def *(that: Rational): Rational = new Rational(numer * that.numer, denom * that.denom)

  def * (i: Int): Rational = new Rational(numer * i, denom)

  def / (that: Rational): Rational =
    new Rational(numer * that.denom, denom * that.numer)

  def / (i: Int): Rational =
    new Rational(numer, denom * i)

  def lessThan(that: Rational) = this.numer * that.denom < that.numer * this.denom

  def max(that: Rational) = if (lessThan(that)) that else this

  /**
   *
   * @param a
   * @param b
   * @return Greatest common divisor between a and b
   */
  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a
    else {
      //      println("a: " + a + " - b: " + b + " - a % b: " + a % b)
      gcd(b, a % b)
    }

  override def toString = numer + "/" + denom
}
