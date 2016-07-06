package org.pico.fp.impl.syntax.ops

import org.pico.fp.Apply

import scala.language.higherKinds

class ApplyOps_rbxCYvU[Z[_], A, R](val self: Z[A => R]) extends AnyVal {
  @inline
  final def ap(f: Z[A])(implicit ev: Apply[Z]): Z[R] = ev.ap(f)(self)
}
