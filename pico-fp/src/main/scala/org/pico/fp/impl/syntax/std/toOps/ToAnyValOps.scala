package org.pico.fp.impl.syntax.std.toOps

import org.pico.fp.impl.syntax.std.ops.AnyValOps_7WKvVDM

import scala.language.higherKinds

trait ToAnyValOps {
  @inline
  implicit final def anyValOps_7WKvVDM[A](self: A): AnyValOps_7WKvVDM[A] = {
    new AnyValOps_7WKvVDM[A](self)
  }
}
