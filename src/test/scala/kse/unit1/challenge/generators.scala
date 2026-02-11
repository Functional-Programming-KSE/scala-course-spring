package kse.unit1.challenge

import kse.unit1.challenge.arithmetic.Number
import org.scalacheck.*

object generators:
  lazy val genSmallNonNegativeNumber: Gen[Number] = Gen.chooseNum(0, 8)
