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
public class DoubleBoundaryFactory {
   public Shape getShape(String shapeType, double... parameters) {
      ShapeFactory shapeFactory = new ShapeFactory();
      Shape shape = shapeFactory.getShape(shapeType, parameters);

      if (shape != null) {
         shape = new DoubleBoundary(shape);
      }

      return shape;
   }
}
