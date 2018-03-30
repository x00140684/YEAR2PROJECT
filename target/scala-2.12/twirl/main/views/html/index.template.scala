
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Index")/*1.15*/{_display_(Seq[Any](format.raw/*1.16*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
  
  <title>Bootstrap Theme Simply Me</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
    <link rel="stylesheet" href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link href=""""),_display_(/*14.16*/routes/*14.22*/.Assets.versioned("stylesheets/main.css")),format.raw/*14.63*/("""" rel="stylesheet" />
</head>
<body>
<!-- First Container -->
<div class="container-fluid bg-1 text-center">
<h2>Welcome to TechCenter</h2>
<p>TechCenter is a online IT shop. On our website, you can find latest realeases of many peripherals provided by top companies such as Nvidia, MSI, Intel and many more. Our website creates a relaible source of PC peripherals as-well as the ability to purchase such items. To find our more about our objective in the IT world, feel free to check-out our <a href="mailto:someone">
  About-Us</a> & <a href="mailto:someone">
  Contact-Us</a> page</p>
<hr>
</div>



<!-- Third Container (Grid) -->
<div class="container-fluid bg-3 text-center">    
  <h2>Our Products</h3><br>
  <div class="row">
    <div class="col-sm-4">
      
      <img src=""""),_display_(/*34.18*/routes/*34.24*/.Assets.versioned("images/processor.png")),format.raw/*34.65*/(""""width="50%">
	  <p>Intel Core i7-2630QM - Processor - 2.9GHz</p>
    </div>
    <div class="col-sm-4"> 
      
      <img src=""""),_display_(/*39.18*/routes/*39.24*/.Assets.versioned("images/card.png")),format.raw/*39.60*/(""""width="60%">
	   <p>Nvidia GTX 1080TI - Graphics Card - 8GB</p>
    </div>
    <div class="col-sm-4"> 
      
      <img src=""""),_display_(/*44.18*/routes/*44.24*/.Assets.versioned("images/ssd.png")),format.raw/*44.59*/(""""width="50%">
	  <p>Samsung Evo - Solid State Disc - 500GB</p>
	  
    </div>
	<hr>
  </div>
</div>

</body>
</html>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 30 22:46:22 IST 2018
                  SOURCE: /home/wdd/webapps/YEAR2PROJECT/year2project/app/views/index.scala.html
                  HASH: 233e037a22f3c2ee826ec563b7349f3a734be23e
                  MATRIX: 1030->1|1051->14|1089->15|1117->17|1842->715|1857->721|1919->762|2751->1567|2766->1573|2828->1614|2989->1748|3004->1754|3061->1790|3221->1923|3236->1929|3292->1964
                  LINES: 33->1|33->1|33->1|34->2|46->14|46->14|46->14|66->34|66->34|66->34|71->39|71->39|71->39|76->44|76->44|76->44
                  -- GENERATED --
              */
          