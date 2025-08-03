import React from "react";

const players = [
	{ name: "Jack", score: 50 },
	{ name: "Michael", score: 70 },
	{ name: "John", score: 40 },
	{ name: "Ann", score: 61 },
	{ name: "Elisabeth", score: 61 },
	{ name: "Sachin", score: 95 },
	{ name: "Dhoni", score: 100 },
	{ name: "Virat", score: 84 },
	{ name: "Jadeja", score: 64 },
	{ name: "Raina", score: 75 },
	{ name: "Rohit", score: 80 },
];

function ListofPlayers() {
	return (
		<div>
			{players.map((item, index) => (
				<div key={index}>
					<li>
						Mr. {item.name} <span>{item.score}</span>
					</li>
				</div>
			))}
		</div>
	);
}

function Scorebelow70() {
	const players70 = players.filter((item) => item.score <= 70);
	return (
		<div>
			{players70.map((item, index) => (
				<div key={index}>
					<li>
						Mr. {item.name} <span>{item.score}</span>
					</li>
				</div>
			))}
		</div>
	);
}

export { ListofPlayers, Scorebelow70 };
