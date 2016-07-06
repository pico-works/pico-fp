package org.pico.fp.impl.syntax.ops

import org.pico.fp._

import scala.language.higherKinds

class TaggedOps_8cgpMK8[V, T, F[_]](val self: F[V @@ T]) extends AnyVal {
  @inline
  final def untagged: F[V] = self.asInstanceOf[F[V]]
}
