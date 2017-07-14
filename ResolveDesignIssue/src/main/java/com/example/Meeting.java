package com.example;

public class Meeting {

	private Member member;

	public Meeting(Member m) {
		this.member = m;
	}

	public Meeting() {}

	public void discuss() {
		this.member.startWorking();
	}

}