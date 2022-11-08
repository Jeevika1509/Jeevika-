package com.xworkz.copy.examples.boot;

import com.xworkz.copy.examples.Invitation;
import com.xworkz.copy.examples.WeddingInvitation;

public class InvitationRunner {

	public static void main(String[] args) {

		Invitation invitation=new WeddingInvitation(100,"digital","creme");
		System.out.println(invitation.noOfCopies);
		System.out.println(invitation.cardType);
		System.out.println(invitation.color);
		

	}

}
