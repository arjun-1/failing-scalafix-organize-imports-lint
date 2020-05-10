package client

import sttp.client.{DeserializationError, HttpError, NothingT, Response, ResponseAs, ResponseError, basicRequest}

trait Client {
  type A = DeserializationError[Int]
  type B = HttpError
  type C = NothingT[Int]
  type D = Response[Int]
  type E = ResponseAs[Int, Int]
  type F = ResponseError[Int]
  val a = basicRequest
}
