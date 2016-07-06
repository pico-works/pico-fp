package org.pico.fp.impl.syntax.toOps

import org.pico.fp.Monoid

trait ToMonoidOps extends ToSemigroupOps {
  @inline
  final def mzero[A](implicit A: Monoid[A]): A = A.zero
}
