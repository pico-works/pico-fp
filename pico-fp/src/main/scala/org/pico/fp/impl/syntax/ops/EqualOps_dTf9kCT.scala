package org.pico.fp.impl.syntax.ops

import org.pico.fp.Equal

class EqualOps_dTf9kCT[A](val self: A) extends AnyVal {
  @inline
  final def ===(that: => A)(implicit ev: Equal[A]): Boolean = ev.equal(self, that)
}
