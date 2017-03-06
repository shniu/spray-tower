package com.digcredit.shniu.scalademo.basic

/**
  * Created by shniu on 2017/3/4.
  */
object ChapterOneSummary extends App {

  // val name: type = initialization   一旦使用val赋值后，是不能改变的，也就是说val定义的是一个常量
  // scala 的类型推断是根据初始化代码的类型自动确定的
  // 所以下面的代码是等效的
  val daysOfMonth = 20
  val daysOfMonth2: Int = 20

  // 变量的定义使用var，是可以被修改的
  var hoursSpent = 20
  hoursSpent = 35   // 正确
  // hoursSpent = 30.5   // 错误


}
