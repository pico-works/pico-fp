package org.pico.fp.impl.syntax.ops

import org.pico.fp.Apply

import scala.language.higherKinds

class ApplyOps_aTbBqLC[F[_], A](val self: F[A]) {
  @inline
  final def <*>[B](f: F[A => B])(implicit ev: Apply[F]): F[B] = ev.ap(self)(f)

  @inline
  final def *>[B](fb: F[B])(implicit ev: Apply[F]): F[B] = ev.apply2(self,fb)((_,b) => b)

  @inline
  final def <*[B](fb: F[B])(implicit ev: Apply[F]): F[A] = ev.apply2(self,fb)((a,_) => a)
}
