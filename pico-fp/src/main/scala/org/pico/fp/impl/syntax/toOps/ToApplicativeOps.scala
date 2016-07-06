package org.pico.fp.impl.syntax.toOps

import org.pico.fp.impl.syntax.ops.ApplicativeOps_Gggv37e

import scala.language.implicitConversions

trait ToApplicativeOps extends ToApplyOps {
  @inline
  final implicit def applicativeOps_Gggv37e[A](self: A): ApplicativeOps_Gggv37e[A] = {
    new ApplicativeOps_Gggv37e[A](self)
  }
}
