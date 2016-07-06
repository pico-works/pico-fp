package org.pico.fp.impl.syntax.ops

import org.pico.fp.Apply
import org.pico.fp.syntax.apply._

import scala.language.higherKinds

class ApplyOps_7byu6fr[Z[_], A, B, C, D, E](val self: (Z[A], Z[B], Z[C], Z[D], Z[E])) extends AnyVal {
  @inline
  final def applyIn[R](f: A => B => C => D => E => R)(implicit ev: Apply[Z]): Z[R] = self._1.map(f) ap self._2 ap self._3 ap self._4 ap self._5

  @inline
  final def applyIn[R](f: (A, B, C, D, E) => R)(implicit ev: Apply[Z]): Z[R] = applyIn(f.curried)
}
