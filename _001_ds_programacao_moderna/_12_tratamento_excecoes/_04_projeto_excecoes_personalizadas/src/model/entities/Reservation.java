package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Reservation {

	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;

	// O static é pra que nao precise criar um sdf pra cada objeto que a applicaçao
	// tiver
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	// Se está usando RuntimeException nao precisa propagar
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) /*throws DomainException*/ {
		// No começo do método é boa prática, programaçao defensiva
		if (checkIn.after(checkOut)) {
			throw new DomainException("Check-out date must be after check-in date");
		}
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;

	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public long duration() {
		// checkIn ou checkOut mostra a duraçao em milissegundos, no caso é um long que
		// recebe a diferença entre os dois
		long diff = checkOut.getTime() - checkIn.getTime();
		// Escolhe a data o timeUnit em dias e depois converter, dentro vc passa o
		// tempo, no caso em milissegundos e informa que esta em milissegundos
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}

	public void updateDate(Date checkIn, Date checkOut) /*throws DomainException*/ {

		Date now = new Date();
		// Testa se o checkin é antes ou depois da data estipulada, no caso agora
		if (checkIn.before(now) || checkOut.before(now)) {
			throw new DomainException("Reservation dates for update must be future dates");
		}
		if (checkIn.after(checkOut)) {
			throw new DomainException("Check-out date must be after check-in date");
		}

		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	@Override
	public String toString() {
		return "Room " + roomNumber + ", Check In: " + sdf.format(checkIn) + ", Check Out: " + sdf.format(checkOut)
				+ ", " + duration() + " Nights";

	}

}
