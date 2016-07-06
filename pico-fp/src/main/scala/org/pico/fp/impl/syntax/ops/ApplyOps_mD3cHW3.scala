package org.pico.fp.impl.syntax.ops

import org.pico.fp.Apply
import org.pico.fp.syntax.apply._

import scala.language.higherKinds

class ApplyOps_mD3cHW3[Z[_], A, B, C, D, E, F](val self: (Z[A], Z[B], Z[C], Z[D], Z[E], Z[F])) extends AnyVal {
  @inline
  final def applyIn[R](f: A => B => C => D => E => F => R)(implicit ev: Apply[Z]): Z[R] = self._1.map(f) ap self._2 ap self._3 ap self._4 ap self._5 ap self._6

  @inline
  final def applyIn[R](f: (A, B, C, D, E, F) => R)(implicit ev: Apply[Z]): Z[R] = applyIn(f.curried)
}
