package org.pico.fp.impl.syntax.toOps

import org.pico.fp.impl.syntax.ops.EqualOps_dTf9kCT

import scala.language.implicitConversions

trait ToEqualOps {
  @inline
  implicit final def equalOps_dTf9kCT[A](self: A): EqualOps_dTf9kCT[A] = {
    new EqualOps_dTf9kCT[A](self)
  }
}
