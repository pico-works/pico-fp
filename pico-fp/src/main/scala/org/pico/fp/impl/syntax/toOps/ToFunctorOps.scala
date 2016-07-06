package org.pico.fp.impl.syntax.toOps

import org.pico.fp.impl.syntax.ops.FunctorOps_Af6AfhR

import scala.language.{higherKinds, implicitConversions}

trait ToFunctorOps {
  @inline
  implicit final def functorOps_Af6AfhR[F[_], A](self: F[A]): FunctorOps_Af6AfhR[F, A] = {
    new FunctorOps_Af6AfhR[F, A](self)
  }
}
