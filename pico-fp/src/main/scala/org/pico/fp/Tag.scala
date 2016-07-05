package org.pico.fp

object Tag {
  @inline def apply[@specialized A, T](a: A): A @@ T = a.asInstanceOf[A @@ T]

  @inline def unwrap[@specialized A, T](a: A @@ T): A = a.asInstanceOf[A]

  final class TagOf[T] private[Tag]() {
    def apply[A](a: A): A @@ T = Tag.apply(a)
  }

  def of[T]: TagOf[T] = new TagOf[T]
}
