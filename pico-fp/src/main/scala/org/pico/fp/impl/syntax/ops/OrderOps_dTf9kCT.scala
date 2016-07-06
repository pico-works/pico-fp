package org.pico.fp.impl.syntax.ops

import org.pico.fp._
import org.pico.fp.syntax.order._

class OrderOps_dTf9kCT[A](val self: A) extends AnyVal {
  @inline
  final def ?|?(that: => A)(implicit ev: Order[A]): Ordering = ev.order(self, that)

  @inline
  final def max(that: => A)(implicit ev: Order[A]): A = {
    self ?|? that match {
      case LT => that
      case EQ => self
      case GT => self
    }
  }

  @inline
  final def min(that: => A)(implicit ev: Order[A]): A = {
    self ?|? that match {
      case LT => self
      case EQ => self
      case GT => that
    }
  }

  @inline
  final def <(that: => A)(implicit ev: Order[A]): Boolean = {
    self ?|? that match {
      case LT => true
      case EQ => false
      case GT => false
    }
  }

  @inline
  final def <=(that: => A)(implicit ev: Order[A]): Boolean = {
    self ?|? that match {
      case LT => true
      case EQ => true
      case GT => false
    }
  }

  @inline
  final def >(that: => A)(implicit ev: Order[A]): Boolean = {
    self ?|? that match {
      case LT => false
      case EQ => false
      case GT => true
    }
  }

  @inline
  final def >=(that: => A)(implicit ev: Order[A]): Boolean = {
    self ?|? that match {
      case LT => false
      case EQ => true
      case GT => true
    }
  }
}