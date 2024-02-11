import java.awt.Color;

import ecs100.*;

public class DrawCar {
	
	public DrawCar() {
		UI.addButton("Draw Basic", this::basicCar);
		UI.addButton("Customize Car", this::drawCustom);
		UI.addButton("Drive!", this::driveCar);
		UI.addButton("Clear", UI::clearGraphics);
		UI.setMouseMotionListener(this::Vroom);
	}
	public void drawCustom() {
		int Length = UI.askInt("Enter length of Car");
		int Height = UI.askInt("Enter height of car");
		int x = UI.askInt("Enter x co-ordinate");
		int y = UI.askInt("Enter y co-ordinate");
		/**Draw bottom rectangle of car*/
			this.setLowerBodyColour();
			UI.drawRect(x, y, Length, Height);
			UI.fillRect(x, y, Length, Height);
		/**Draw top rectangle of car*/
			this.settopBodyColour();
			UI.drawRect(x+Length/4, y-Height, Length/2, Height);
			UI.fillRect(x+Length/4, y-Height, Length/2, Height);
			/**Draw Window*/
			UI.setColor(Color.black);
			UI.drawRect(x+(Length/4)+5, y-Height+4, Length*0.45, Height*0.9);
			UI.setColor(Color.white);
			UI.fillRect(x+(Length/4)+5, y-Height+4, Length*0.45, Height*0.9);
		/**Draw 2x outer wheels of car*/
			this.setWheelColour();
			UI.drawOval(x, y+Height*0.6, Length/5, Length/5); //Draw back wheel
			UI.drawOval(x+(Length-50), y+Height*0.6, Length/5, Length/5); //Draw front wheel/
			UI.fillOval(x+(Length-50), y+Height*0.6, Length/5, Length/5);//Fill front wheel
			UI.fillOval(x, y+Height*0.6, Length/5, Length/5);//Fill back wheel
		/**Draw 2x inner wheel*/
			UI.setColor(Color.black);
			UI.drawOval(x+4, y+Height*0.65, Length/6, Length/6);//Draw front wheel
			UI.drawOval(x+(Length-46),y+Height*0.65, Length/6, Length/6);//Draw back wheel
			UI.setColor(Color.white);
			UI.fillOval(x+4, y+Height*0.65, Length/6, Length/6);//Fill front wheel
			UI.fillOval(x+(Length-46), y+Height*0.65, Length/6, Length/6);//Fill back wheel
	}
	public void driveCar() {
		int y = 200;
		int Length = 200;
		int Height = 50;
		for(int x=50; x<200; x++) {
		UI.drawRect(x, y, Length, Height);//Draw Bottom rectangle
		UI.fillRect(x, y, Length, Height);
		UI.drawRect(x+Length/4, y-Height, Length/2, Height);//Draw Top rectangle
		UI.fillRect(x+Length/4, y-Height, Length/2, Height);
		/**Draw outer wheels*/
		UI.drawOval(x, y+Height*0.6, Length/5, Length/5); //Draw back wheel
		UI.drawOval(x+(Length-50), y+Height*0.6, Length/5, Length/5); //Draw front wheel/
		UI.fillOval(x+(Length-50), y+Height*0.6, Length/5, Length/5);//Fill front wheel
		UI.fillOval(x, y+Height*0.6, Length/5, Length/5);//Fill back wheel
		/**Draw inner wheels*/
		UI.drawOval(x+4, y+Height*0.65, Length/6, Length/6);//Draw front wheel
		UI.drawOval(x+(Length-46),y+Height*0.65, Length/6, Length/6);//Draw back wheel
		UI.setColor(Color.white);
		UI.fillOval(x+4, y+Height*0.65, Length/6, Length/6);//Fill front wheel
		UI.fillOval(x+(Length-46), y+Height*0.65, Length/6, Length/6);//Fill back wheel
		/**Draw Window*/
		UI.setColor(Color.black);
		UI.drawRect(x+(Length/4)+5, y-Height+4, Length*0.45, Height*0.9);
		UI.setColor(Color.white);
		UI.fillRect(x+(Length/4)+5, y-Height+4, Length*0.45, Height*0.9);
		UI.clearGraphics();
	}
	}
	
