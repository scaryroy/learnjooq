package controllers

import play.api._
import play.api.mvc._

import java.sql.Connection
import java.sql.DriverManager

import org.jooq._
import org.jooq.impl._
import org.jooq.impl.DSL._

class Application extends Controller {

  def index = Action {

    Ok("test3")
  }

}
