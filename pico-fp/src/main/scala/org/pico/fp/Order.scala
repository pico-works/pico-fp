package org.pico.fp

trait Order[A] extends Equal[A] {
  def order(a: A, b: A): Ordering

  override def equal(a: A, b: A): Boolean = order(a, b) == EQ
}

object Order {
  @inline
  final def apply[A: Order]: Order[A] = implicitly[Order[A]]
}
