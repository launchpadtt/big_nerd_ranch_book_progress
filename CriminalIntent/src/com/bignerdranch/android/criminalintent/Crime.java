package com.bignerdranch.android.criminalintent;
import java.util.Date;
import java.util.UUID;

public class Crime {
	private UUID mId;
	private String mTitle;
	private Date mDate;
	private boolean mSolved;
	
	public Crime() {
		// Generate unique identifier
		mId = UUID.randomUUID();
		mDate = new Date();
	}

	public String getmTitle() {
		return mTitle;
	}

	public void setmTitle(String mTitle) {
		this.mTitle = mTitle;
	}

	public UUID getmId() {
		return mId;
	}
	
	public Date getDate() {
		return mDate;
	}
	
	public void setDate(Date date) {
		mDate = date;
	}
	
	public boolean isSolved() {
		return mSolved;
	}
	
	public void setSolved(boolean solved) {
		mSolved = solved;
	}
}
