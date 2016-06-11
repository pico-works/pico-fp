package org.pico.fp

import scala.language.higherKinds

package object syntax {
  implicit class ApplicativeOps_Gggv37e[A](val self: A) {
    def point[F[_]](value: A)(implicit ev: Applicative[F]) = ev.point(value)
  }

  implicit class BindOps_Gggv37e[F[_], A](val self: F[A]) {
    def flatMap[B](f: A => F[B])(implicit ev: Bind[F]) = ev.bind(self)(f)
  }

  implicit class ApplyOps_Gggv37e[F[_], A](val self: F[A]) {
    final def <*>[B](f: F[A => B])(implicit ev: Apply[F]): F[B] = ev.ap(self)(f)

    final def *>[B](fb: F[B])(implicit ev: Apply[F]): F[B] = ev.apply2(self,fb)((_,b) => b)

    final def <*[B](fb: F[B])(implicit ev: Apply[F]): F[A] = ev.apply2(self,fb)((a,_) => a)
  }
}
