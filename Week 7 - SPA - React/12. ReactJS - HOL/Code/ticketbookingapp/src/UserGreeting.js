import React from "react";
import FlightList from "./FlightList";

function UserGreeting() {
	return (
		<div>
			<h1>Welcome Back, User!</h1>
			<FlightList canBrowse={false} />
		</div>
	);
}

export default UserGreeting;
