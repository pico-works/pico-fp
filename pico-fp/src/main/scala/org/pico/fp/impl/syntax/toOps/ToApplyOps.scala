package org.pico.fp.impl.syntax.toOps

import org.pico.fp.impl.syntax.ops._

import scala.language.{higherKinds, implicitConversions}

trait ToApplyOps {
  @inline
  implicit final def applyOps_aTbBqLC[F[_], A](self: F[A]): ApplyOps_aTbBqLC[F, A] = {
    new ApplyOps_aTbBqLC[F, A](self)
  }

  @inline
  implicit final def applyOps_rbxCYvU[Z[_], A, R](self: Z[A => R]): ApplyOps_rbxCYvU[Z, A, R] = {
    new ApplyOps_rbxCYvU[Z, A, R](self)
  }

  @inline
  implicit final def applyOps_4hDXayC[Z[_], A](self: Z[A]): ApplyOps_4hDXayC[Z, A] = {
    new ApplyOps_4hDXayC[Z, A](self)
  }

  @inline
  implicit final def ApplyOps_8XpxLNu[Z[_], A, B](self: (Z[A], Z[B])): ApplyOps_8XpxLNu[Z, A, B] = {
    new ApplyOps_8XpxLNu[Z, A, B](self)
  }

  @inline
  implicit final def applyOps_ptXXVAZ[Z[_], A, B, C](self: (Z[A], Z[B], Z[C])): ApplyOps_ptXXVAZ[Z, A, B, C] = {
    new ApplyOps_ptXXVAZ[Z, A, B, C](self)
  }

  @inline
  implicit final def applyOps_4xjeQnw[Z[_], A, B, C, D](self: (Z[A], Z[B], Z[C], Z[D])): ApplyOps_4xjeQnw[Z, A, B, C, D] = {
    new ApplyOps_4xjeQnw[Z, A, B, C, D](self)
  }

  @inline
  implicit final def applyOps_7byu6fr[Z[_], A, B, C, D, E](self: (Z[A], Z[B], Z[C], Z[D], Z[E])): ApplyOps_7byu6fr[Z, A, B, C, D, E] = {
    new ApplyOps_7byu6fr[Z, A, B, C, D, E](self)
  }

  @inline
  implicit final def applyOps_mD3cHW3[Z[_], A, B, C, D, E, F](self: (Z[A], Z[B], Z[C], Z[D], Z[E], Z[F])): ApplyOps_mD3cHW3[Z, A, B, C, D, E, F] = {
    new ApplyOps_mD3cHW3[Z, A, B, C, D, E, F](self)
  }
}
