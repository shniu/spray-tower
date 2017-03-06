package com.digcredit.shniu.scalademo.basic

/**
  * Created by shniu on 2017/3/4.
  */
object LearnFunction{

  // 方法
  // def functionName(arg1: Type1, arg2: Type2, ...): returnType = {
  //   lines of code
  //   result
  // }

  def multiplyByTwo(x: Int): Int = {
    x * 2
  }

  def main(args: Array[String]): Unit = {
    multiplyByTwo(5)
  }

}
