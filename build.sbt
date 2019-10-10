name := """almacen-ivea"""
organization := "mx.gob.ivea"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.13.0"

libraryDependencies += guice

// Enabled database plugin, see doo (https://www.playframework.com/documentation/2.7.x/JavaDatabase)
libraryDependencies += javaJdbc

// msql driver
libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.41"