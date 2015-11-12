import javax.swing.JOptionPane;

public class Classex23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String heightInCM = "";
		double dblheightInCM,dblheightCMtoFeet,dblheightCmtoInchs;
		heightInCM = JOptionPane.showInputDialog("Converter CM to inch and feet");
		dblheightInCM = Double.parseDouble(heightInCM);
		dblheightCMtoFeet = dblheightInCM * 0.39;
		dblheightCmtoInchs = dblheightCMtoFeet * 0.083333333;
		JOptionPane.showMessageDialog(null, dblheightInCM + " CM is " + dblheightCmtoInchs + " Feet and " + dblheightCMtoFeet + " inchs ");
	}

}
