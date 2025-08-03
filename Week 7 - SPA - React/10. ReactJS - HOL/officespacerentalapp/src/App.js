import React from "react";
import "./App.css";

function App() {
	const heading = "Office Space, at Affordable Range";
	const img_link =
		"https://img.freepik.com/free-photo/modern-office-space-interior_158595-5206.jpg";
	const img = (
		<img
			src={img_link}
			style={{ width: "25%", height: "25%" }}
			alt="Office Space"
		/>
	);
	const officeSpaces = [
		{
			name: "TechSpace",
			rent: 70000,
			address: "Howrah",
		},
		{
			name: "EduNet",
			rent: 50000,
			address: "Rajarhat, Kolkata",
		},
		{
			name: "Urban Space",
			rent: 100000,
			address: "Bidhan Nagar, Kolkata",
		},
	];
	return (
		<div className="App">
			<h1>{heading}</h1>
			{img}
			{officeSpaces.map((item) => (
				<>
					<h2>Name: {item.name}</h2>
					<h3 style={{ color: item.rent < 60000 ? "red" : "green" }}>
						Rent: {item.rent}{" "}
					</h3>
					<h3>Address: {item.address} </h3>
				</>
			))}
		</div>
	);
}

export default App;
