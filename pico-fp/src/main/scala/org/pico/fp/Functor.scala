package org.pico.fp

import scala.language.higherKinds

trait Functor[F[_]] extends InvariantFunctor[F] {
  def map[A, B](fa: F[A])(f: A => B): F[B]

  def xmap[A, B](fa: F[A], f: A => B, g: B => A): F[B] = map(fa)(f)
}
