package org.pico.fp

trait Semigroup[A] {
  def append(f1: A, f2: => A): A
}
