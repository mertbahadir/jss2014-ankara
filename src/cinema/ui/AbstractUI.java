package cinema.ui;

import java.util.Collection;
import java.util.Scanner;

import cinema.model.Theater;

public abstract class AbstractUI {
	
	protected void listTheaters(Collection<Theater> theaters){
		for (Theater theater : theaters) {
			System.out.println(theater.getName()+": "+theater.getRows()+"x"+theater.getCols());
		}
	}
	
	protected String showMenuAndGetSelection(Scanner scanner){
		showMenu();
		return scanner.nextLine();
	}

	protected abstract void showMenu();
}
