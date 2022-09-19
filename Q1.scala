object Main{

    case class Point( x:Int, y:Int ){

        def +( point:Point ) : Point = {
            return new Point( this.x+point.x, this.y+point.y )
        }

        def move( distance:Int ) : Point = {
            return this.copy( x=x+distance, y=y+distance )
        }

        def distance( point:Point ) : Double = {
            val distance:Double = scala.math.sqrt( scala.math.pow((this.x-point.x),2) + scala.math.pow((this.y-point.y),2) ).toDouble
            return distance
        }

        def invert() : Point = {
            return this.copy( x=this.y, y=this.x )
        }
    }

    def main(args: Array[String]) = {    
        var p1 = new Point(1,4)
        var p2 = new Point(4,8)
        var p3 = p1.+(p2)
        
        println("\nPoint 1 : (" + p1.x +"," + p1.y + ")")
        println("Point 2 : (" + p2.x +"," + p2.y + ")")
        println("\nAddition of (" + p1.x +"," + p1.y + ") and (" + p2.x +"," + p2.y + ") : \n" + "(" + p3.x +"," + p3.y + ")")
        println("\nMove Point 1 by 4: \n" + "(" + p1.move(4).x +"," + p1.move(4).y + ")")
        println("\nDistance between Point 1 and Point 2 : \n" + p1.distance(p2))
        println("\nInverted Point 1 : \n" + "(" + p1.invert().x +"," + p1.invert().y + ")")
    }
    
}