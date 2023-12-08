package com.example2.response.bindings;


public class TicketInfo {
	private Integer ticketNumber;
	private Integer ticketPrice;
	private String ticketStatus;
	private String passengerName;
	public Integer getTicketNumber() {
		return ticketNumber;
	}
	public void setTicketNumber(Integer ticketNumber) {
		this.ticketNumber = ticketNumber;
	}
	public Integer getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(Integer ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public String getTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	@Override
	public String toString() {
		return "TicketInfo [ticketNumber=" + ticketNumber + ", ticketPrice=" + ticketPrice + ", ticketStatus="
				+ ticketStatus + ", passengerName=" + passengerName + "]";
	}
	
	

}
