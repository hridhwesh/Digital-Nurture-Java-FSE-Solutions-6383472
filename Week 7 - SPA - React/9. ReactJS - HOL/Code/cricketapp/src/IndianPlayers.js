import React from "react";

export const indianPlayersList = [
	"Sachin1",
	"Dhoni2",
	"Virat3",
	"Rohit4",
	"Yuvraj5",
	"Raina6",
];
const T20Players = ["First Player", "Second Player", "Third Player"];
const RanjiTrophyPlayers = ["Fourth Player", "Fifth Player", "Sixth Player"];
const IndianPlayers = [...T20Players, ...RanjiTrophyPlayers];

export function OddPlayers({ team }) {
	const [first, , third, , fifth] = team;
	return (
		<div>
			<ul>
				<li>First : {first}</li>
				<li>Third : {third}</li>
				<li>Fifth : {fifth}</li>
			</ul>
		</div>
	);
}

export function EvenPlayers({ team }) {
	const [, second, , fourth, , sixth] = team;
	return (
		<div>
			<ul>
				<li>Second : {second}</li>
				<li>Fourth : {fourth}</li>
				<li>Sixth : {sixth}</li>
			</ul>
		</div>
	);
}

export function ListofIndianPlayers({ players }) {
	return (
		<div>
			<ul>
				{players.map((player, index) => (
					<li key={index}>Mr. {player}</li>
				))}
			</ul>
		</div>
	);
}

export { IndianPlayers };
