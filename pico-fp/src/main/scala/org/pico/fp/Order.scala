package org.pico.fp

trait Order[A] extends Equal[A] {
  def order(a: A, b: A): Ordering
}
