package Controller;

import java.util.Scanner;

import javax.swing.JFrame;

import Model.Database;
import Model.Operation;
import Model.User;

public class Quit implements Operation {

	public void operation(Database database, Scanner s, User user) {

		System.out.println("Thanks for visiting us!");
		s.close();
		
	}

	@Override
	public void operation(Database database, JFrame f, User user) {
		// TODO Auto-generated method stub
		
	}

}
