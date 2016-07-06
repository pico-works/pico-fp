package org.pico.fp.impl.syntax.ops

import org.pico.fp.Applicative

import scala.language.higherKinds

class ApplicativeOps_Gggv37e[A](val self: A) extends AnyVal {
  @inline
  final def point[F[_]](implicit ev: Applicative[F]) = ev.point(self)
}
