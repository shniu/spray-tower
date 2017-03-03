package com.digcredit.shniu.spray.actor

import akka.actor.Actor
import spray.routing._
import spray.http._
import MediaTypes._

/**
  * Created by Administrator on 2017/3/3 0003.
  */
class MyServiceActor extends Actor with MyService {

  def actorRefFactory = context

  override def receive = runRoute(MyRoute)
}

trait MyService extends HttpService {

  val MyRoute =
    path("") {
      get {
        respondWithMediaType(`text/html`) {
          complete {
            <html>
              <body>
                <h1>Say hello to <i>spray-routing</i> on <i>spray-can</i>!</h1>
              </body>
            </html>
          }
        }
      }
    }
}
