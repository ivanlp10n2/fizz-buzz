package application

import application.FizzBuzzValidator.{evaluate, evaluateRange}
import cats.effect.{IO, IOApp}

import scala.concurrent.duration.DurationInt

object Application extends IOApp.Simple {
  val run = for{
    ctr <- IO.ref(0)

    wait = IO.sleep(1.second)
    poll = wait  *> ctr.get

    _ <- (poll map evaluate map println).foreverM.start

    _ <- (wait *> ctr.update(_ + 1)).foreverM.void
  } yield ()
}
