package org.pico.fp

sealed trait Ordering {
  def toInt: Int

  def name: String

  def complement: Ordering
}

case object LT extends Ordering {
  override def complement = GT
  override def toInt: Int = -1
  override def name: String = "LT"
}

case object EQ extends Ordering {
  override def complement = EQ
  override def toInt: Int = 0
  override def name: String = "EQ"
}

case object GT extends Ordering {
  override def complement = LT
  override def toInt: Int = 1
  override def name: String = "GT"
}
