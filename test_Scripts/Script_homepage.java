package test_Scripts;

import org.testng.annotations.Test;

import generic.Base_Test;
import pom_scripts.meesho;

public class Script_homepage extends Base_Test {

	@Test()
	public void test() {
		meesho m = new meesho(driver);
		m.profile();
	
		m.WomenEthnic();
		m.WomenWestern();
		m.Men();
		m.Kids();
		m.HomeKitchen();
		m.BeautyHealth();
		m.JewelleryAccessories();
		m.BagsFootwear();
		m.Electronics();
		m.Download();
		m.Gorgeous();

	}
}
