package org.pico.fp.syntax.std.anyVal

import org.specs2.ScalaCheck
import org.specs2.mutable.Specification

class PackageSpec extends Specification with ScalaCheck {
  "The applying method should behave life the apply method except with reverse order of arguments" in {
    val f: Int => Int = _ + 1


    prop { a: Int =>
      (f apply a) must_=== (a applyIn f)
    }
  }
}
