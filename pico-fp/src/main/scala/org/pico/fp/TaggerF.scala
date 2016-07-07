package org.pico.fp

import scala.language.higherKinds

class TaggerF[U] {
  def apply[F[_], T](t : F[T]): F[T @@ U] = t.asInstanceOf[F[T @@ U]]
}
