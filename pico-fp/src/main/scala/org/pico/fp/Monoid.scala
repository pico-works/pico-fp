package org.pico.fp

trait Monoid[A] extends Semigroup[A] {
  def zero: A
}
