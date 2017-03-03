package com.digcredit.shniu.spray

import akka.actor.{ActorSystem, Props}
import akka.io.IO
import spray.can.Http
import akka.pattern.ask
import akka.util.Timeout
import scala.concurrent.duration._

import com.digcredit.shniu.spray.actor.MyServiceActor

/**
  * Created by Administrator on 2017/3/3 0003.
  */
object Boot extends App {

  // we need an ActorSystem to host our application in
  implicit val system = ActorSystem("spray-tower")

  // create and start our service actor
  val service = system.actorOf(Props[MyServiceActor], "demo-service")

  implicit val timeout = Timeout(5.seconds)

  IO(Http) ? Http.Bind(service, interface = "localhost", port = 8000)
}
