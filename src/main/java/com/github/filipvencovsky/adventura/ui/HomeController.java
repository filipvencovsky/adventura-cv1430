package com.github.filipvencovsky.adventura.ui;

import com.github.filipvencovsky.adventura.logika.IHra;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/**
 * Kontroler, který zprostředkovává komunikaci mezi grafikou
 * a logikou adventury
 * 
 * @author Filip Vencovsky
 *
 */
public class HomeController extends GridPane {
	
	@FXML private TextField textVstup;
	@FXML private TextArea textVypis;
	private IHra hra;
	
	/**
	 * Metoda čte příkaz ze vstupního textového pole
	 * a zpracuje ho...
	 */
	public void odesliPrikaz() {
//		TODO zpracovat příkaz a vepsat výsledek do výstupní oblasti
		System.out.println(textVstup.getText());
		
	}
	
	public void inicializuj(IHra hra) {
		this.hra = hra;
		textVypis.setText(hra.vratUvitani());
	}

}