	public void basicCar() {
		int x = 50;
		int y = 200;
		int Length = 200;
		int Height = 50;
		UI.drawRect(x, y, Length, Height);//Draw Bottom rectangle
		UI.fillRect(x, y, Length, Height);
		UI.drawRect(x+Length/4, y-Height, Length/2, Height);//Draw Top rectangle
		UI.fillRect(x+Length/4, y-Height, Length/2, Height);
		/**Draw outer wheels*/
		UI.drawOval(x, y+Height*0.6, Length/5, Length/5); //Draw back wheel
		UI.drawOval(x+(Length-50), y+Height*0.6, Length/5, Length/5); //Draw front wheel/
		UI.fillOval(x+(Length-50), y+Height*0.6, Length/5, Length/5);//Fill front wheel
		UI.fillOval(x, y+Height*0.6, Length/5, Length/5);//Fill back wheel
		/**Draw inner wheels*/
		UI.drawOval(x+4, y+Height*0.65, Length/6, Length/6);//Draw front wheel
		UI.drawOval(x+(Length-46),y+Height*0.65, Length/6, Length/6);//Draw back wheel
		UI.setColor(Color.white);
		UI.fillOval(x+4, y+Height*0.65, Length/6, Length/6);//Fill front wheel
		UI.fillOval(x+(Length-46), y+Height*0.65, Length/6, Length/6);//Fill back wheel
		/**Draw Window*/
		UI.setColor(Color.black);
		UI.drawRect(x+(Length/4)+5, y-Height+4, Length*0.45, Height*0.9);
		UI.setColor(Color.white);
		UI.fillRect(x+(Length/4)+5, y-Height+4, Length*0.45, Height*0.9);
	}
	
	public void Vroom(String yes, double x, double y) {
		Color mack = new Color((int)(Math.random()*(1<<24)));
	this.drawVroom(x, y, mack);
	}
	public void drawVroom(double x, double y, Color mack) {
		int Length = 200;
		int Height = 50;
		UI.setColor(mack);
		UI.drawRect(x, y, Length, Height);//Draw Bottom rectangle
		UI.fillRect(x, y, Length, Height);
		UI.drawRect(x+Length/4, y-Height, Length/2, Height);//Draw Top rectangle
		UI.fillRect(x+Length/4, y-Height, Length/2, Height);
		/**Draw outer wheels*/
		UI.setColor(Color.red);
		UI.drawOval(x, y+Height*0.6, Length/5, Length/5); //Draw back wheel
		UI.drawOval(x+(Length-50), y+Height*0.6, Length/5, Length/5); //Draw front wheel/
		UI.fillOval(x+(Length-50), y+Height*0.6, Length/5, Length/5);//Fill front wheel
		UI.fillOval(x, y+Height*0.6, Length/5, Length/5);//Fill back wheel
		/**Draw inner wheels*/
		UI.setColor(Color.yellow);
		UI.drawOval(x+4, y+Height*0.65, Length/6, Length/6);//Draw front wheel
		UI.drawOval(x+(Length-46),y+Height*0.65, Length/6, Length/6);//Draw back wheel
		UI.setColor(Color.white);
		UI.fillOval(x+4, y+Height*0.65, Length/6, Length/6);//Fill front wheel
		UI.fillOval(x+(Length-46), y+Height*0.65, Length/6, Length/6);//Fill back wheel
		/**Draw Window*/
		UI.setColor(Color.black);
		UI.drawRect(x+(Length/4)+5, y-Height+4, Length*0.45, Height*0.9);
		UI.setColor(Color.white);
		UI.fillRect(x+(Length/4)+5, y-Height+4, Length*0.45, Height*0.9);
	}
	public void setWheelColour() {
		String c2 = UI.askString("Choose colour of Wheels" + "\n" + "Color must be red, black, blue, green, or yellow");	
		if(c2.equals("red")) {
			UI.setColor(Color.red);
		}
		else if(c2.equals("black")) {
		UI.setColor(Color.black);
		}
		else if(c2.equals("blue")) {
		UI.setColor(Color.blue);
		}
		else if(c2.equals("green")) {
			UI.setColor(Color.green);
		}
		else if (c2.equals("yellow")) {
			UI.setColor(Color.yellow);
		}
		else {
			UI.println("Invalid Colour. Please restart again and choose either red, black, blue, green, or yellow");
		}
		}
	public void settopBodyColour() {
		String c1 = UI.askString("Choose colour for top of Body" + "\n" + "Color must be red, black, blue, green, or yellow");
		if(c1.equals("red")) {
			UI.setColor(Color.red);
		}
		else if(c1.equals("black")) {
		UI.setColor(Color.black);
		}
		else if(c1.equals("blue")) {
		UI.setColor(Color.blue);
		}
		else if(c1.equals("green")) {
			UI.setColor(Color.green);
		}
		else if (c1.equals("yellow")) {
			UI.setColor(Color.yellow);
		}
		else {
			UI.println("Invalid Colour. Please restart again and choose either red, black, blue, green, or yellow");
		}
		}
	public void setLowerBodyColour() {
		String c1 = UI.askString("Choose colour for bottom of Body" + "\n" + "Color must be red, black, blue, green, or yellow");	
		if(c1.equals("red")) {
			UI.setColor(Color.red);
		}
		else if(c1.equals("black")) {
		UI.setColor(Color.black);
		}
		else if(c1.equals("blue")) {
		UI.setColor(Color.blue);
		}
		else if(c1.equals("green")) {
			UI.setColor(Color.green);
		}
		else if (c1.equals("yellow")) {
			UI.setColor(Color.yellow);
		}
		else {
			UI.println("Invalid Colour. Please restart again choose either red, black, blue, green, or yellow");
		}
		}

	
	public static void main(String[] args) {
		UI.initialise();
		new DrawCar();
	}

}
