package org.pico.fp.impl.syntax.ops

import org.pico.fp.@@

import scala.language.higherKinds

class UntaggedOps_6HPvv4s[V, F[_]](val self: F[V]) extends AnyVal {
  @inline
  final def tagged[T]: F[V @@ T] = self.asInstanceOf[F[V @@ T]]
}
