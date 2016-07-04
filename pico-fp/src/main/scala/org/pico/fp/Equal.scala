package org.pico.fp

trait Equal[A] {
  def equal(a: A, b: A): Boolean
}
