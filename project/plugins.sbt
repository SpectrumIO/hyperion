resolvers += "jgit-repo" at "http://download.eclipse.org/jgit/maven"
resolvers += Resolver.bintrayIvyRepo("spectrumlabs", "sbt-plugins")
credentials += (
  for {
    user <- sys.env.get("BINTRAY_USER")
    password <- sys.env.get("BINTRAY_PASS")
  } yield Credentials("Bintray", "dl.bintray.com", user, password)
  )
  .getOrElse(Credentials(Path.userHome / ".ivy2" / ".credentials"))

addSbtPlugin("io.getspectrum" % "sbt-spectrum-defaults" % "0.4.0")

addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "2.3")

addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.1.0")

addSbtPlugin("com.typesafe.sbt" % "sbt-ghpages" % "0.6.2")

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.6")

addSbtPlugin("com.eed3si9n" % "sbt-unidoc" % "0.4.1")

addSbtPlugin("com.typesafe.sbt" % "sbt-site" % "1.3.1")

addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.7.0")
