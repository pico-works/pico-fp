package org.pico.fp.impl.syntax.toOps

import org.pico.fp.Monoid
import org.pico.fp.impl.syntax.ops.SemigroupOps_dTf9kCT

import scala.language.implicitConversions

trait ToSemigroupOps {
  @inline
  implicit final def semigroupOps_dTf9kCT[A](self: A): SemigroupOps_dTf9kCT[A] = {
    new SemigroupOps_dTf9kCT[A](self)
  }

  @inline
  final def mzero[A](implicit A: Monoid[A]): A = A.zero
}
