package controllers

import play.api._
import play.api.mvc._

import java.sql.Connection
import java.sql.DriverManager

import org.jooq._
import org.jooq.impl._
import org.jooq.impl.DSL._

import models.jooq.Tables._

class Application extends Controller {

  def index = Action {

    val dbUser = "postgres"
    val dbPass = "postgres"
    val dbUrl = "jdbc:postgresql://localhost/learnjooq"

    val conn = DriverManager.getConnection(dbUrl, dbUser, dbPass)

    val create = DSL.using(conn, SQLDialect.POSTGRES)
    val result = (create select (AUTHOR.ID, AUTHOR.FIRSTNAME) from AUTHOR where (AUTHOR.ID lessThan 10)).fetch()

    Ok(result.toString)
  }

}
