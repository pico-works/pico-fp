package org.pico.fp.impl.syntax.ops

import org.pico.fp.Apply
import org.pico.fp.syntax.apply._
import org.pico.fp.syntax.functor._

import scala.language.higherKinds

class ApplyOps_4xjeQnw[Z[_], A, B, C, D](val self: (Z[A], Z[B], Z[C], Z[D])) extends AnyVal {
  @inline
  final def applyIn[R](f: A => B => C => D => R)(implicit ev: Apply[Z]): Z[R] = self._1.map(f) ap self._2 ap self._3 ap self._4

  @inline
  final def applyIn[R](f: (A, B, C, D) => R)(implicit ev: Apply[Z]): Z[R] = applyIn(f.curried)
}
