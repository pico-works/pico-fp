package org.pico.fp.impl.syntax.std.ops

class AnyValOps_7WKvVDM[A](val self: A) extends AnyVal {
  /** Apply the function f to self.
    */
  def applyIn[B](f: A => B): B = f(self)
}
