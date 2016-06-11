package org.pico.fp

import scala.language.higherKinds

trait Applicative[F[_]] extends Apply[F] {
  def point[A](a: => A): F[A]
}
