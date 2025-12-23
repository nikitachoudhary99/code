package com.ak.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy;
@Entity
@Table(name="bank")
public class Bank {
	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	private int AccNo;
	
  private String Acc;
  private String AccHolder;

  private double Ammount;
		public Bank() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Bank(String acc, String accHolder, int accNo, double ammount) {
			super();
			Acc = acc;
			AccHolder = accHolder;
			AccNo = accNo;
			Ammount = ammount;
		}
		
		public Bank(String acc, String accHolder, double ammount) {
			super();
			Acc = acc;
			AccHolder = accHolder;
			Ammount = ammount;
		}
		public String getAcc() {
			return Acc;
		}
		public void setAcc(String acc) {
			Acc = acc;
		}
		public String getAccHolder() {
			return AccHolder;
		}
		public void setAccHolder(String accHolder) {
			AccHolder = accHolder;
		}
		public int getAccNo() {
			return AccNo;
		}
		public void setAccNo(int accNo) {
			AccNo = accNo;
		}
		public double getAmmount() {
			return Ammount;
		}
		public void setAmmount(double ammount) {
			Ammount = ammount;
		}
		@Override
		public String toString() {
			return "Bank [Acc=" + Acc + ", AccHolder=" + AccHolder + ", AccNo=" + AccNo + ", Ammount=" + Ammount + "]";
		}
		  
}
