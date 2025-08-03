import React, { useState } from "react";

const flights = [
	{ id: 1, origin: "Kolkata", destination: "Guwahati", price: 4500 },
	{ id: 2, origin: "Mumbai", destination: "Bangalore", price: 3200 },
];

function FlightList({ canBrowse }) {
	const [source, setSource] = useState("");
	const [dest, setDest] = useState("");

	function handleBooked(e) {
		e.preventDefault();
		if (source !== "" && dest !== "") {
			alert(`Ticket booked successfully from ${source} to ${dest}`);
		} else {
			alert("Fill up the details carefully.");
		}
	}

	if (canBrowse) {
		return (
			<div>
				<h2>Available Flights</h2>
				<ul>
					{flights.map((flight) => (
						<li key={flight.id}>
							{flight.origin} to {flight.destination} : Rs. {flight.price}
						</li>
					))}
				</ul>
			</div>
		);
	} else {
		return (
			<div>
				<h2>Book your ticket</h2>
				<form>
					<label
						style={{
							display: "flex",
							alignItems: "flex-start",
						}}>
						Source:{" "}
					</label>
					<input
						value={source}
						onChange={(e) => {
							setSource(e.target.value);
						}}
					/>
					<label
						style={{
							display: "flex",
							alignItems: "flex-start",
						}}>
						Destination:{" "}
					</label>
					<input
						value={dest}
						onChange={(e) => {
							setDest(e.target.value);
						}}
					/>
					<button
						style={{
							display: "flex",
							alignItems: "flex-start",
						}}
						onClick={handleBooked}>
						Book
					</button>
				</form>
			</div>
		);
	}
}

export default FlightList;
