package com.camp.Action;

import org.testng.Assert;

import com.camp.Locator.aboutusPageCampLocators;
import com.camp.Locator.homePageCampLocators;
import com.camp.Utility.baseCamp_class;

public class aboutusPageCampActions extends baseCamp_class{
	aboutusPageCampLocators AboutusPageCampLocators = new aboutusPageCampLocators();
	homePageCampLocators HomePageCampLocators = new homePageCampLocators();
	
	public void VerifyvideoisdisplayedinAboutuspage () throws Exception {
		Thread.sleep(3000);
		boolean videodisplayed =  AboutusPageCampLocators.verifyvideo.isDisplayed();
		Assert.assertTrue(videodisplayed);
	}	
	
	public void ClickonPlayvideobuttontoplaythevideo() throws Exception {
		Thread.sleep(6000);
		AboutusPageCampLocators.playvideo.click();
	}
	
	public void ClickonPausebuttontopausethevideo() throws Exception {
		Thread.sleep(3000);
		AboutusPageCampLocators.pausevideo.click();
	}
	
	public void Clickontheclosebuttontoclosethevideo() throws Exception {
		Thread.sleep(3000);
		AboutusPageCampLocators.closevideo.click();
	}
	
	public void Verifythevideoclosessuccessfully() throws Exception {
		Thread.sleep(3000);
		boolean verifyclosevideo = HomePageCampLocators.verifyhomepage.isDisplayed();
		Assert.assertTrue(verifyclosevideo);
	}
}
