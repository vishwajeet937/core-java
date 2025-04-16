package com.app.project;

class Student 
{
	private String name;
	private int rollNo;
	private String session;
	private String branch;
	private int redgNo;
	private int totalMarks;
	private String statious;
	private int phyMarks;
	private int cheMarks;
	private int mathMarks;

	public void setName(String name)
	{
		this.name=name;
	}
	public void setRollNo(int rollNo)
	{
		this.rollNo=rollNo;
	}
	public void setSession(String session)
	{
		this.session=session;
	}
	public void setBranch(String branch)
	{
		this.branch=branch;
	}
	public void setRedgNo(int redgNo)
	{
		this.redgNo=redgNo;
	}
	public void setTotalMarks(int totalMarks)
	{
		this.totalMarks=totalMarks;
	}
	public void setStatious(String Statious)
	{
		this.statious=statious;
	}
	public void setPhyMarks(int phyMarks)
	{
		this.phyMarks=phyMarks;
	}
	public void setCheMarks(int cheMarks)
	{
		this.cheMarks=cheMarks;
	}
	public void setMathMarks(int mathMarks)
	{
		this.mathMarks=mathMarks();
	}
	public String getName()
	{
		return this.name;
	}
	public int getRollNo()
	{
		return this.rollNo;
	}
	public String getSession()
	{
		return this.session;
	}
	public String getBranch()
	{
		return this.branch;
	}
	public int getRedgNo()
	{
		return this.totalMarks;
	}
	public int getredgNo()
	{
		return this.redgNo;
	}
	public int getTotalMarks()
	{
		return this.totalMarks;
	}
	public String getStatious()
	{
		return this.statious;
	}
	public int getPhyMarks()
	{
		return this.phyMarks;
	}
	public int getCheMarks()
	{
		return this.cheMarks;
	}
	public int mathMarks()
	{
		return this.mathMarks;
	}
}

