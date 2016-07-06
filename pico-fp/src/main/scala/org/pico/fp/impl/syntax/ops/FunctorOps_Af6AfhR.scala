package org.pico.fp.impl.syntax.ops

import org.pico.fp.Functor

import scala.language.higherKinds

class FunctorOps_Af6AfhR[F[_], A](val self: F[A]) extends AnyVal {
  @inline
  final def map[B](f: A => B)(implicit ev: Functor[F]): F[B] = ev.map(self)(f)
}
