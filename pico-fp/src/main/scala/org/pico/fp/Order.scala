package org.pico.fp

trait Order[A] extends Equal[A] {
  def order(a: A, b: A): Ordering

  override def equal(a: A, b: A): Boolean = order(a, b) == EQ
}

object Order {
  @inline
  final def apply[A: Order]: Order[A] = implicitly[Order[A]]

  @inline
  final def apply[A](f: (A, A) => Ordering): Order[A] = {
    new Order[A] {
      override def order(a: A, b: A): Ordering = f(a, b)
    }
  }

  @inline
  final def fromComparison[A](f: (A, A) => Int): Order[A] = Order((a, b) => Ordering.of(f(a, b)))
}
