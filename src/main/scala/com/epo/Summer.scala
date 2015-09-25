package com.epo

import ChecksumAccumulator.calculate

/**
 * Created by ebanu on 9/15/2015.
 */
object Summer {
  def main(args: Array[String]) {
    for (arg <- args)
      println(arg +": "+ calculate(arg))
  }
}