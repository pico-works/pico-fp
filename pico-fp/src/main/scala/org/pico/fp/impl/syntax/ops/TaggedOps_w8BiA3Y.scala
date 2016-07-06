package org.pico.fp.impl.syntax.ops

import org.pico.fp._

import scala.language.higherKinds

class TaggedOps_w8BiA3Y[V, T, F[_, _], A](val self: F[A, V @@ T]) extends AnyVal {
  @inline
  final def untagged: F[A, V] = self.asInstanceOf[F[A, V]]
}
