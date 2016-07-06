package org.pico.fp.impl.syntax.toOps

import org.pico.fp.impl.syntax.ops.BindOps_dYso3C7

import scala.language.{higherKinds, implicitConversions}

trait ToBindOps {
  @inline
  implicit final def bindOps_dYso3C7[F[_], A](self: F[A]): BindOps_dYso3C7[F, A] = {
    new BindOps_dYso3C7[F, A](self)
  }
}
