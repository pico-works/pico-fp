package org.pico.fp.impl.syntax.ops

import org.pico.fp.Bind

import scala.language.higherKinds

class BindOps_dYso3C7[F[_], A](val self: F[A]) extends AnyVal {
  @inline
  final def flatMap[B](f: A => F[B])(implicit ev: Bind[F]) = ev.bind(self)(f)
}
