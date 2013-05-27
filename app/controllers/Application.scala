package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {
  
  def index = Action {
    Ok(views.html.index("Hello to John, Paul, and James.  Next time to gather is: May 30th @ John's house to review code we wrote for Functional Programming Principles in Scala."))
  }
  
}
