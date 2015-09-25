package com.epo
import ChecksumAccumulator.calculate

/**
 * Created by ebanu on 9/15/2015.
 */
object FallWinterSpringSummer extends App {
  for (season <- List("fall", "winter", "spring"))
    println(season +": "+ calculate(season))
}
