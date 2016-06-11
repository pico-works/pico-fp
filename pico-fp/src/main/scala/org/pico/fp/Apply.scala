package org.pico.fp

import scala.language.higherKinds

trait Apply[F[_]] extends Functor[F] { self =>
  def ap[A,B](fa: => F[A])(f: => F[A => B]): F[B]

  def apply2[A, B, C](fa: => F[A], fb: => F[B])(f: (A, B) => C): F[C] = ap(fb)(map(fa)(f.curried))
}
