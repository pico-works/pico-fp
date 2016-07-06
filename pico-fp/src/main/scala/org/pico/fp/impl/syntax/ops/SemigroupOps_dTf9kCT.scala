package org.pico.fp.impl.syntax.ops

import org.pico.fp.Semigroup

class SemigroupOps_dTf9kCT[A](val self: A) extends AnyVal {
  @inline
  final def |+|(that: => A)(implicit ev: Semigroup[A]): A = ev.append(self, that)
}
