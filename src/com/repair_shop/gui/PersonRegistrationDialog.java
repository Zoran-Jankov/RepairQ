package com.repair_shop.gui;

import java.awt.Window;

public abstract class PersonRegistrationDialog extends InputDialog
{
	private static final long serialVersionUID = 3096853250550671073L;
	private PersonalInfoPanel personalInfo = new PersonalInfoPanel();
	
	public PersonRegistrationDialog(Window owner)
	{
		super(owner);
		getContentPane().add(personalInfo);
	}
}