package com.digcredit.shniu.scalademo.basic

/**
  * Created by shniu on 2017/3/4.
  *
  * 学习Scala的表达式、语句
  */
object LearnExpression extends App {

  // 语句改变状态，即语句的调用会引起副作用
  // 表达式用于表达（压榨），即它会产生结果
  // scala中一切都是表达式，比如：
  val i = 1; val j = "hello"    // 分号允许我们在一行输入多个语句或表达式
  val z = i + j

  // 可以用大括号把多个表达式括起来
  val c = {
    val c1 = 123
    val cc = "cc"
    c1 + cc
  }
  println(c)   // Output: 123cc

  // 如果表示不产生结果，Scala会使用一种特殊的类型来表示不产生值的表达式：Unit，用 {} 括起来的空集也会返回Unit
  val unitDemo1 = {}
  println(unitDemo1)   // Output: ()

  // Exercise
  val feetPerMile = 5280
  val feetPerMile2: Int = 5280

  val yardsPerMile = feetPerMile2 / 3.0

  2000 / yardsPerMile

  val mileage = {
    val feetPerMile = 5280
    val yardsPerMile = feetPerMile / 3.0
    2000 / yardsPerMile
  }
  println(mileage)  // Output: 1.1363636363636365

  // 条件表达式
  // 条件表达式是要做出选择，需要返回表示是true还是false；
  if (1 > 0) {
    println("It's true!")
  }

  // 还可以这么玩
  val x: Boolean = {i > 0}
  if (x) {
    println("It's true!")
  }

  // 可以用!测试条件表达式的否定情形
  val y: Boolean = {11 > 12}
  if (!y) {
    println("It is false!")
  }

  val zz = false
  if (zz) {
    println("It is true!")
  } else {
    println("It is false!")
  }

  // 整个if条件表达式也是一个表达式，所以它也会产生一个结果
  val result = {
    if (99 > 100) {
      4
    } else { 42 }
  }

  val aa = 1; val bb = 5
  if (aa > bb) {
    println("bb is less than aa")
  } else {
    println("aa is less than bb")
  }

  // 计算顺序
  val kg = 72.57
  val heightM = 1.727

  val bmi = kg / (heightM * heightM)
  if (bmi < 18.5) println("Underweight")
  else if (bmi < 25) println("Normal height")
  else println("Overweight")

  // && 表示 逻辑与， || 表示逻辑或

  val activity = "swimming"
  val hour = 10

  val isOpen = {
    if (activity == "swimming" || activity == "ice skating") {
      val opens = 9
      val closes = 20
      println("Operating houses: " + opens + " - " + closes)

      hour >= opens && hour <= closes
    } else {
      false
    }
  }

  println(isOpen)
}
