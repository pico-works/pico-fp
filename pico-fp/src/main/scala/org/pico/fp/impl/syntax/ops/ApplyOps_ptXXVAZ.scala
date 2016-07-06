package org.pico.fp.impl.syntax.ops

import org.pico.fp.Apply
import org.pico.fp.syntax.apply._

import scala.language.higherKinds

class ApplyOps_ptXXVAZ[Z[_], A, B, C](val self: (Z[A], Z[B], Z[C])) extends AnyVal {
  @inline
  final def applyIn[R](f: A => B => C => R)(implicit ev: Apply[Z]): Z[R] = self._1.map(f) ap self._2 ap self._3

  @inline
  final def applyIn[R](f: (A, B, C) => R)(implicit ev: Apply[Z]): Z[R] = applyIn(f.curried)
}
