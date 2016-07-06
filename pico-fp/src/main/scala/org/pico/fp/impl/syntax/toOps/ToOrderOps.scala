package org.pico.fp.impl.syntax.toOps

import org.pico.fp.impl.syntax.ops.OrderOps_dTf9kCT

import scala.language.implicitConversions

trait ToOrderOps {
  @inline
  implicit final def orderOps_dTf9kCT[A](self: A): OrderOps_dTf9kCT[A] = {
    new OrderOps_dTf9kCT[A](self)
  }
}
