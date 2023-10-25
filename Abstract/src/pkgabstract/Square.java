/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgabstract;

/**
 *
 * @author fa20-bse-001
 */
public class Square implements Shape {
   private double side;

   public Square(double side) {
      this.side = side;
   }

   @Override
   public double getArea() {
      return side * side;
   }

   @Override
   public double getPerimeter() {
      return 4 * side;
   }
}
