// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/YEAR2PROJECT/year2project/conf/routes
// @DATE:Fri Mar 30 22:11:43 IST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
