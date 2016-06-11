package org.pico.fp

import scala.language.higherKinds

trait Monad[F[_]] extends Applicative[F] with Bind[F] {
  override def map[A, B](fa: F[A])(f: A => B) = bind(fa)(a => point(f(a)))
}
