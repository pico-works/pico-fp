package org.pico.fp.impl.syntax.ops

import org.pico.fp.Apply
import org.pico.fp.syntax.apply._
import org.pico.fp.syntax.functor._

import scala.language.higherKinds

class ApplyOps_8XpxLNu[Z[_], A, B](val self: (Z[A], Z[B])) extends AnyVal {
  @inline
  final def applyIn[R](f: A => B => R)(implicit ev: Apply[Z]): Z[R] = self._1.map(f) ap self._2

  @inline
  final def applyIn[R](f: (A, B) => R)(implicit ev: Apply[Z]): Z[R] = applyIn(f.curried)
}

