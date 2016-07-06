package org.pico.fp.impl.syntax.ops

import org.pico.fp.Apply
import org.pico.fp.syntax.functor._

import scala.language.higherKinds

class ApplyOps_4hDXayC[Z[_], A](val self: Z[A]) extends AnyVal {
  @inline
  final def applyIn[R](f: A => R)(implicit ev: Apply[Z]): Z[R] = self.map(f)
}
