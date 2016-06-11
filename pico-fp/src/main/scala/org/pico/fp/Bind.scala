package org.pico.fp

import scala.language.higherKinds

trait Bind[F[_]] extends Apply[F] {
  def bind[A, B](fa: F[A])(f: A => F[B]): F[B]

  override def ap[A, B](fa: => F[A])(f: => F[A => B]): F[B] = {
    lazy val fa0 = fa
    bind(f)(map(fa0))
  }
}
