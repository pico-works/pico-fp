package org.pico.fp

import scala.language.higherKinds

package object syntax {
  implicit class ApplicativeOps_Gggv37e[A](val self: A) {
    @inline
    final def point[F[_]](implicit ev: Applicative[F]) = ev.point(self)
  }

  implicit class BindOps_dYso3C7[F[_], A](val self: F[A]) {
    @inline
    final def flatMap[B](f: A => F[B])(implicit ev: Bind[F]) = ev.bind(self)(f)
  }

  implicit class FunctorOps_Af6AfhR[F[_], A](val self: F[A]) extends AnyVal {
    @inline
    final def map[B](f: A => B)(implicit ev: Functor[F]): F[B] = ev.map(self)(f)
  }

  implicit class ApplyOps_aTbBqLC[F[_], A](val self: F[A]) {
    @inline
    final def <*>[B](f: F[A => B])(implicit ev: Apply[F]): F[B] = ev.ap(self)(f)

    @inline
    final def *>[B](fb: F[B])(implicit ev: Apply[F]): F[B] = ev.apply2(self,fb)((_,b) => b)

    @inline
    final def <*[B](fb: F[B])(implicit ev: Apply[F]): F[A] = ev.apply2(self,fb)((a,_) => a)
  }

  implicit class ApplyOps_rbxCYvU[Z[_], A, R](val self: Z[A => R]) extends AnyVal {
    @inline
    final def ap(f: Z[A])(implicit ev: Apply[Z]): Z[R] = ev.ap(f)(self)
  }

  implicit class ApplyOps_4hDXayC[Z[_], A](val self: Z[A]) extends AnyVal {
    @inline
    final def applyIn[R](f: A => R)(implicit ev: Apply[Z]): Z[R] = self.map(f)
  }

  implicit class ApplyOps_8XpxLNu[Z[_], A, B](val self: (Z[A], Z[B])) extends AnyVal {
    @inline
    final def applyIn[R](f: A => B => R)(implicit ev: Apply[Z]): Z[R] = self._1.map(f) ap self._2

    @inline
    final def applyIn[R](f: (A, B) => R)(implicit ev: Apply[Z]): Z[R] = applyIn(f.curried)
  }

  implicit class ApplyOps_ptXXVAZ[Z[_], A, B, C](val self: (Z[A], Z[B], Z[C])) extends AnyVal {
    @inline
    final def applyIn[R](f: A => B => C => R)(implicit ev: Apply[Z]): Z[R] = self._1.map(f) ap self._2 ap self._3

    @inline
    final def applyIn[R](f: (A, B, C) => R)(implicit ev: Apply[Z]): Z[R] = applyIn(f.curried)
  }

  implicit class ApplyOps_4xjeQnw[Z[_], A, B, C, D](val self: (Z[A], Z[B], Z[C], Z[D])) extends AnyVal {
    @inline
    final def applyIn[R](f: A => B => C => D => R)(implicit ev: Apply[Z]): Z[R] = self._1.map(f) ap self._2 ap self._3 ap self._4

    @inline
    final def applyIn[R](f: (A, B, C, D) => R)(implicit ev: Apply[Z]): Z[R] = applyIn(f.curried)
  }

  implicit class ApplyOps_7byu6fr[Z[_], A, B, C, D, E](val self: (Z[A], Z[B], Z[C], Z[D], Z[E])) extends AnyVal {
    @inline
    final def applyIn[R](f: A => B => C => D => E => R)(implicit ev: Apply[Z]): Z[R] = self._1.map(f) ap self._2 ap self._3 ap self._4 ap self._5

    @inline
    final def applyIn[R](f: (A, B, C, D, E) => R)(implicit ev: Apply[Z]): Z[R] = applyIn(f.curried)
  }

  implicit class ApplyOps_mD3cHW3[Z[_], A, B, C, D, E, F](val self: (Z[A], Z[B], Z[C], Z[D], Z[E], Z[F])) extends AnyVal {
    @inline
    final def applyIn[R](f: A => B => C => D => E => F => R)(implicit ev: Apply[Z]): Z[R] = self._1.map(f) ap self._2 ap self._3 ap self._4 ap self._5 ap self._6

    @inline
    final def applyIn[R](f: (A, B, C, D, E, F) => R)(implicit ev: Apply[Z]): Z[R] = applyIn(f.curried)
  }

  implicit class SemigroupOps_dTf9kCT[A](val self: A) extends AnyVal {
    @inline
    final def |+|(that: => A)(implicit ev: Semigroup[A]): A = ev.append(self, that)
  }

  implicit class EqualOps_dTf9kCT[A](val self: A) extends AnyVal {
    @inline
    final def ===(that: => A)(implicit ev: Equal[A]): Boolean = ev.equal(self, that)
  }

  implicit class OrderOps_dTf9kCT[A](val self: A) extends AnyVal {
    @inline
    final def ?|?(that: => A)(implicit ev: Order[A]): Ordering = ev.order(self, that)
  }

  @inline
  final def mzero[A](implicit A: Monoid[A]): A = A.zero
}
