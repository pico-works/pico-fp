package org.pico.fp

import scala.language.higherKinds

class Tagger[U] {
  def apply[T](t : T): T @@ U = t.asInstanceOf[T @@ U]
}
