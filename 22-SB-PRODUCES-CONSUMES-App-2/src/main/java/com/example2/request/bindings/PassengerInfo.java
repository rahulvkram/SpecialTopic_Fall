package com.example2.request.bindings;

public class PassengerInfo {
	private String passengerName;
	private Integer passengerAge;
	private Integer trainNumber;
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public Integer getPassengerAge() {
		return passengerAge;
	}
	public void setPassengerAge(Integer passengerAge) {
		this.passengerAge = passengerAge;
	}
	public Integer getTrainNumber() {
		return trainNumber;
	}
	public void setTrainNumber(Integer trainNumber) {
		this.trainNumber = trainNumber;
	}
	@Override
	public String toString() {
		return "PassengerInfo [passengerName=" + passengerName + ", passengerAge=" + passengerAge + ", trainNumber="
				+ trainNumber + "]";
	}
	
	
	
}
