import React from "react";
import FlightList from "./FlightList";

function GuestGreeting() {
	return (
		<div>
			<h1>Welcome, Guest! Please Sign Up!</h1>
			<FlightList canBrowse={true} />
		</div>
	);
}

export default GuestGreeting;
