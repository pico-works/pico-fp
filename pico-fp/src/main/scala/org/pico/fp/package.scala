package org.pico

package object fp {
  private[fp] type Tagged[A, T] = {type Tag = T; type Self = A}

  type @@[T, Tag] = Tagged[T, Tag]
}
