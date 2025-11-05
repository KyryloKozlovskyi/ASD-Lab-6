package ie.atu.sw;

import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class PolyPannel extends HBox {
	private Polygon p = new Polygon(); // Create a polygon object

	// Constructor
	public PolyPannel() {
		super();
		draw(); // Initial draw
		super.getChildren().add(p);
		this.setOnMouseClicked(e -> draw()); // Redraw polygon on mouse click
	}

	// Method to draw a polygon with random colors
	public void draw() {
		p.setStroke(Color.color(Math.random(), Math.random(), Math.random())); // Random stroke color
		p.setFill(Color.color(Math.random(), Math.random(), Math.random())); // Random fill color

		// Create a hexagon
		for (int i = 0; i < 6; i++) {
			p.getPoints().addAll(new Double[] { (100 + 50 * Math.cos(i * 2 * Math.PI / 6)),
					(100 + 50 * Math.sin(i * 2 * Math.PI / 6)) });
		}
	}
}
