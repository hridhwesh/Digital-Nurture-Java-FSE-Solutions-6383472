import React from "react";
import { ListofPlayers, Scorebelow70 } from "./ListOfPlayers";
import {
	OddPlayers,
	EvenPlayers,
	ListofIndianPlayers,
	IndianPlayers,
	indianPlayersList,
} from "./IndianPlayers";

function App() {
	const flag = false;

	if (flag === true) {
		return (
			<div>
				<h1>List of Players</h1>
				<ListofPlayers />
				<hr />
				<h1>List of Players having Scores Less than 70</h1>
				<Scorebelow70 />
			</div>
		);
	} else {
		return (
			<div>
				<h1>Odd Players</h1>
				<OddPlayers team={indianPlayersList} />
				<hr />
				<h1>Even Players</h1>
				<EvenPlayers team={indianPlayersList} />
				<hr />
				<h1>List of Indian Players Merged:</h1>
				<ListofIndianPlayers players={IndianPlayers} />
			</div>
		);
	}
}

export default App;
