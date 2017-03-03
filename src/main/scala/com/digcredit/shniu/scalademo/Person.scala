package com.digcredit.shniu.scalademo


/**
  * Created by Administrator on 2017/3/3 0003.
  */
// 类默认是public级别的
class Person {

  // 字段必须得初始化, 底层编译器会自动为私有的age添加get和set的公有方法,可以理解为伪public类型
  var age = 18

  // 这个是方法，没有参数可以省略()
  def printAge = age

  def increment() {
    this.age += 1
  }

  // private[this] 只有该类的this可以使用
  private[this] var gender = "male"

  // 声明了private,底层编译器会自动为私有的name添加get和set的私有方法
  private var name = "test"
  // 但是可以自己定义属性方法
  def getName = this.name
  def setName(value: String) {this.name = value}

  // _ 代表某一类型的默认值
  var height: Int = _
  var message: String = _

  def this(height: Int, message: String){
    this()  //
  }
}
