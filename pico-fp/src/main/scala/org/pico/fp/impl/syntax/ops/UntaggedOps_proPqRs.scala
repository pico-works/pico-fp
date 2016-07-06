package org.pico.fp.impl.syntax.ops

import org.pico.fp.@@

import scala.language.higherKinds

class UntaggedOps_proPqRs[V, F[_, _], A](val self: F[A, V]) extends AnyVal {
  @inline
  final def tagged[T]: F[A, V @@ T] = self.asInstanceOf[F[A, V @@ T]]
}
